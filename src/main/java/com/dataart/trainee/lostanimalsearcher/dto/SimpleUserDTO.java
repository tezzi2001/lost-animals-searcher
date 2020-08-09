package com.dataart.trainee.lostanimalsearcher.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class SimpleUserDTO {

    private String name;
    private String login;
    private String password;

    public SimpleUserDTO(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public static SimpleUserDTO of(String name, String login, String password ) {
        return new SimpleUserDTO(name,login,password);
    }



}
