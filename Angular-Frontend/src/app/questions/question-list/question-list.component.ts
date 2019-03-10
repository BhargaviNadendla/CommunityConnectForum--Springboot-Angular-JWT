import { Component, OnInit } from '@angular/core';
import {QuestionService} from '../../service/question-service';

@Component({
  selector: 'app-question',
  templateUrl: './question-list.component.html',
  styleUrls: ['./question-list.component.css']
})
export class QuestionListComponent implements OnInit {
  questions = [];
  questionsByTag = [];
  constructor(private questionService: QuestionService) { }

  ngOnInit() {
    return this.questionService.get().subscribe((questions: any[]) => {
      this.questions = questions;
      console.log(this.questions);
    });
  }

  processTag($event) {
    return this.questionService.getByTag($event).subscribe((questions: any[]) => {
      this.questions = questions;
      console.log(this.questions);
    });
  }

}
