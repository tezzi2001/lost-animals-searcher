package com.dataart.trainee.lostanimalsearcher.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "usr")
@Data
@NoArgsConstructor
public class SimpleUser {
    @Id
    @GeneratedValue
    private Long id;

    private String login;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    public SimpleUser(String login, String password, UserRole role) {
        this.login = login;
        this.password = password;
        this.role = role;

    }
}
