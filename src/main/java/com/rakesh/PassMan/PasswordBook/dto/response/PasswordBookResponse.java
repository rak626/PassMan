package com.rakesh.PassMan.PasswordBook.dto.response;

import lombok.Builder;

@Builder
public record PasswordBookResponse(long id, String website, String username, String password){

}
