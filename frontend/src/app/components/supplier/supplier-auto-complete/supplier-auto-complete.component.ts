// autocomplete.component.ts
import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Observable } from 'rxjs';
import { startWith, switchMap, map } from 'rxjs/operators';
import { PartyService } from 'src/app/services/party/party.service';

@Component({
  selector: 'app-supplier-auto-complete',
  templateUrl: './supplier-auto-complete.component.html',
  styleUrls: ['./supplier-auto-complete.component.css']
})
export class SupplierAutoCompleteComponent implements OnInit {
  countryCtrl = new FormControl();
  filteredSuppliers$: Observable<string[]> | undefined;

  constructor(private partyService: PartyService) {}

  ngOnInit() {
    this.filteredSuppliers$ = this.countryCtrl.valueChanges.pipe(
      startWith(''),
      switchMap((value) => this.partyService.getSuppliers(0, value)),
    );
  }
}

