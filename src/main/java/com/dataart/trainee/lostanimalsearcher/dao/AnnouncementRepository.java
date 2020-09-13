package com.dataart.trainee.lostanimalsearcher.dao;

import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import com.dataart.trainee.lostanimalsearcher.entity.AnnouncementType;
import com.dataart.trainee.lostanimalsearcher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

    List<Announcement> findAllByType(AnnouncementType type);
    List<Announcement> findAllByUser(User user);
    List<Announcement> findAllByUserAndType(User user, AnnouncementType type);

}
