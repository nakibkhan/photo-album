package com.boot.controller;

import com.boot.model.PhotoAlbum;
import com.boot.repository.PhotoAlbumRepository;
import com.boot.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
