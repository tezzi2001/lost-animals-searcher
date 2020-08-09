package com.dataart.trainee.lostanimalsearcher.repository;

import com.dataart.trainee.lostanimalsearcher.model.SimpleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepo  extends JpaRepository<SimpleUser,Long> {
}
