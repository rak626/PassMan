package com.rakesh.PassMan.User;

import com.rakesh.PassMan.PasswordBook.PasswordBook;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;

    private String email;

    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<PasswordBook> passwordBooks;

}
