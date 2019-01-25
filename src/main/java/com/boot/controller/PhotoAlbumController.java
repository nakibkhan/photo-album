package com.boot.controller;

import com.boot.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/photo-album")
public class PhotoAlbumController {
    @Autowired PhotoAlbumService photoAlbumService;

    @RequestMapping("")
    public String findAll() {
        return photoAlbumService.findAll().toString();
    }


    @RequestMapping("/albumId/{id}")
    public String findByAlbumId(@PathVariable int id)  {
        return photoAlbumService.findByAlbumId(id).toString();
    }


}
