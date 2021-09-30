package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class ImageModel {
	@Id
    @Column(nullable = false, unique = true, length = 60)
    private String imageId;
    
    @Column(nullable = false, length = 40)
    private String imageName;
    
	@Override
	public String toString() {
		return "ImageModel [imageId=" + imageId + ", imageName=" + imageName + "]";
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
    
}
