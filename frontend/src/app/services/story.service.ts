import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Story, Character } from '../models/story.model';

@Injectable({
  providedIn: 'root'
})
export class StoryService {

  private readonly apiUrl = 'http://localhost:8080/api/stories';

  constructor(private http: HttpClient) {}

  getAllStories(): Observable<Story[]> {
    return this.http.get<Story[]>(this.apiUrl + '/getAll');
  }

  getStoryById(id: string): Observable<Story> {
    return this.http.get<Story>(`${this.apiUrl}/${id}`);
  }

  getCharactersByStoryId(id: string): Observable<Character[]> {
    return this.http.get<Character[]>(`${this.apiUrl}/${id}/characters`);
  }
}
