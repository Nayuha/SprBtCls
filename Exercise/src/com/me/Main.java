package com.me;

public class Main {
        public static void main(String[] args) {

            //Create object
            Person myObj = new Person();

            //Test case 1
            //First name empty
            //Last name empty
            //age 20
            //expected result: full name-empty, isTeen-False

            myObj.setFirstName(""); // Set the empty value of the first name
            myObj.setLastName("");  // Set the empty value of the last name
            myObj.setAge(20);
            System.out.println("Test Case 1 - Full Name: " + myObj.fullName()
                                +",isTeen = "+ myObj.isTeen());

            //Test case 2
            //First name Muhammadgitgit


            //Last name empty
            //age 15
            //expected result: full name-Muhammad, isTeen-True

            myObj.setFirstName("Muhammad"); // Set the empty value of the first name
            myObj.setLastName("");  // Set the empty value of the last name
            myObj.setAge(15);
            System.out.println("Test Case 2 - Full Name: " + myObj.fullName()
                    +", isTeen = "  + myObj.isTeen());

            //Test case 3
            //First name Muhammad
            //Last name Shamsi
            //age 15
            //expected result: full name-Muhammad Shamsi, isTeen-True

            myObj.setFirstName("Muhammad"); // Set the empty value of the first name
            myObj.setLastName("Shamsi");  // Set the empty value of the last name
            myObj.setAge(15);
            System.out.println("Test Case 3 - Full Name: " + myObj.fullName()
                    +", isTeen = "  + myObj.isTeen());

            //Test case 4
            //First name empty
            //Last name Shamsi
            //age 40
            //expected result: full name-Shamsi, isTeen-False

            myObj.setFirstName(""); // Set the empty value of the first name
            myObj.setLastName("Shamsi");  // Set the empty value of the last name
            myObj.setAge(40);
            System.out.println("Test Case 4 - Full Name: " + myObj.fullName()
                    +", isTeen = "  + myObj.isTeen());

        }
}

