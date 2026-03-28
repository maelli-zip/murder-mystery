import {Component, computed, inject, OnInit, signal} from '@angular/core';
import {Card} from '../shared/card/card';
import {NavigationBar} from '../navigation-bar/navigation-bar';
import {StoryService} from '../services/story.service';
import {Story} from '../models/story.model';
import {HttpClientModule} from '@angular/common/http';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [Card, NavigationBar, HttpClientModule],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.scss'
})
export class Dashboard implements OnInit {
  // services
  private _storyService = inject(StoryService);

  // signals
  stories$ = signal<Story[]>([]);
  charsByStory$ = computed(() =>
    new Map(this.stories$().map(story => [story.id, story.characters]))
  );

  // lifecycle
  ngOnInit(): void {
    this._storyService.getAllStories().subscribe({
      next: (data) => {
        this.stories$.set(data);
        console.log("Stories initialized: " + this.stories$().length + " stories loaded.");
        // debug: console.log(JSON.stringify(this.stories())
      },
      error: (err) => console.error(err)
    });
  }
}
