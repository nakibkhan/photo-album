package com.boot.repository;


import com.boot.model.PhotoAlbum;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhotoAlbumRepository {

    public List<PhotoAlbum> findAll()   {
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("https://jsonplaceholder.typicode.com/photos").header("accept", "application/json").asJson();
            JsonNode result = jsonResponse.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(result.toString(), new TypeReference<List<PhotoAlbum>>(){});
        } catch (Exception e) {
            System.out.println("Some Error Has Occured");
            e.printStackTrace();
        }

        return null;
    }

    public List<PhotoAlbum> findByAlbumId(int albumId)  {
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("https://jsonplaceholder.typicode.com/photos").queryString("albumId", albumId)
                    .header("accept", "application/json")
                    .asJson();
            JsonNode result = jsonResponse.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(result.toString(), new TypeReference<List<PhotoAlbum>>(){});
        } catch (Exception e) {
            System.out.println("Some Error Has Occured");
            e.printStackTrace();
        }

        return null;
    }


}
