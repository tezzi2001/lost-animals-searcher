package com.dataart.trainee.lostanimalsearcher.dto;

import com.dataart.trainee.lostanimalsearcher.entity.Role;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String login;
    private String name;
    private String email;
    private String password;
    private Set<Role> roles;
    private Set<LostAnimals> lostAnimals;
    private Set<FoundAnimals> foundAnimals;

    public User toUser() {
        return new User(login, name, email, password, roles, lostAnimals, foundAnimals);
    }
}
