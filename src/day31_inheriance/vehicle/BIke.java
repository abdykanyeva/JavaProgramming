package day31_inheriance.vehicle;

public class BIke extends Vehicle{

    public BIke(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(){
        System.out.println("Riding "+getBrand()+" "+getModel());
    }
}
