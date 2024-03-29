package com.isofh.bvp.dashboard.model;

public class Service {
    private int id;
    private String name;
    private int price;
    private int type;


    public Service(int id, String name, int price, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Service() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
