package com.rakesh.PassMan.PasswordBook;

import com.rakesh.PassMan.PasswordBook.dto.request.PasswordBookRequest;
import com.rakesh.PassMan.PasswordBook.dto.response.PasswordBookResponse;
import com.rakesh.PassMan.User.User;

public class PasswordBookConverter {

    public static PasswordBook convertPasswordBookDtoToPasswordBook(PasswordBookRequest passwordBookRequest) {

        return PasswordBook.builder()
                .website(passwordBookRequest.website())
                .username(passwordBookRequest.username())
                .password(passwordBookRequest.password())
                .build();

    }

    public static PasswordBookResponse convertPasswordBookToPasswordBookDto(PasswordBook passwordBook){

        return PasswordBookResponse.builder()
                .id(passwordBook.getId())
                .website(passwordBook.getWebsite())
                .username(passwordBook.getUsername())
                .password(passwordBook.getPassword())
                .build();

    }
}
