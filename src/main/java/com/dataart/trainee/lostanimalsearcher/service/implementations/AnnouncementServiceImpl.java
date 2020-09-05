package com.dataart.trainee.lostanimalsearcher.service.implementations;

import com.dataart.trainee.lostanimalsearcher.dao.AnnouncementRepository;
import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import com.dataart.trainee.lostanimalsearcher.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    AnnouncementRepository announcementRepository;


    @Override
    public Announcement getAnnouncementById(Long id) {
        return null;
    }

    @Override
    public List<Announcement> getAll() {
        return null;
    }

    @Override
    public List<Announcement> getAllByType(String type) {
        return null;
    }

    @Override
    public List<Announcement> getAllByUserId(Long user) {
        return null;
    }

    @Override
    public List<Announcement> getAllByUserIdAndType(Long user, String type) {
        return null;
    }

    @Override
    public boolean addAnnouncement(Announcement announcement) {
        return false;
    }

    @Override
    public boolean closeAnnouncement(Announcement announcement) {
        return false;
    }

    @Override
    public boolean deleteAnnouncement(Announcement announcement) {
        return false;
    }
}
