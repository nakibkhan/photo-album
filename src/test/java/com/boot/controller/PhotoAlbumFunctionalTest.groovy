package com.boot.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class PhotoAlbumFunctionalTest {
    @Autowired private MockMvc mockMvc

    @Test
    void findAll()   {
       MvcResult result = this.mockMvc.perform(get("/photo-album")).andExpect(status().isOk()).andReturn()
       assert result.response.getContentAsString().contains("accusamus beatae ad facilis cum similique qui sunt")
       assert result.response.getContentAsString().contains("qui vel ut odio consequuntur")
       assert result.response.getContentAsString().contains("error quasi sunt cupiditate voluptate ea odit beatae")
    }

    @Test
    void findById() {
        MvcResult result = this.mockMvc.perform(get("/photo-album/albumId/98")).andExpect(status().isOk()).andReturn()

        assert result.response.getContentAsString().contains("in ad sit consequatur est et adipisci")

        assert !result.response.getContentAsString().contains("accusamus beatae ad facilis cum similique qui sunt")
        assert !result.response.getContentAsString().contains("qui vel ut odio consequuntur")
        assert !result.response.getContentAsString().contains("error quasi sunt cupiditate voluptate ea odit beatae")
    }
}
