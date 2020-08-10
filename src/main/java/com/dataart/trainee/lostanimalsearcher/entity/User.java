package com.dataart.trainee.lostanimalsearcher.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;


@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name="users")
public class User implements UserDetails {

    @Id
    Long Id;

    String login;

    String name;

    String password;

    @ManyToMany(cascade={CascadeType.PERSIST})
    @JoinTable(
            name="user_role",
            joinColumns=@JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id")
    )
    Set<Role> roles;


    //TODO: Map with necessary class
    @OneToMany
    Set<?> ads_lost;

    //TODO: Map with necessary class
    @OneToMany
    Set<?> ads_found;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
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
