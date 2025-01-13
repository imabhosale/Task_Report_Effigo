package Oop;

class ObjectWorld{
    private String carBrand;
    private int price;
    private int year;
    private String color;

    public String getCarBrand(){
        return carBrand;
    }
    public int getPrice(){
        return price;
    }
    public int getYear(){
        return year;
    }
    public String getColor() {
        return color;
    }



    public ObjectWorld(String carBrancd,int price,int year, String color){
        this.carBrand=carBrancd;
        this.price=price;
        this.year=year;
        this.color=color;
       // carBrancd=this.carBrand; //Not a proper way to use of this keyword
    }

   
}