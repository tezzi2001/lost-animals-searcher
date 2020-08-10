package com.dataart.trainee.lostanimalsearcher.repository;

import com.dataart.trainee.lostanimalsearcher.entity.Role;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
    List<User> findAllByRoles(Role role);
}
