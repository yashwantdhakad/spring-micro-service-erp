import { Injectable } from '@angular/core';
import { MatSnackBar, MatSnackBarConfig } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root',
})
export class SnackbarService {
  private defaultConfig: MatSnackBarConfig = {
    duration: 2000,
    horizontalPosition: 'center',
    verticalPosition: 'top',
  };

  constructor(private snackBar: MatSnackBar) {}

  /**
   * Shows a success message in a snack bar.
   * @param message - The message to display.
   * @param config - Optional custom configuration for the snack bar.
   */
  showSuccess(message: string, config?: MatSnackBarConfig): void {
    this.showMessage(message, { ...this.defaultConfig, panelClass: ['primary'], ...config });
  }

  /**
   * Shows an error message in a snack bar.
   * @param message - The message to display.
   * @param config - Optional custom configuration for the snack bar.
   */
  showError(message: string, config?: MatSnackBarConfig): void {
    this.showMessage(message, { ...this.defaultConfig, panelClass: ['warn'], ...config });
  }

  /**
   * Shows a message in a snack bar with custom configuration.
   * @param message - The message to display.
   * @param config - Custom configuration for the snack bar.
   */
  private showMessage(message: string, config: MatSnackBarConfig): void {
    this.snackBar.open(message, 'Close', config);
  }
}
