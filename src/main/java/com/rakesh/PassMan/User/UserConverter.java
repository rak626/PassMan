package com.rakesh.PassMan.User;

import com.rakesh.PassMan.User.dto.request.UserRequest;
import com.rakesh.PassMan.User.dto.response.UserResponse;

public class UserConverter {

    public static User convertUserDtoToUser(UserRequest userRequest) {

        return User.builder()
                .email(userRequest.email())
                .username(userRequest.username())
                .password(userRequest.password())
                .build();

    }

    public static UserResponse convertUserToUserDto(User user){

        return UserResponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .username(user.getUsername())
                .password(user.getPassword())
                .build();

    }
}
