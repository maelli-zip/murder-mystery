import { Component } from '@angular/core';
import { Card } from '../shared/card/card';
import { NavigationBar } from '../navigation-bar/navigation-bar';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [Card, NavigationBar],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.scss'
})
export class Dashboard {

}
