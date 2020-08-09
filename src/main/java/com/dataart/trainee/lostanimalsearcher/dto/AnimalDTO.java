package com.dataart.trainee.lostanimalsearcher.dto;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class AnimalDTO {
    private Long id;

    private String name;
    private String kind;
    private String sex;

    public AnimalDTO(Long id,String name, String kind, String sex) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.sex = sex;
    }
    public static AnimalDTO of(String  name,String kind,String sex) {
        return new AnimalDTO(null,name,kind,sex);
    }
    public static AnimalDTO of(Long id,String name, String kind, String sex) {
        return new AnimalDTO(id,name,kind,sex);
    }


}
