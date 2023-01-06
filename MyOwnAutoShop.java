public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan sd= new Sedan(8, "Black", 34200, 20);
        Ford f1=new Ford(10, "red", 234, 5, 234000);
        Ford f2=new Ford(5, "purple", 75, 3, 2345);
        Car cr=new Car(8, "yellow", 546);

        System.out.println("Sedan Sales Price: "+abe.getSalePrice());
        System.out.println("Ford sales : "+f1.getSalePrice());
        System.out.println("Ford 2 sales :"+f2.getSalePrice());
        System.out.println("Car Sales Price are: "+cr.getSalePrice());

    }
    
}
