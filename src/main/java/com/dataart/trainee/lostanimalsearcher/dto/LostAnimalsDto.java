package com.dataart.trainee.lostanimalsearcher.dto;

import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import com.dataart.trainee.lostanimalsearcher.entity.AnnouncementType;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LostAnimalsDto {
    private Long id;
    private String title;
    private String content;
    private byte[] photo;
    private User user;

    public Announcement toLostAnimals() {
        return new Announcement(id, title, AnnouncementType.LOST, content, photo, user);
    }

    public String getPhotoLink() {
        File file = new File("img/lostAnimalImg.jpg");
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
            out.write(photo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }
}
