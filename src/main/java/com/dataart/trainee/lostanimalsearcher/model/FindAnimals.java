package com.dataart.trainee.lostanimalsearcher.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "ads_found")
@Data
@NoArgsConstructor
public class FindAnimals {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "animals_id")
    private Animals animals;

    public FindAnimals(Long id) {
        this.id= id;
    }
}
