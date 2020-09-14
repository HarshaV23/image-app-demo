package com.example.service;


import com.example.model.Image;

import java.util.Optional;

public interface ImageService {
    public Iterable<Image> findAll();
    public Optional<Image> findByName(String imageName);
    public Image updateImage(Image image);

}
