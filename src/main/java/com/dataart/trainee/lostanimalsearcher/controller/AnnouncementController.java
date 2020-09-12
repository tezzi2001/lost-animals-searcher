package com.dataart.trainee.lostanimalsearcher.controller;

import com.dataart.trainee.lostanimalsearcher.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String getAnnouncementById(@PathVariable Long announcementId) {
        return null;
    }

    @PostMapping("/announcement/add")
    public String addAnnouncement() {
        return null;
    }

    @PutMapping("/announcement/{announcementId}/close")
    public String closeAnnouncement(@PathVariable Long announcementId) {
        return null;
    }

    @DeleteMapping("/announcement/{announcementId}/delete")
    public String deleteAnnouncement(@PathVariable Long announcementId) {
        return null;
    }


    /*List of announcements operations*/
    @GetMapping("/announcements")
    public String getAllAnnouncements() {
        return null;
    }

    @GetMapping("/announcements/found")
    public String getAllFoundAnnouncements() {
        return null;
    }

    @GetMapping("/announcements/lost")
    public String getAllLostAnnouncements() {
        return null;
    }

    @GetMapping("/announcements/{userId}")
    public String getUserAnnouncements(@PathVariable String userId) {
        return null;
    }

    @GetMapping("/announcements/{userId}/found")
    public String getUserFoundAnnouncements(@PathVariable String userId) {
        return null;
    }

    @GetMapping("/announcements/{userId}/lost")
    public String getUserLostAnnouncements(@PathVariable String userId) {
        return null;
    }

}
