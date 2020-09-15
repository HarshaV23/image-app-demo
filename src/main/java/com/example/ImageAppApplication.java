package com.example;

import com.example.model.Image;
import com.example.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ImageAppApplication implements CommandLineRunner {
    @Autowired
    private ImageRepo imageRepo;

    public static void main(String[] args) {
        SpringApplication.run(ImageAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        imageRepo.save(new Image(generateId(),"Avengers","Coming Soon",true));
        imageRepo.save(new Image(generateId(),"Avengers Age Of Ultron","Coming Soon",true));
        imageRepo.save(new Image(generateId(),"Avengers Age Of 2","Coming Soon",true));
        imageRepo.save(new Image(generateId(),"Avengers Age Of Ultron","Coming Soon",true));

    }

    private String generateId(){
        String uuId= UUID.randomUUID().toString();
        String uuIdArr[]=uuId.split("-");
        return uuIdArr[0];
    }
}
