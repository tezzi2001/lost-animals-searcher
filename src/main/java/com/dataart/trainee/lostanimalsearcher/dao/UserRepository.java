package com.dataart.trainee.lostanimalsearcher.dao;

import com.dataart.trainee.lostanimalsearcher.entity.Role;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);

    List<User> findAllByRoles(Role role);
}
