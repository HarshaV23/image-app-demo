package com.example.controller;

import com.example.model.Image;
import com.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ImageController {
    @Autowired
    ImageService imageService;

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE,value="/images")
    public Iterable<Image> getALlImages()
    {
        return imageService.findAll();
    }

    @GetMapping("/images/{imageName}")
    public Optional<Image> getImageByName(@PathVariable String imageName){
        return imageService.findByName(imageName);
    }

    @PostMapping("/images")
    public Image updateImage(@RequestBody Image image){
        return imageService.updateImage(image);
    }
}
