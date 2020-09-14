package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Image {
    @Id
    @Column(name ="image_id")
    private String imageid;

    @Column(name = "image_name")
    private String imageName;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "is_active")
    @JsonProperty
    private boolean isActive;

    public Image() {
    }

    public Image(String imageid, String imageName, String imageUrl, boolean isActive) {
        this.imageid = imageid;
        this.imageName = imageName;
        this.imageUrl = imageUrl;
        this.isActive = isActive;
    }

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageid='" + imageid + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}

