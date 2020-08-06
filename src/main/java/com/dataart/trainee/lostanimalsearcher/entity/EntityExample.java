package com.dataart.trainee.lostanimalsearcher.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EntityExample {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;
}
