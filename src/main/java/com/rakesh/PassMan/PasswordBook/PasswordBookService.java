package com.rakesh.PassMan.PasswordBook;

import com.rakesh.PassMan.PasswordBook.dto.request.PasswordBookRequest;
import com.rakesh.PassMan.PasswordBook.dto.response.PasswordBookResponse;
import com.rakesh.PassMan.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PasswordBookService {

    private final PasswordBookRepo passwordBookRepo;


    public PasswordBookResponse createPasswordBook(PasswordBookRequest passwordBookRequest){

        PasswordBook passwordBook = PasswordBookConverter.convertPasswordBookDtoToPasswordBook(passwordBookRequest);
        PasswordBook savedBook = passwordBookRepo.save(passwordBook);
        return PasswordBookConverter.convertPasswordBookToPasswordBookDto(savedBook);
    }

    public List<PasswordBookResponse> getAllPasswordBook(){

        List<PasswordBook> allPasswordBookList = passwordBookRepo.findAll();

        return allPasswordBookList.stream().map(PasswordBookConverter::convertPasswordBookToPasswordBookDto).collect(Collectors.toList());

    }

}
