package com.example.service;

import com.example.model.Image;
import com.example.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepo imageRepo;

    @Override
    public Iterable<Image> findAll() {
        return imageRepo.findAll();
    }

    @Override
    public Optional<Image> findByName(String imageName) {
        return imageRepo.findByImageName(imageName);
    }

    @Override
    public Image updateImage(Image image) {
        return imageRepo.save(image);
    }
}
