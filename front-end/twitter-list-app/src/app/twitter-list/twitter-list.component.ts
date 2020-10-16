import { Component, OnInit } from '@angular/core';
import { Twitter } from '../twitter';
import { TwitterService } from '../twitter-service.service';
 
@Component({
  selector: 'app-twitter-list',
  templateUrl: './twitter-list.component.html',
  styleUrls: ['./twitter-list.component.css']
})
export class TwitterListComponent implements OnInit {
 
  twitters: Twitter[];
 
  constructor(private twitterService: TwitterService) {
  }
 
  ngOnInit() {
    this.twitterService.findAll().subscribe(data => {
      this.twitters = data;
    });
  }
}