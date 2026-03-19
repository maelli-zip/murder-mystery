import { Component, OnInit, signal } from '@angular/core';
import { Card } from '../shared/card/card';
import { NavigationBar } from '../navigation-bar/navigation-bar';
import { StoryService } from '../services/story.service';
import { Story } from '../models/story.model';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [Card, NavigationBar, HttpClientModule],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.scss'
})
export class Dashboard implements OnInit {

  stories = signal<Story[]>([]);

  constructor(private storyService: StoryService) {}

  ngOnInit(): void {
    this.storyService.getAllStories().subscribe({
      next: (data) => {
        console.log("Dashboard initialized with stories: " + data.toString());
        this.stories.set(data);
        console.log("Dashboard initialized with stories: " + this.stories.length + " stories loaded." + JSON.stringify(this.stories));
      },
      error: (err) => console.error(err)
    });
  }
}