package com.dataart.trainee.lostanimalsearcher.entity;

import lombok.Data;
import lombok.Generated;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name="roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;


    public Role() {}

    public Role(String roleName) {
        this.name = roleName;
    }


    @Override
    public String getAuthority() {
        return name;
    }
}
