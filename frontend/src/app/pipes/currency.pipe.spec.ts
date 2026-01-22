import { CurrencyPipe } from './currency.pipe';

describe('CurrencyPipe', () => {
  let pipe: CurrencyPipe;

  beforeEach(() => {
    pipe = new CurrencyPipe();
  });

  it('should create an instance', () => {
    expect(pipe).toBeTruthy();
  });

  it('should format number as currency with default settings', () => {
    const result = pipe.transform(1234.5);
    expect(result).toBe('$1,234.50');
  });

  it('should format number as currency with custom currency code', () => {
    const result = pipe.transform(1234.5, 'EUR');
    expect(result).toBe('€1,234.50');
  });

  it('should format number as currency with custom locale', () => {
    const result = pipe.transform(1234.5, 'USD', 'de-DE');
    expect(result).toBe('1.234,50 $');
  });

  it('should format string number as currency', () => {
    const result = pipe.transform('1234.5');
    expect(result).toBe('$1,234.50');
  });

  it('should handle null value gracefully', () => {
    const result = pipe.transform(null);
    expect(result).toBe('$0.00');
  });

  it('should handle undefined value gracefully', () => {
    const result = pipe.transform(undefined);
    expect(result).toBe('$0.00');
  });

  it('should handle non-numeric string gracefully', () => {
    const result = pipe.transform('abc');
    expect(result).toBe('$0.00');
  });

  it('should handle NaN value gracefully', () => {
    const result = pipe.transform(NaN);
    expect(result).toBe('$0.00');
  });

  it('should format negative numbers correctly', () => {
    const result = pipe.transform(-1234.5);
    expect(result).toBe('-$1,234.50');
  });

  it('should format zero value correctly', () => {
    const result = pipe.transform(0);
    expect(result).toBe('$0.00');
  });

  it('should format large numbers correctly', () => {
    const result = pipe.transform(123456789.123);
    expect(result).toBe('$123,456,789.12');
  });
});
