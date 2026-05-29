package com.demo.medium.service;

import java.util.List;

public class UserService{
public List<String> findActiveUsers(List<String> users){
return users.stream().filter(user -> user != null && !user.isBlank()).toList();
}
public boolean isValidUser(String userName){
if(userName==null){
return false;
}
return !userName.isBlank();
}
}