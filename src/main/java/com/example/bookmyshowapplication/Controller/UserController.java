package com.example.bookmyshowapplication.Controller;

import EntryDTOs.UserEntryDto;
import com.example.bookmyshowapplication.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntryDto userEntryDto){
        userService.addUser(userEntryDto);
        return "user added";
    }
}
