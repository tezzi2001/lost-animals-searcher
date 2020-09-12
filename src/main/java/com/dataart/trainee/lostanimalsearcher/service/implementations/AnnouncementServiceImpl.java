package com.dataart.trainee.lostanimalsearcher.service.implementations;

import com.dataart.trainee.lostanimalsearcher.dao.AnnouncementRepository;
import com.dataart.trainee.lostanimalsearcher.dao.UserRepository;
import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import com.dataart.trainee.lostanimalsearcher.entity.AnnouncementType;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import com.dataart.trainee.lostanimalsearcher.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    private final AnnouncementRepository announcementRepository;
    private final UserRepository userRepository;


    @Autowired
    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository, UserRepository userRepository) {
        this.announcementRepository = announcementRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Announcement getAnnouncementById(Long id) {
        return announcementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Announcement> getAll() {
        List<Announcement> announcements = announcementRepository.findAll();
        return announcements.isEmpty() ? new ArrayList<>() : announcements;
    }

    @Override
    public List<Announcement> getAllByType(AnnouncementType type) {
        List<Announcement> announcements = announcementRepository.findAllByType(type);
        return announcements.isEmpty() ? new ArrayList<>() : announcements;
    }

    @Override
    public List<Announcement> getAllByUserId(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            List<Announcement> announcements = announcementRepository.findAllByUser(userOptional.get());
            return announcements.isEmpty() ? new ArrayList<>() : announcements;
        }
        return new ArrayList<>();
    }

    @Override
    public List<Announcement> getAllByUserIdAndType(Long userId, AnnouncementType type) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            List<Announcement> announcements = announcementRepository
                    .findAllByUserAndType(userOptional.get(), type);
            return announcements.isEmpty() ? new ArrayList<>() : announcements;
        }
        return new ArrayList<>();
    }

    @Override
    public boolean addAnnouncement(Announcement announcement) {
        if (announcement != null) {
            announcementRepository.save(announcement);
            return true;
        }
        return false;
    }

    @Override
    public boolean closeAnnouncement(Announcement announcement) {
        if (announcement != null && announcement.getId() != null) {
            Optional<Announcement> announcementOptional = announcementRepository
                    .findById(announcement.getId());
            if (announcementOptional.isPresent()) {
                Announcement closedAnnouncement = announcementOptional.get();
                closedAnnouncement.setActive(false);
                announcementRepository.save(closedAnnouncement);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAnnouncement(Announcement announcement) {
        if (announcement != null && announcement.getId() != null) {
            Optional<Announcement> announcementOptional = announcementRepository
                    .findById(announcement.getId());
            if (announcementOptional.isPresent()) {
                announcementRepository.delete(announcementOptional.get());
                return true;
            }
        }
        return false;
    }
}
