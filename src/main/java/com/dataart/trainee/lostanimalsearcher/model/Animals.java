package com.dataart.trainee.lostanimalsearcher.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "animals")
@Data
@NoArgsConstructor
public class Animals {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String kind;
    private String sex;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animals")
    private List<FindAnimals> findAnimals = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animals")
    private List<LostAnimals> lostAnimals = new ArrayList<>();



    public Animals(String name,String kind,String sex) {
        this.name = name;
        this.kind = kind;
        this.sex = sex;



    }
}
