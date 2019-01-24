package com.boot.controller

import com.boot.model.PhotoAlbum
import com.boot.repository.PhotoAlbumRepository
import org.apache.http.conn.BasicEofSensorWatcher
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

import static org.mockito.Mockito.*


@RunWith(MockitoJUnitRunner)
class PhotoAlbumControllerTest {
    @Mock PhotoAlbumRepository photoAlbumRepository
    @InjectMocks PhotoAlbumController controller

    PhotoAlbum photoAlbum1
    PhotoAlbum photoAlbum2
    PhotoAlbum photoAlbum3

    @Before
    void setUp()    {
        photoAlbum1 = new PhotoAlbum(id: 2134, title: "Title 1", albumId: 5)
        photoAlbum2 = new PhotoAlbum(id: 3456, title: "Title 2", albumId: 1)
        photoAlbum3 = new PhotoAlbum(id: 3245, title: "Title 3", albumId: 5)
    }

    @Test
    void testFindAll() {
        when(photoAlbumRepository.findAll()).thenReturn([photoAlbum1, photoAlbum2, photoAlbum3])

        assert controller.findAll() == "[[2134] Title 1, [3456] Title 2, [3245] Title 3]"

        verify(photoAlbumRepository).findAll()

    }

    @Test
    void testFindByAlbumId() {
        when(photoAlbumRepository.findByAlbumId(5)).thenReturn([photoAlbum1, photoAlbum3])

        assert controller.findByAlbumId(5) == "[[2134] Title 1, [3245] Title 3]"

        verify(photoAlbumRepository).findByAlbumId(5)
    }
}
