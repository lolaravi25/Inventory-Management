package com.example.demo.model;

import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Component
public class Item {
    private String siteId;
    private String categoryId;
    @Size(max = 85, message = "Title should have max of 85 character")
    private String title;
    private String condition;
    private double price;
    private long quantity;
    private List<String> imageURL;
    @Valid
    @Size(min=2, max = 10, message = "Itemspecifics should have min of 2 and max of 10")

    private List<ItemSpecifics> itemSpecifics;
    private String description;
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public List<ItemSpecifics> getItemSpecifics() {
        return itemSpecifics;
    }

    public void setItemSpecifics(List<ItemSpecifics> itemSpecifics) {
        this.itemSpecifics = itemSpecifics;
    }

    public List<String> getImageURL() {
        return imageURL;
    }

    public void setImageURL(List<String> imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
