package day28_encapsulation.encapsulationIntro;

public class Credentials {

    private String userName;
    private String password;

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){

      if(!isStrongPassword(password)){
          System.out.println("The password isn't strong enough: " + password);
          System.exit(1);
      }
        this.password = password;
    }

    public boolean isStrongPassword(String password){
        boolean isDigit = false;
        boolean isLetter = false;
        boolean specChar = false;

        for(char each: password.toCharArray()){
            if(Character.isDigit(each)){
                isDigit = true;
            }else if(Character.isLetter(each)){
                isLetter = true;
            }else if(!Character.isLetterOrDigit(each)){
                specChar = true;
            }
        }
        if(password.length() >= 8 && !password.contains(" ") && isDigit && isLetter && specChar){
            return true;
        }else{
            return false;
        }





    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is
                strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()

 */