package com.rakesh.PassMan.User;

import com.rakesh.PassMan.User.dto.request.UserRequest;
import com.rakesh.PassMan.User.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse createNewUser(@RequestBody UserRequest userRequest){

        return userService.createUser(userRequest);

    }

    @GetMapping
    public List<UserResponse> getAllTheUser(){
        return userService.getAllUser();
    }
}
