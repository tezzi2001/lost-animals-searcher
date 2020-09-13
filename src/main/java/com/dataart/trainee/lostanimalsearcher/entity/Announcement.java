package com.dataart.trainee.lostanimalsearcher.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Announcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AnnouncementType type;

    private String title;

    //private boolean isActive;

    private String content;

    @Lob
    private byte[] photo;

    @OneToOne
    private User user;
}
