package Oop;

class ObjectWorld {
    private String carBrand;
    private int price;
    private int year;
    private String color;

    public ObjectWorld(String carBrancd, int price, int year, String color) {
        this.carBrand = carBrancd;
        this.price = price;
        this.year = year;
        this.color = color;
        // carBrancd=this.carBrand; //Not a proper way to use of this keyword
    }

    public ObjectWorld(ObjectWorld source){
        this.carBrand=source.carBrand;
        this.color=source.color;
        this.price=source.price;
        this.year=source.year;
    }

      /**
     * methodName: drive() 
     * Inside the method print :
     * 
     * @return void
     */

     public void drive(){
        System.out.println("You bought a beautiful car "+this.carBrand+" "+this.color+"  for $ "+this.price+" on year "+this.year);
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

}