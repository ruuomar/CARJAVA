public class Ford extends Car {
    private int intYear;
    private int ManufacturerDiscount;

    public Ford(int intSpeed, String color, double regularPrice,int intYear,int ManufacturerDiscount) {
        super(intSpeed, color, regularPrice);
        this.intYear=intYear;
        this.ManufacturerDiscount=ManufacturerDiscount;
    }

    public double getSalePrice(){
        return getRegularPrice()-ManufacturerDiscount;
    }
    


    
}
