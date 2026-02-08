import { ChangeDetectorRef, Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator, PageEvent } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { finalize, forkJoin } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { PartyService } from 'src/app/services/oms/party/party.service';
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
  locationSeqIdFilter = '';
  locationNameFilter = '';
  locationPageSize = 10;
  locationPageIndex = 0;
  locationTotal = 0;

  constructor(
    private facilityService: FacilityService,
    private partyService: PartyService,
    private commonService: CommonService,
    private route: ActivatedRoute,
    private dialog: MatDialog,
    private cdr: ChangeDetectorRef
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
        setTimeout(() => {
          this.facilityTypeMap = new Map(
            list.map((type: any) => [
              type.facilityTypeId,
              type.description || type.facilityTypeId
            ])
          );
          if (this.facilityDetail?.facilityTypeId) {
            this.facilityTypeLabel = this.facilityTypeMap.get(this.facilityDetail.facilityTypeId);
          }
          this.cdr.markForCheck();
        }, 0);
      },
    });
  }

  loadGeoMap(): void {
    this.commonService.getGeos().subscribe({
      next: (geos) => {
        const list = Array.isArray(geos) ? geos : [];
        setTimeout(() => {
          this.geoMap = new Map(
            list.map((geo: any) => [
              geo.geoId,
              geo.geoName || geo.geoId,
            ])
          );
          this.cdr.markForCheck();
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.geoMap = new Map();
          this.cdr.markForCheck();
        }, 0);
      },
    });
  }

  loadLocationTypes(): void {
    this.commonService.getEnumTypes('FACLOC_TYPE').subscribe({
      next: (types) => {
        const list = Array.isArray(types) ? types : [];
        setTimeout(() => {
          this.locationTypeMap = new Map(
            list.map((item: any) => [
              item.enumId,
              item.description || item.enumId,
            ])
          );
          this.cdr.markForCheck();
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.locationTypeMap = new Map();
          this.cdr.markForCheck();
        }, 0);
      },
    });
  }

  getFacility(facilityId: string): void {
    setTimeout(() => {
      this.isLoading = true;
      this.cdr.markForCheck();
    }, 0);
    this.facilityService.getFacility(facilityId)
      .subscribe({
        next: (response) => {
          setTimeout(() => {
            this.facilityDetail = response?.facility || response;
            this.facilityTypeLabel = this.facilityTypeMap.get(this.facilityDetail?.facilityTypeId);
            this.locations = [];
            this.dataSource.data = [];
            this.locationPageIndex = 0;
            this.locationTotal = 0;
            this.loadFacilityAddress(facilityId);
            this.loadLocations();
            this.isLoading = false;
            this.cdr.markForCheck();
          }, 0);
        },
        error: () => {
          setTimeout(() => {
            this.facilityDetail = null;
            this.locations = [];
            this.dataSource.data = [];
            this.locationTotal = 0;
            this.facilityAddress = null;
            this.isLoading = false;
            this.cdr.markForCheck();
          }, 0);
        },
      });
  }

  loadLocations(): void {
    if (!this.facilityId) {
      return;
    }
    this.facilityService.getFacilityLocations(
      this.facilityId,
      this.locationPageIndex,
      this.locationPageSize,
      this.locationSeqIdFilter,
      this.locationNameFilter
    ).subscribe({
      next: (response) => {
        const list = response?.content || [];
        setTimeout(() => {
          this.locations = list;
          this.dataSource.data = list;
          this.locationTotal = response?.totalElements ?? list.length;
          if (this.paginator) {
            this.paginator.length = this.locationTotal;
          }
          this.cdr.markForCheck();
        }, 0);
      },
      error: () => {
        setTimeout(() => {
          this.locations = [];
          this.dataSource.data = [];
          this.locationTotal = 0;
          this.cdr.markForCheck();
        }, 0);
      },
    });
  }

  applyLocationFilters(): void {
    this.locationPageIndex = 0;
    this.loadLocations();
  }

  clearLocationFilters(): void {
    this.locationSeqIdFilter = '';
    this.locationNameFilter = '';
    this.locationPageIndex = 0;
    this.loadLocations();
  }

  onLocationPage(event: PageEvent): void {
    this.locationPageIndex = event.pageIndex;
    this.locationPageSize = event.pageSize;
    this.loadLocations();
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
          setTimeout(() => {
            this.facilityAddress = null;
            this.cdr.markForCheck();
          }, 0);
          return;
        }
        this.partyService.getPostalAddressByContactMechId(contactMechId).subscribe({
          next: (address) => {
            setTimeout(() => {
              this.facilityAddress = address;
              this.cdr.markForCheck();
            }, 0);
          },
          error: () => {
            setTimeout(() => {
              this.facilityAddress = null;
              this.cdr.markForCheck();
            }, 0);
          },
        });
      },
      error: () => {
        setTimeout(() => {
          this.facilityAddress = null;
          this.cdr.markForCheck();
        }, 0);
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
