package emailapp;

import java.util.Scanner;

class Email{
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailBoxCapacity;
    private int deFaultPasswordLength = 8;
    private String alternateEmail;
    private String email;
    private String companySuffix = ".companydomain.com";

    //Create a constructor
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Hey " + firstName+" "+lastName+", Email Created Successfully!");

        //Call a method asking for department - return department;
        department = setDepartment();
        if (!department.isEmpty()){
            System.out.println("\nWow, you are from "+ department+" department!");
        }else {
            System.out.println("Sorry, please let us know your department name");
            return;
        }

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + companySuffix;
        System.out.println("Your email is: "+email);

        //Call a method that returns a random password
        password = randomPassword(deFaultPasswordLength);
        System.out.println("Your default password is: " + password);
    }

    //Asking a department
    private String setDepartment(){
        System.out.println("Chose Department: \n1. for Sales\n2. for Development\n3. for Accounts\n0. for note");
        Scanner input = new Scanner(System.in);
        int choseDepartment = input.nextInt();
        if (choseDepartment==1){
            return "sales";
        } else if (choseDepartment==2) {
            return "development";
        } else if (choseDepartment==3) {
            return "accounts";
        }else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890)(*&^%$#@!";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


}