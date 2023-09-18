package com.enums;

enum Directions
{
    NORTH, SOUTH, EAST, WEST;
}
 
public class EnumsExample
{
    public static void main(String[] args)
    {
        Directions d1 = Directions.EAST;
        
        System.out.println(d1);
 
        Directions d2 = Directions.NORTH;
        System.out.println(d2);
 
        System.out.println(Directions.SOUTH);
 
        System.out.println(Directions.WEST);
    }
}