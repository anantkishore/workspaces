import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewscomponentComponent } from './newscomponent.component';

describe('NewscomponentComponent', () => {
  let component: NewscomponentComponent;
  let fixture: ComponentFixture<NewscomponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewscomponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewscomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
