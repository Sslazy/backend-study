package org.example.spring.ioc.entity;

public class Clothes {
    private String style;

    private String clothes;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
    @Override
    public String toString() {
        return clothes + style;
    }
}
