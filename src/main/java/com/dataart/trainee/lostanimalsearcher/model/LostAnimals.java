package com.dataart.trainee.lostanimalsearcher.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ads_lost")
@Data
@NoArgsConstructor
public class LostAnimals {
    @Id
    Long id;


    @ManyToOne
    @JoinColumn(name = "animals_id")
    private Animals animals;

    public LostAnimals(Long id) {
        this.id=id;
    }
}
