import {Component, OnInit} from '@angular/core';
import {TokenStorageService} from './auth/token-storage.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Discussion-Forum-Angular';
  info: any;
  constructor(private token: TokenStorageService, private router: Router) { }

  ngOnInit() {
    this.info = {
      token: this.token.getToken(),
      username: this.token.getUsername(),
      authorities: this.token.getAuthorities()
    };
  }

  logout() {
    this.token.signOut();
    this.router.navigate(['./signin']);
  }
}

