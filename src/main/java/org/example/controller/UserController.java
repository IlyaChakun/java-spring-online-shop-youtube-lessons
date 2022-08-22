package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.service.UserService;
import org.example.service.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserDto> save (@RequestBody UserDto userDto){
        UserDto saved = userService.save(userDto);
        return ResponseEntity.ok(saved);
    }

}
