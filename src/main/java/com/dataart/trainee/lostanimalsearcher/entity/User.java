package com.dataart.trainee.lostanimalsearcher.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Set;


@Data
@Entity(name="users")
public class User implements UserDetails {

    @Id
    String login;

    String name;

    String password;

    @ManyToMany
    Set<Role> roles;

    //TODO: Map with necessary class
    @OneToMany
    Set<?> ads_lost;

    //TODO: Map with necessary class
    @OneToMany
    Set<?> ads_found;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
