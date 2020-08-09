package com.dataart.trainee.lostanimalsearcher.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "ads_lost")
@Data
@NoArgsConstructor
public class LostAnimals {
    @Id
    @GeneratedValue
    Long id;


    @ManyToOne
    @JoinColumn(name = "animals_id")
    private Animals animals;

    public LostAnimals(Long id) {
        this.id=id;
    }
}
