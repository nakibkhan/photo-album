package com.boot.repository;

import com.boot.model.PhotoAlbum;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PhotoAlbumRepositoryTest {
    PhotoAlbumRepository photoAlbumRepository;

    @Before
    public void setUp()  {
        photoAlbumRepository = new PhotoAlbumRepository();
    }

    @Test
    public void findAll()   {
        List<PhotoAlbum> photoAlbumList = photoAlbumRepository.findAll();
        assert photoAlbumList.size() > 0;
        assert photoAlbumList.get(0).getId() == 1;
        assert photoAlbumList.get(0).getTitle().equals("accusamus beatae ad facilis cum similique qui sunt");
        assert photoAlbumList.get(0).getAlbumId() == 1;
        assert photoAlbumList.get(0).getThumbnailUrl().equals("https://via.placeholder.com/150/92c952");

    }

    @Test
    public void finByAlbumId()  {
        List<PhotoAlbum> photoAlbumList = photoAlbumRepository.findByAlbumId(3);
        assert photoAlbumList.size() > 0;
        assert photoAlbumList.get(0).getAlbumId() == 3;
    }


}