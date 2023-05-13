package com.rakesh.PassMan.User;

import com.rakesh.PassMan.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
