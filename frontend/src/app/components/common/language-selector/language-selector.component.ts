import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

interface LanguageOption {
  code: string;
  label: string;
}

@Component({
  selector: 'app-language-selector',
  templateUrl: './language-selector.component.html',
  styleUrls: ['./language-selector.component.css'],
})
export class LanguageSelectorComponent {
  selectedLanguage: string;
  languages: LanguageOption[];

  constructor(
    public dialogRef: MatDialogRef<LanguageSelectorComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { current: string; languages: LanguageOption[] }
  ) {
    this.languages = data?.languages || [];
    this.selectedLanguage = data?.current || (this.languages[0]?.code ?? 'en');
  }

  apply(): void {
    this.dialogRef.close(this.selectedLanguage);
  }
}
