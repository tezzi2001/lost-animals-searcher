package com.dataart.trainee.lostanimalsearcher.controller;

import com.dataart.trainee.lostanimalsearcher.dto.AnnouncementDto;
import com.dataart.trainee.lostanimalsearcher.entity.AnnouncementType;
import com.dataart.trainee.lostanimalsearcher.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/*REST API interface for announcements (announcement - ANMT)
*
* Single announcement operations
* * add ANMT new:       /announcement/add (method POST)
* * get ANMT by id:     /announcement/{announcementId} (method GET)
* * close ANMT by id:   /announcement/{announcementId}/close (method PUT)
* * delete ANMT by id:  /announcement/{announcementId}/delete (method DELETE)
*
* List of announcements operations
* * get all ANMTs:                  /announcements (GET)
* * get ANMTs about found animals:  /announcements/found (GET)
* * get ANMTs about lost animals:   /announcements/lost (GET)
* * get ANMTs created by user:      /announcements/{userId} (GET)
* * get ANMTs about found by user:  /announcements/{userId}/found (GET)
* * get ANMTs about lost by user:   /announcements/{userId}/lost (GET)
* */


@RestController
public class AnnouncementController {

    private AnnouncementService announcementService;

    @Autowired
    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }


    /*Single announcement operations*/
    @GetMapping("/announcement/{announcementId}")
    public AnnouncementDto getAnnouncementById(@PathVariable Long announcementId) {
        return AnnouncementDto.of(announcementService.getAnnouncementById(announcementId));
    }

    @PostMapping("/announcement/add")
    public boolean addAnnouncement(@ModelAttribute AnnouncementDto announcementDto) {
        return announcementService.addAnnouncement(announcementDto.toAnnouncement());
    }

    /*@PutMapping("/announcement/{announcementId}/close")
    public AnnouncementDto closeAnnouncement(@PathVariable Long announcementId) {
        return null;
    }*/

    @DeleteMapping("/announcement/{announcementId}/delete")
    public boolean deleteAnnouncement(@PathVariable Long announcementId) {
        return announcementService.deleteAnnouncement(announcementService.getAnnouncementById(announcementId));
    }


    /*List of announcements operations*/
    @GetMapping("/announcements")
    public List<AnnouncementDto> getAllAnnouncements() {
        return announcementService.getAll().stream()
                .map(AnnouncementDto::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/announcements/found")
    public List<AnnouncementDto> getAllFoundAnnouncements() {
        return announcementService.getAllByType(AnnouncementType.FOUND).stream()
                .map(AnnouncementDto::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/announcements/lost")
    public List<AnnouncementDto> getAllLostAnnouncements() {
        return announcementService.getAllByType(AnnouncementType.LOST).stream()
                .map(AnnouncementDto::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/announcements/{userId}")
    public List<AnnouncementDto> getUserAnnouncements(@PathVariable Long userId) {
        return announcementService.getAllByUserId(userId).stream()
                .map(AnnouncementDto::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/announcements/{userId}/found")
    public List<AnnouncementDto> getUserFoundAnnouncements(@PathVariable Long userId) {
        return announcementService.getAllByUserIdAndType(userId, AnnouncementType.FOUND).stream()
                .map(AnnouncementDto::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/announcements/{userId}/lost")
    public List<AnnouncementDto> getUserLostAnnouncements(@PathVariable Long userId) {
        return announcementService.getAllByUserIdAndType(userId, AnnouncementType.LOST).stream()
                .map(AnnouncementDto::of)
                .collect(Collectors.toList());
    }

}
