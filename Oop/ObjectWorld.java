package Oop;

import java.util.Arrays;

class ObjectWorld {
    private String carBrand;
    private int price;
    private int year;
    private String color;
    private String []  parts;

    public ObjectWorld(String carBrand, int price, int year, String color, String[] parts) {
        this.carBrand = carBrand;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts,parts.length);
    }

    public ObjectWorld(ObjectWorld source){
        this.carBrand=source.carBrand;
        this.price=source.price;
        this.year=source.year;
        this.color=source.color;
        this.parts=Arrays.copyOf(source.parts,source.parts.length);
        
    }



    /**
     * @return String return the carBrand
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * @param carBrand the carBrand to set
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * @return int return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return String [] return the parts
     */
    public String [] getParts() {
        return Arrays.copyOf(parts, parts.length);
    }

    /**
     * @param parts the parts to set
     */
    public void setParts(String [] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    @Override
    public String toString() {
        return "ObjectWorld [carBrand=" + carBrand + ", price=" + price + ", year=" + year + ", color=" + color
                + ", parts=" + Arrays.toString(parts) + "]";
    }

    

}