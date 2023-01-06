import {Component, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";
import {UserService} from "../../services/user.service";
import {User} from "../../domain/user";

@Component({
  selector: 'mb-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {

  constructor(private userService: UserService) {
  }

  userName = '';
  email = '';
  password = '';

/*  userName = new FormControl('', [Validators.required]);
  email = new FormControl('', [Validators.required]);
  password = new FormControl('', [Validators.required]);*/

/*  user = new FormGroup({
      userName: this.userName,
      email: this.email,
      password: this.password
    }
  );*/

  ngOnInit(): void {
  }

  createUser(registrationForm: NgForm): void {
    const user = new User();
    user.userName = this.getUserName();
    user.email = this.getEmail();
    user.password = this.getPassword();
    this.userService.saveUser(user);
    registrationForm.reset();
  }

  getUserName() {
    return this.userName;
  }

  getEmail() {
    return this.email;
  }

  getPassword() {
    return this.password;
  }
}
