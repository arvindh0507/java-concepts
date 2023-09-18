package com.enums;

enum enums
{
    A, B, C;
 
    int i=1;  //enums can have fields
 
    private enums()
    {
        //enums can have Constructor
    }
 
    void methodOfEnum()
    {
        //enums can have methods
    }
}
 
public class EnumsPrivate
{
    public static void main(String[] args)
    {
        enums en = enums.A;
        System.out.println("En= "+en.i);  //Constant A has field i
        en.methodOfEnum();  
        //en.enums();//Constant A has methodOfEnum()
 
        enums en1 = enums.B;
        System.out.println("En1= "+en1.i);  //Constant B has field i
        en1.methodOfEnum();         //Constant B has methodOfEnum()
 
        enums en2 = enums.C;
        System.out.println("En2= "+en2.i);   //Constant C has field i
        en2.methodOfEnum();          //Constant C has methodOfEnum()
    }
}
