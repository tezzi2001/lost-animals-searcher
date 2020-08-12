package com.dataart.trainee.lostanimalsearcher.dao;

import com.dataart.trainee.lostanimalsearcher.entity.FoundAnimals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoundAnimalsRepository extends JpaRepository<FoundAnimals, Long> {
}
