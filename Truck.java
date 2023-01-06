public class Truck extends Car{
    private int weight;


    public Truck(int intSpeed, String color, double regularPrice,int weight) {
        super(intSpeed, color, regularPrice);
        this.weight=weight;
    }

    public double getSalePrice(){
        if(weight>2000)return getSpeed()*0.1;else return getSpeed()*0.2; 
    }

    
}
