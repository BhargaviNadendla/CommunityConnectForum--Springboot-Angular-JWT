import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {QuestionService} from '../../service/question-service';
import {TagsService} from '../../service/tags.service';

@Component({
  selector: 'app-tags-list',
  templateUrl: './tags-list.component.html',
  styleUrls: ['./tags-list.component.css']
})
export class TagsListComponent implements OnInit {

  tags = [];
  @Output() tagEvent = new EventEmitter<string>();

  constructor(private tagsService: TagsService) { }

  ngOnInit() {
    return this.tagsService.get().subscribe((tags: any[]) => {
      this.tags = tags;
      console.log(this.tags);
    });
  }

  onTagClicked(id) {
    this.tagEvent.emit(id);
  }
}
