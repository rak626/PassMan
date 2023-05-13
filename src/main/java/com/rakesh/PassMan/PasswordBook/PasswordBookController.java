package com.rakesh.PassMan.PasswordBook;

import com.rakesh.PassMan.PasswordBook.dto.request.PasswordBookRequest;
import com.rakesh.PassMan.PasswordBook.dto.response.PasswordBookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users/")
@RequiredArgsConstructor
public class PasswordBookController {

    private final PasswordBookService passwordBookService;

    @PostMapping
    public PasswordBookResponse createNewUser(@RequestBody PasswordBookRequest passwordBookRequest){

        return passwordBookService.createUser(passwordBookRequest);

    }

    @GetMapping
    public List<PasswordBookResponse> getAllTheUser(){
        return passwordBookService.getAllUser();
    }
}
