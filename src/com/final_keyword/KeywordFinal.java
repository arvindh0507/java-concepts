package com.final_keyword;


//We can’t create a subclass to the class or we can’t extend a class or we can’t modify a class which is declared as final.

final class FinalClass
{
    //some statements
}

public class KeywordFinal extends FinalClass {

}

//We can’t override a method or we can’t modify a method in the sub class which is declared as final in the super class.
class SuperClass
{
    final void methodOne()
    {
        //some statements
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOne()
    {
        //Compile time error
        //can not override final method
    }
}

//The value of a final variable can not be changed in the whole execution once it got initialized

class AnyClass
{
	
	static String s = "Arvindh"; 
    final String MBM_M= "M";
    //Student s = new Student();
    
    if(department == 48 || department == 52 )
    {
    	MBM_M = "I";
    	s.setMBMCode(MBM_M);
    
    }
 
    void methodOne()
    {
        i = 20;     //compile time error
        //final field can not be re-assigned
    }
}