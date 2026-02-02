import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { finalize, forkJoin } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { PartyService } from 'src/app/services/party/party.service';
import { FacilityLocationDialogComponent } from '../facility-location-dialog/facility-location-dialog.component';

@Component({
  standalone: false,
  selector: 'app-facility-detail',
  templateUrl: './facility-detail.component.html',
  styleUrls: ['./facility-detail.component.css']
})
export class FacilityDetailComponent implements OnInit {
  isLoading = false;
  facilityId: string | undefined;
  facilityDetail: any;
  facilityAddress: any;
  facilityTypeLabel: string | undefined;
  facilityTypeMap = new Map<string, string>();
  geoMap = new Map<string, string>();
  locationTypeMap = new Map<string, string>();
  locations: any[] = [];
  dataSource = new MatTableDataSource<any>();
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  locationColumns: string[] = ['locationSeqId', 'locationType', 'areaId', 'actions'];

  constructor(
    private facilityService: FacilityService,
    private partyService: PartyService,
    private commonService: CommonService,
    private route: ActivatedRoute,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.loadFacilityTypes();
    this.loadGeoMap();
    this.loadLocationTypes();
    this.route.params.subscribe(params => {
      this.facilityId = params['facilityId'];
      if (this.facilityId) {
        this.getFacility(this.facilityId);
      }
    });
  }

  loadFacilityTypes(): void {
    this.facilityService.getFacilityTypes().subscribe({
      next: (types) => {
        const list = Array.isArray(types) ? types : [];
        this.facilityTypeMap = new Map(
          list.map((type: any) => [
            type.facilityTypeId,
            type.description || type.facilityTypeId
          ])
        );
        if (this.facilityDetail?.facilityTypeId) {
          this.facilityTypeLabel = this.facilityTypeMap.get(this.facilityDetail.facilityTypeId);
        }
      },
    });
  }

  loadGeoMap(): void {
    this.commonService.getGeos().subscribe({
      next: (geos) => {
        const list = Array.isArray(geos) ? geos : [];
        this.geoMap = new Map(
          list.map((geo: any) => [
            geo.geoId,
            geo.geoName || geo.geoId,
          ])
        );
      },
      error: () => {
        this.geoMap = new Map();
      },
    });
  }

  loadLocationTypes(): void {
    this.commonService.getEnumTypes('FACLOC_TYPE').subscribe({
      next: (types) => {
        const list = Array.isArray(types) ? types : [];
        this.locationTypeMap = new Map(
          list.map((item: any) => [
            item.enumId,
            item.description || item.enumId,
          ])
        );
      },
      error: () => {
        this.locationTypeMap = new Map();
      },
    });
  }

  getFacility(facilityId: string): void {
    this.isLoading = true;
    this.facilityService.getFacility(facilityId)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          this.facilityDetail = response?.facility || response;
          this.facilityTypeLabel = this.facilityTypeMap.get(this.facilityDetail?.facilityTypeId);
          this.locations = response?.locations || [];
          this.dataSource.data = this.locations;
          if (this.paginator) {
            this.dataSource.paginator = this.paginator;
          }
          this.loadFacilityAddress(facilityId);
        },
        error: () => {
          this.facilityDetail = null;
          this.locations = [];
          this.dataSource.data = [];
          this.facilityAddress = null;
        },
      });
  }

  loadFacilityAddress(facilityId: string): void {
    forkJoin({
      contactMechs: this.facilityService.getFacilityContactMechs(facilityId),
      purposes: this.facilityService.getFacilityContactMechPurposes(facilityId),
    }).subscribe({
      next: ({ contactMechs, purposes }) => {
        const mechList = Array.isArray(contactMechs) ? contactMechs : [];
        const purposeList = Array.isArray(purposes) ? purposes : [];
        const purposeMap = new Map<string, string[]>();
        purposeList.forEach((purpose: any) => {
          const list = purposeMap.get(purpose.contactMechId) || [];
          list.push(purpose.contactMechPurposeTypeId);
          purposeMap.set(purpose.contactMechId, list);
        });

        const preferredPurposeOrder = ['SHIPPING_LOCATION', 'PRIMARY_LOCATION', 'SHIP_ORIG_LOCATION'];
        let contactMechId: string | undefined;
        for (const purpose of preferredPurposeOrder) {
          const match = mechList.find((mech: any) =>
            (purposeMap.get(mech.contactMechId) || []).includes(purpose)
          );
          if (match?.contactMechId) {
            contactMechId = match.contactMechId;
            break;
          }
        }
        if (!contactMechId && mechList.length) {
          contactMechId = mechList[0].contactMechId;
        }
        if (!contactMechId) {
          this.facilityAddress = null;
          return;
        }
        this.partyService.getPostalAddressByContactMechId(contactMechId).subscribe({
          next: (address) => {
            this.facilityAddress = address;
          },
          error: () => {
            this.facilityAddress = null;
          },
        });
      },
      error: () => {
        this.facilityAddress = null;
      },
    });
  }

  openLocationDialog(location?: any): void {
    const dialogRef = this.dialog.open(FacilityLocationDialogComponent, {
      width: '400px',
      data: { facilityId: this.facilityId, ...(location || {}) },
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        const request = result.id
          ? this.facilityService.updateFacilityLocation(result.id, result)
          : this.facilityService.createFacilityLocation(result);
        request.subscribe(() => {
          if (this.facilityId) {
            this.getFacility(this.facilityId);
          }
        });
      }
    });
  }

  getGeoLabel(geoId?: string): string {
    if (!geoId) {
      return '';
    }
    return this.geoMap.get(geoId) || geoId;
  }

  getLocationTypeLabel(locationTypeEnumId?: string): string {
    if (!locationTypeEnumId) {
      return '';
    }
    return this.locationTypeMap.get(locationTypeEnumId) || locationTypeEnumId;
  }
}
