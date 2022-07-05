package day33_abstraction.animal;

public abstract class Animal {

    private String name;
    private String breed;
    private final char gender;
    private String size;

    public Animal(String name, String breed, char gender, String size) {
        setName(name);
        setBreed(breed);
        if(!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;


        setSize(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void eat();


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                '}';
    }
}
