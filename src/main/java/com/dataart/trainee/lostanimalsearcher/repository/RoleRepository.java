package com.dataart.trainee.lostanimalsearcher.repository;

import com.dataart.trainee.lostanimalsearcher.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
