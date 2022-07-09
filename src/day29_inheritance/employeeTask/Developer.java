package day29_inheritance.employeeTask;

public class Developer extends Employee{


    private  String programmingLanguage;


    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String proLang){
        boolean isProgramLang = proLang == "Java" || proLang == "JavaScript"
                || proLang == "Python" || proLang == "Ruby" || proLang == "C#" || proLang == "C++"|| proLang == "Swift";
        if(isProgramLang){
            this.programmingLanguage = proLang;
        }else{
            System.out.println("Invalid");
            System.exit(1);
        }
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }

}
