package com.rakesh.PassMan.PasswordBook;

import com.rakesh.PassMan.User.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "password_books")
public class PasswordBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String website;

    private String username;

    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
