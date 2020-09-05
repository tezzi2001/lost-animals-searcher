package com.dataart.trainee.lostanimalsearcher.dao;

import com.dataart.trainee.lostanimalsearcher.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
