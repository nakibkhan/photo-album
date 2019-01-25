package com.boot.service;

import com.boot.model.PhotoAlbum;
import com.boot.repository.PhotoAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class PhotoAlbumService {
    @Autowired
    PhotoAlbumRepository photoAlbumRepository;

    public List<String> findAll()    {
        List<PhotoAlbum> albums = photoAlbumRepository.findAll();
        List<String> stringResult = new ArrayList<>();

        for(PhotoAlbum album: albums)  {
            stringResult.add("[" + album.getId() + "] " + album.getTitle());
        }


        return stringResult;

    }

    public List<String> findByAlbumId(@PathVariable int id)  {
        List<PhotoAlbum> albums = photoAlbumRepository.findByAlbumId(id);
        List<String> stringResult = new ArrayList<>();

        for(PhotoAlbum album: albums)  {
            stringResult.add("[" + album.getId() + "] " + album.getTitle());
        }


        return stringResult;
    }
}
