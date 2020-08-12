package com.dataart.trainee.lostanimalsearcher.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                    .disable()
                .authorizeRequests()
                    .antMatchers("/register", "resetPassword").not().fullyAuthenticated()
                    .antMatchers("/" , "/css/**", "/js/**", "/fonts/**", "/img/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                    .exceptionHandling()
                    .accessDeniedPage("/unauthorized")
                .and()
                    .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login?error")
                    .usernameParameter("login")
                    .passwordParameter("password")
                    .permitAll()
                .and()
                    .logout()
                    .permitAll()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/login?logout");
    }
}



