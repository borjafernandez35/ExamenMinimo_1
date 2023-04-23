package org.example;

public class Product {

    private String id;

    private String description;

    private String price;

    private int priceProduct;

    public Product (){}

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Product(String id, String description, String price, int priceProduct) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.priceProduct=priceProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
