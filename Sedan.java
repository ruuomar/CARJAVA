public class Sedan extends Car {

    private int intLength;

    public Sedan(int intSpeed, String color, double regularPrice,int intLength) {
        super(intSpeed, color, regularPrice);
        this.intLength=intLength;
    }

    public double getSalePrice(){
        if(intLength>20)return getRegularPrice()*0.05;else return getRegularPrice()*0.1;
    }
    
}
