package com.class_and_objects;

class Test
{
    static int first;
 
    static String second;
 
    static
    {
        System.out.println(1);
 
        first = 100;
    }
 
    static
    {
        System.out.println(2);
 
        second = "SECOND";
    }
}
 
public class staticInitialization
{
    static
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        System.out.println(4);
 
        System.out.println(Test.first);
 
        System.out.println(Test.second);
    }
}