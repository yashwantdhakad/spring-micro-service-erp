import { Component, OnInit } from '@angular/core';
import { finalize } from 'rxjs';
import { FacilityService } from 'src/app/services/facility/facility.service';

@Component({
  selector: 'app-facility',
  templateUrl: './facility.component.html',
  styleUrls: ['./facility.component.css']
})
export class FacilityComponent implements OnInit {
  isLoading = false;
  items: any[] = [];
  displayedColumns: string[] = ['facility_id', 'facility_name', 'facility_type_id', 'owner_party_id'];

  constructor(private facilityService: FacilityService) {}

  ngOnInit(): void {
    this.loadFacilities();
  }

  loadFacilities(): void {
    this.isLoading = true;
    this.facilityService.getFacilities()
      .pipe(finalize(() => this.isLoading = false))
      .subscribe({
        next: (data: any) => {
          this.items = Array.isArray(data) ? data : [];
        },
        error: () => {
          this.items = [];
        }
      });
  }
}
