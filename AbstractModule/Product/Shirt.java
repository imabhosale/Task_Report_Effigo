package Product;


public class Shirt extends Product{
    private Size size;

    public Shirt(double price, String color, String brand,Size size) {
        super(price, color, brand);
        this.size = size;
    }
    public static enum Size {SMALL, MEDIUM, LARGE}

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold(){
        super.fold();
        System.out.println("Lay short on flat surface");
        System.out.println("fold the shirt sideways");
        System.out.println("Folds pants in bottom in third");
    }

    @Override
    public void wear() {
        // TODO Auto-generated method stub
     System.out.println("This "+this.getBrand()+" shirt suit you...!");
    }
}
