package model;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private int categoryId;
    private String description;
    private String image;
    private int sold;
    private List<Review> reviews;

    public Product() {
    }

    public Product(int id, String name, int categoryId, String description, String image, int sold) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.description = description;
        this.image = image;
        this.sold = sold;
        this.reviews = null;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
