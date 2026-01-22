import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { finalize } from 'rxjs';
import { FacilityService } from 'src/app/services/facility/facility.service';

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
  isLoading = false;
  form: FormGroup;
  facilityTypes: any[] = [];

  constructor(
    private fb: FormBuilder,
    private facilityService: FacilityService,
    private router: Router
  ) {
    this.form = this.fb.group({
      facility_id: ['', Validators.required],
      facility_name: ['', Validators.required],
      facility_type_id: [''],
      owner_party_id: [''],
    });
  }

  ngOnInit(): void {
    this.facilityService.getFacilityTypes().subscribe({
      next: (types) => (this.facilityTypes = types),
      error: () => (this.facilityTypes = []),
    });
  }

  submit(): void {
    if (this.form.invalid) return;
    this.isLoading = true;
    this.facilityService
      .createFacility(this.form.value)
      .pipe(finalize(() => (this.isLoading = false)))
      .subscribe({
        next: () => this.router.navigate(['/facilities']),
        error: () => {
          // handle error silently for now
        },
      });
  }
}

