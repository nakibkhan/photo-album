package com.boot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoAlbum {

    @JsonProperty("albumId")  int albumId;
    @JsonProperty("id") private int id;
    @JsonProperty("title") private String title;
    @JsonProperty("url") private String url;
    @JsonProperty("thumbnailUrl")private String thumbnailUrl;

    public PhotoAlbum ()    {
    }

    public PhotoAlbum (int albumId, int id, String title, String url, String thumbnailUrl)    {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public int getId()  {
        return this.id;

    }

    public String getTitle()   {
        return this.title;
    }


}
