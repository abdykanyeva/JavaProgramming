package day28_encapsulation.encapsulationIntro;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
       setNumberOfCheeseTopping(numberOfCheeseTopping);
       setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize(){
        return size;
    }
    
    public void setSize(String size){
        if(!size.equalsIgnoreCase("small") &&
                !size.equalsIgnoreCase("medium") && !size.equalsIgnoreCase("large")){
            System.out.println("Size can only be small, medium, large" + size);
            System.exit(1);
        }
        this.size = size;
    }
    
    public int getNumberOfCheeseTopping(){
        return  numberOfCheeseTopping;
    }
    
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping){
        if(numberOfCheeseTopping < 0) {
            System.out.println("Can not be negative: " +  numberOfCheeseTopping);
            System.exit(1);
        }
            
        
            switch (size){
                case "small":
                    if(numberOfCheeseTopping != 3){
                        System.out.println("Invalid ");
                        System.exit(1);
                    }
                case "medium":
                    if(numberOfCheeseTopping != 4){
                        System.out.println("Invalid");
                        System.exit(1);
                    }
                case "large":
                    if(numberOfCheeseTopping != 5){
                        System.out.println("Invalid");
                        System.exit(1);
                    }
                    
            }
            
        }


    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping){
        if(numberOfPepperoniTopping < 0) {
            System.out.println("Can not be negative: " +  numberOfPepperoniTopping);
            System.exit(1);
        }


        switch (size){
            case "small":
                if(numberOfPepperoniTopping != 4){
                    System.out.println("Invalid ");
                    System.exit(1);
                }
            case "medium":
                if(numberOfPepperoniTopping != 5){
                    System.exit(1);
                }
            case "large":
                if(numberOfPepperoniTopping != 6){
                    System.out.println("Invalid");
                    System.exit(1);
                }

        }

    }

    public int getNumberOfPepperoniTopping(){
        return numberOfPepperoniTopping;
    }


    public double totalCost(){
        double totalCost = 0;
        if(size.equalsIgnoreCase("small")){
            totalCost = 10 + (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else if(size.equalsIgnoreCase("medium")){
            totalCost = 12 + (numberOfPepperoniTopping + numberOfCheeseTopping);
        }else{
            totalCost = 14 + (numberOfPepperoniTopping + numberOfCheeseTopping);
        }
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total Cost='" + totalCost() + '\'' +
                '}';
    }
}



/*
Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium,
                             large. case insensitive

                            Number of cheese topping can not be negative,
                            the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative,
                            the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when
                the object is created.
                                (If the arguments not valid it should not be
                                 set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size,
                     quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */