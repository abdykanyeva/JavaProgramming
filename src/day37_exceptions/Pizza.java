package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfToppings;
    private int numberOfPepperoniTopping;


    public Pizza(char size, int numberOfToppings, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfToppings=" + numberOfToppings +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public double totalCost(){

        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2*( numberOfToppings + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*(numberOfToppings + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2*(numberOfToppings + numberOfPepperoniTopping);
                break;
            default:
                System.out.println("Invalid size: " + size);


        }
        return totalPrice;
    }


    public boolean equals(Object obj){
        if(!(obj instanceof Pizza)){   // if the specified object is not a pizza
            System.out.println("Invalid object: " + obj);
            System.exit(1);
        }

        Pizza pizza = (Pizza)obj;
        if(size ==  pizza.size) {
            if(numberOfPepperoniTopping == pizza.numberOfPepperoniTopping){
                return true;
            }

        }
        return false;
    }
}
