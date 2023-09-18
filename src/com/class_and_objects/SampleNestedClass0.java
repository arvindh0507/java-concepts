package com.class_and_objects;

class One
{
    {
        System.out.println("ONE");
    }
     
    class Two
    {
        {
            System.out.println("TWO");
        }
    }
     
    static
    {
        System.out.println("THREE");
    }
     
    static class Three
    {
        {
            System.out.println("FOUR");
        }
         
        static
        {
            System.out.println("FIVE");
        }
    }
}
 
public class SampleNestedClass0
{
    public static void main(String[] args)
    {
        One one = new One();
         
        One.Two two = one.new Two();
         
        One.Three three = new One.Three();
    }
}
