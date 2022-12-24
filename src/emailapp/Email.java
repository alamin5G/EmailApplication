package emailapp;

import java.util.Scanner;

class Email{
    String firstName;
    String lastName;
    String deparment;
    String password;

    //Create a constructor
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Hey " + firstName+" "+lastName+", Email Created Successfully!");

        //Call a method asking for department - return department;
        String chosenDepartment = setDepartment();
        if (!chosenDepartment.isEmpty()){
            System.out.println("\nWow, you are from "+ chosenDepartment+" department!");
        }else {
            System.out.println("Sorry, please let us your department name");
        }
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

}