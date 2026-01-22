import 'zone.js/testing';
import { getTestBed, TestBed } from '@angular/core/testing';
import { BrowserDynamicTestingModule, platformBrowserDynamicTesting } from '@angular/platform-browser-dynamic/testing';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from './app/components/common/material/material.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

// Patch TestBed to always include TranslateModule.forRoot()
const orig = TestBed.configureTestingModule;
TestBed.configureTestingModule = function (moduleDef: any) {
  moduleDef = moduleDef || {};
  moduleDef.imports = [
    ...(moduleDef.imports || []),
    TranslateModule.forRoot(),
    MaterialModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
  ];
  return orig.call(this, moduleDef);
};

getTestBed().initTestEnvironment(
  BrowserDynamicTestingModule,
  platformBrowserDynamicTesting(),
  { teardown: { destroyAfterEach: true } }
);
