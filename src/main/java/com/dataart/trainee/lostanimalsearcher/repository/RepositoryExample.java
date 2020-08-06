package com.dataart.trainee.lostanimalsearcher.repository;

import com.dataart.trainee.lostanimalsearcher.entity.EntityExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExample extends JpaRepository<EntityExample, Long> {
}
