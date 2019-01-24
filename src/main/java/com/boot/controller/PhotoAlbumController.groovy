package com.boot.controller;

import com.boot.repository.PhotoAlbumRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/photo-album")
class PhotoAlbumController {
    @Autowired
    PhotoAlbumRepository photoAlbumRepository

    @RequestMapping("")
    String findAll() {
        List<String> result = photoAlbumRepository.findAll().collect {
            "[${it.id}]" + " ${it.title}"
        }

        result.toString()

    }


    @RequestMapping("/albumId/{id}")
    String findByAlbumId(@PathVariable int id)  {
        List<String> result = photoAlbumRepository.findByAlbumId(id).collect {
            "[${it.id}]" + " ${it.title}"
        }

        result.toString()
    }


}
