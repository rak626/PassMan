package com.rakesh.PassMan.PasswordBook;

import com.rakesh.PassMan.PasswordBook.PasswordBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordBookRepo extends JpaRepository<PasswordBook, Integer> {

}
