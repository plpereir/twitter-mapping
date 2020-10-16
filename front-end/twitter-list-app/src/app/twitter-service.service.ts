import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Twitter } from './twitter';
import { Observable } from 'rxjs/Observable';
 
@Injectable()
export class TwitterService {

  private twitterUrl: string;
 
  constructor(private http: HttpClient) {
    this.twitterUrl = 'http://localhost:8080/api/tweets';
  }
 
  public findAll(): Observable<Twitter[]> {
    return this.http.get<Twitter[]>(this.twitterUrl);
  }
 
}
