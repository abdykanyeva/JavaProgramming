package day25_Constructor;

import day17_customClass.Dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Medium", 'm', 4, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "large", 'f', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "small", 'f', 5, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "small", 'm', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "small", 'f', 3, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'm', 7, "Gold");


        ArrayList<Dog> smallDogs = new ArrayList<>();
/*
        for(Dog dog :dogs){
            if(dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }

 */
        smallDogs.addAll(Arrays.asList(dogs));
        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));

        System.out.println(smallDogs);


        System.out.println("___________________________________________________________");

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        /*
        for(Dog dog:dogs){
            if(dog.age <= 4){
                youngDogs.add(dog);
            }
        }

         */

        youngDogs.removeIf(p -> p.age >  4);
        System.out.println(youngDogs);

        youngDogs.forEach(p -> System.out.println(p.name));

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'm');

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p ->p.gender == 'f');


        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", "Medium", 'm', 4, "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", "large", 'f', 8, "Gold");
        dogs2[2].setInfo("Molly", "Beagle", "small", 'f', 5, "White");
        dogs2[3].setInfo("Oliver", "Bulldog", "small", 'm', 2, "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", "small", 'f', 3, "White");
        dogs2[5].setInfo("Loki", "Chow Chow", "Medium", 'm', 7, "Gold");




        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[0]);


        System.out.println(Arrays.toString(dogs2));

    }
}
