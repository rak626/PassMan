package com.rakesh.PassMan.User.dto.response;

import lombok.Builder;

@Builder
public record UserResponse (long id, String username, String email,  String password){

}
