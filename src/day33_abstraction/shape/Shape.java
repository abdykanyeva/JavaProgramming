package day33_abstraction.shape;

public abstract class Shape {

    private String name;

    public Shape() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                " area='"+ area()+
                ", perimeter='"+ perimeter()+
                '}';
    }
}
