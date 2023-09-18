package com.typecasting.derived;

class CA
{
    int i = 10;
}
 
class CB extends CA
{
    int j = 20;
}
 
class CC extends CB
{
    int k = 30;
}
 
public class ClassCastExceptionDemo
{
    public static void main(String[] args)
    {
        CA a = new CB();   //CB type is auto up casted to CA type
        CB b = (CB) a;     //CA type is explicitly down casted to CB type.
        CC c = (CC) b;    //Here, you will get class cast exception
        System.out.println(c.k);
    }
}