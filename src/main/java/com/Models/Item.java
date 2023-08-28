package com.Models;

public class Item {
    private String name;
    private String imgsrc;

    public Item() {
        // Không cần thiết phải gán name và imgsrc trong constructor này
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
