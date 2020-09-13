package com.dataart.trainee.lostanimalsearcher.dto;

import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import com.dataart.trainee.lostanimalsearcher.entity.AnnouncementType;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnnouncementDto {
    private Long id;
    private AnnouncementType type;
    private String title;
    private String content;
    private byte[] photo;
    private User user;


    public static AnnouncementDto of(Long id, AnnouncementType type,
                                     String title, String content, byte[] photo, User user) {
        return new AnnouncementDto(id, type, title, content, photo, user);
    }

    public static AnnouncementDto of(Announcement announcement) {
        return new AnnouncementDto(
                announcement.getId(),
                announcement.getType(),
                announcement.getTitle(),
                announcement.getContent(),
                announcement.getPhoto(),
                announcement.getUser()
        );
    }

    public Announcement toAnnouncement() {
        return new Announcement(id, type, title, content, photo, user);
    }

    public String getPhotoLink() {
        File file = new File("img/foundAnimalImg.jpg");
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
            out.write(photo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }

}
