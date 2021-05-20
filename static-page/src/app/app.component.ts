import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <p-toolbar>
      <div class="p-toolbar-group-left">
        ToDo App
      </div>

      <div class="p-toolbar-group-right">
      </div>
    </p-toolbar>
    <div style='margin-bottom: 15px'></div>
    <router-outlet></router-outlet>
  `,
})
export class AppComponent {

}
