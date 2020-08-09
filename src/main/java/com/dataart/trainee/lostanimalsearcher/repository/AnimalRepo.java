package com.dataart.trainee.lostanimalsearcher.repository;

import com.dataart.trainee.lostanimalsearcher.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepo   extends JpaRepository<Animals,Long> {
}
