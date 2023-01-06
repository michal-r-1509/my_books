import {Injectable} from '@angular/core';
import {User} from "../domain/user";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  saveUser(user: User){
    console.log("username: " + user.userName)
    return this.httpClient.post('http://localhost:8080/api/users/new', user).subscribe(data => data);
  }

}
