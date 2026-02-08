import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormControl } from '@angular/forms';
import { PartyService } from 'src/app/services/oms/party/party.service'; // Replace with your service path

@Component({
  standalone: false,
  selector: 'app-customer-auto-complete',
  templateUrl: './customer-auto-complete.component.html',
  styleUrls: ['./customer-auto-complete.component.css'],
})
export class CustomerAutoCompleteComponent {
  @Input()
  value!: string | number;
  @Input()
  loading!: boolean;
  @Output() valueChange = new EventEmitter<string | number>();

  selectedCustomer: any;
  customerCtrl = new FormControl();
  filteredCustomers: any[] = [];
  customers: any[] = [];

  constructor(private partyService: PartyService) {}

  onCustomerSelected(customer: any): void {
    const { id } = customer || {};
    this.value = id || null;
    this.valueChange.emit(this.value);
  }
}
