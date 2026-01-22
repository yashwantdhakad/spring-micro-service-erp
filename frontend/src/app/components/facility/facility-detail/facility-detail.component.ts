import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { finalize } from 'rxjs';
import { FacilityService } from 'src/app/services/facility/facility.service';
import { FacilityLocationDialogComponent } from '../facility-location-dialog/facility-location-dialog.component';

@Component({
  selector: 'app-facility-detail',
  templateUrl: './facility-detail.component.html',
  styleUrls: ['./facility-detail.component.css']
})
export class FacilityDetailComponent implements OnInit {
  isLoading = false;
  facilityId: string | undefined;
  facilityDetail: any;
  locations: any[] = [];
  dataSource = new MatTableDataSource<any>();
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  locationColumns: string[] = ['location_seq_id', 'area_id', 'actions'];

  constructor(
    private facilityService: FacilityService,
    private route: ActivatedRoute,
    private dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.facilityId = params['facilityId'];
      if (this.facilityId) {
        this.getFacility(this.facilityId);
      }
    });
  }

  getFacility(facilityId: string): void {
    this.isLoading = true;
    this.facilityService.getFacility(facilityId)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: (response) => {
          this.facilityDetail = response;
          this.locations = response?.locations || [];
          this.dataSource.data = this.locations;
          if (this.paginator) {
            this.dataSource.paginator = this.paginator;
          }
        },
        error: () => {
          this.facilityDetail = null;
          this.locations = [];
          this.dataSource.data = [];
        },
      });
  }

  openLocationDialog(location?: any): void {
    const dialogRef = this.dialog.open(FacilityLocationDialogComponent, {
      width: '400px',
      data: { facility_id: this.facilityId, ...(location || {}) },
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
}
