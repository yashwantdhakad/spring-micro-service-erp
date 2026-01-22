import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class NavigationService {
  private readonly LAST_URL_KEY = 'lastUrl';
  private lastUrl: string;

  constructor() {
    // Initialize the lastUrl from local storage if available
    this.lastUrl = localStorage.getItem(this.LAST_URL_KEY) || '/';
  }

  /**
   * Sets the last visited URL.
   * @param url - The URL to set as the last visited.
   */
  setLastUrl(url: string): void {
    this.lastUrl = url;
    localStorage.setItem(this.LAST_URL_KEY, url);
  }

  /**
   * Gets the last visited URL.
   * @returns The last visited URL.
   */
  getLastUrl(): string {
    return this.lastUrl;
  }
}
