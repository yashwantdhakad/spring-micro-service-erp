import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'currency',
})
export class CurrencyPipe implements PipeTransform {
  transform(
    value: number | string | null | undefined,
    currencyCode: string = 'USD',
    locale: string = 'en-US'
  ): string {
    // Convert value to a number or default to 0 if conversion is not possible
    const numericValue = isNaN(Number(value)) ? 0 : Number(value);

    // Format the number as currency
    return new Intl.NumberFormat(locale, {
      style: 'currency',
      currency: currencyCode,
    }).format(numericValue);
  }
}
