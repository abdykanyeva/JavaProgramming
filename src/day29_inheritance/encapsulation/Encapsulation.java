package day29_inheritance.encapsulation;

public class Encapsulation {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Encapsulation(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){   // read only
        /*
        if(name == null){
            name = "Unknown";
        }

         */
        return name;
    }

    public void setName(String name){   // write only
       /* if(name.isEmpty()){
            System.err.println("Invalid student name");
            System.exit(1);
        }

        */

        this.name = name;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if(age < 0){
            System.err.println("Age can not be negative "+age);
            System.exit(1);
        }
        if(age < 5 || age > 90){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( gender == 'M' || gender == 'F'){
            this.gender = gender;

        }else{
            System.out.println("Gender can only be F or M");
            System.exit(1);
        }


    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade =='C' || grade == 'D' || grade == 'F';
        if(isValid){
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying at " + schoolName);
    }

    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
