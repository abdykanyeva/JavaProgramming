package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;



// Calculates the total price of the pizza, returns as double
    public double totalCost(){

        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2*(numberOfCheeseTopping
                 + numberOfCheeseTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            default:
                System.out.println("Invalid size: " + size);


        }
        return totalPrice;
    }


    // display the
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ",totalCost: " + totalCost() +
                '}';
    }


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
}
