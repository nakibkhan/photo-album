package com.boot;

import com.boot.service.PhotoAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner{
    @Autowired
    PhotoAlbumService photoAlbumService;

    public static void main(String [] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(args.length == 0) return;

        if(!args[0].equals("photo-album")) return;

        Integer albumId = null;

        try {
            albumId = Integer.parseInt(args[1]);
        }  catch(Exception ex) {
            System.out.println("Invalid Argument, please try again.");
        }


        List<String> result = photoAlbumService.findByAlbumId(albumId);

        for(String value : result) {
            System.out.println(value);
        }

        System.exit(0);

    }
}
