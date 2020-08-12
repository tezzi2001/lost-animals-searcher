package com.dataart.trainee.lostanimalsearcher.entity;

import java.util.Collection;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "users")
public class User implements UserDetails {
    @Id
    private String login;

    private String name;

    private String password;

    @ManyToMany
    private Set<Role> roles;

    @OneToMany
    private Set<LostAnimals> lostAnimals;

    @OneToMany
    private Set<FoundAnimals> foundAnimals;

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
