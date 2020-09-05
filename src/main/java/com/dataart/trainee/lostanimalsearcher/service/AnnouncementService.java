package com.dataart.trainee.lostanimalsearcher.service;

import com.dataart.trainee.lostanimalsearcher.entity.Announcement;

import java.util.List;

public interface AnnouncementService {

    Announcement getAnnouncementById(Long id);
    List<Announcement> getAll();
    List<Announcement> getAllByType(String type);
    List<Announcement> getAllByUserId(Long user);
    List<Announcement> getAllByUserIdAndType(Long user, String type);

    boolean addAnnouncement(Announcement announcement);
    boolean closeAnnouncement(Announcement announcement);
    boolean deleteAnnouncement(Announcement announcement);

}
