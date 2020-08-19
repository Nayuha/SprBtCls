package com.me;

public class Person {
    private String firstName;
    private String lastName;
    private int    age;

    //Get first name
    public String getFirstName()
    {
        return firstName;
    }

    //Get last name
    public String getLastName()
    {
        return lastName;
    }

    //get age
    public int getAge()
    {
        return age;
    }

    //set first name
    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    //set Last name
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    //set age
    public void setAge (int   age)
    {
        this.age = age;
    }

    //Methods
    public boolean isTeen()
    {
        if(age > 12 && age < 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String fullName()
    {
        return firstName + " " + lastName;
    }


}