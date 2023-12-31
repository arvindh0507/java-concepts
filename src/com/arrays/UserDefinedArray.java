package com.arrays;

class A
{
    int i;
 
    void methodOne()
    {
        System.out.println("From Class A");
    }
}
 
class B extends A
{
    @Override
    void methodOne()
    {
        System.out.println("From Class B");
    }
}
 
public class UserDefinedArray
{
    public static void main(String[] args)
    {
        A[] arrayOfSuperClassReferences = new A[5];   //Defining an array of super class reference variables
 
        for (int i = 0; i < arrayOfSuperClassReferences.length; i++)
        {
            arrayOfSuperClassReferences[i] = new A();     //array element pointing to sub class object
 
            arrayOfSuperClassReferences[i].methodOne();   //accessing member of sub class object
        }
    }
}