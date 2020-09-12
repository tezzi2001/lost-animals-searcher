package com.dataart.trainee.lostanimalsearcher.service;

import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import com.dataart.trainee.lostanimalsearcher.entity.AnnouncementType;

import java.util.List;

public interface AnnouncementService {

    Announcement getAnnouncementById(Long id);
    List<Announcement> getAll();
    List<Announcement> getAllByType(AnnouncementType type);
    List<Announcement> getAllByUserId(Long userId);
    List<Announcement> getAllByUserIdAndType(Long userId, AnnouncementType type);

    boolean addAnnouncement(Announcement announcement);
    boolean closeAnnouncement(Announcement announcement);
    boolean deleteAnnouncement(Announcement announcement);

}
