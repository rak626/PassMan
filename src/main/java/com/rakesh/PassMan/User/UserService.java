package com.rakesh.PassMan.User;

import com.rakesh.PassMan.User.dto.request.UserRequest;
import com.rakesh.PassMan.User.dto.response.UserResponse;
import com.rakesh.PassMan.User.User;
import com.rakesh.PassMan.User.UserRepo;
import com.rakesh.PassMan.User.UserConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public UserResponse createUser(UserRequest userRequest){

        User user = UserConverter.convertUserDtoToUser(userRequest);
        User savedUser = userRepo.save(user);
        return UserConverter.convertUserToUserDto(savedUser);
    }

    public List<UserResponse> getAllUser(){

        List<User> allUsers = userRepo.findAll();

        return allUsers.stream().map(UserConverter::convertUserToUserDto).collect(Collectors.toList());


    }

}
