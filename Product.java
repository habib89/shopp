package com.example.sosmed06.logistic;

import android.graphics.drawable.Drawable;
/**
 * Created by sosmed06 on 5/30/17.
 */

public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;
    public boolean selected;

    public Product(String title, Drawable productImage, String description,
                   double price) {
        this.title = title;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
    }
}
