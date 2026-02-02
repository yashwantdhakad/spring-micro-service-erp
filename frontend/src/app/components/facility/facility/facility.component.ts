import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { forkJoin } from 'rxjs';
import { CommonService } from 'src/app/services/common/common.service';
import { FacilityService } from 'src/app/services/facility/facility.service';

@Component({
  standalone: false,
  selector: 'app-facility',
  templateUrl: './facility.component.html',
  styleUrls: ['./facility.component.css']
})
export class FacilityComponent implements OnInit {
  isLoading = false;
  items: any[] = [];
  facilityTypeMap = new Map<string, string>();
  displayedColumns: string[] = ['facilityId', 'facilityName', 'facilityTypeId', 'ownerPartyId'];

  constructor(
    private facilityService: FacilityService,
    private commonService: CommonService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.loadFacilities();
  }

  loadFacilities(): void {
    this.isLoading = true;
    forkJoin({
      facilities: this.facilityService.getFacilities(),
      types: this.facilityService.getFacilityTypes(),
    })
      .subscribe({
        next: ({ facilities, types }) => {
          const typeList = Array.isArray(types) ? types : [];
          this.facilityTypeMap = new Map(
            typeList.map((type: any) => [
              type.facilityTypeId,
              type.description || type.facilityTypeId,
            ])
          );
          this.items = Array.isArray(facilities) ? facilities : [];
          this.isLoading = false;
          this.cdr.detectChanges();
        },
        error: () => {
          this.items = [];
          this.facilityTypeMap = new Map();
          this.isLoading = false;
          this.cdr.detectChanges();
        }
      });
  }

  getFacilityTypeDescription(facilityTypeId?: string): string {
    if (!facilityTypeId) {
      return '';
    }
    return this.facilityTypeMap.get(facilityTypeId) || facilityTypeId;
  }
}
