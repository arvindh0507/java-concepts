package com.enums;

enum enum_example
{
    FIRST
    {
        @Override
        void commonMethod()
        {
            System.out.println("Common method Overridden in FIRST");
        }
    },
 
    SECOND
    {
        @Override
        void commonMethod()
        {
            System.out.println("Common method Overridden in SECOND");
        }
    },
 
    THIRD
    {
        @Override
        void commonMethod()
        {
            System.out.println("Common method Overridden in THIRD");
        }
    },
    
	FOURTH {
		
	};
 
    void commonMethod()
    {
        System.out.println("Generalized method, Common to all constants");
    }
}
 
public class EnumWithMethod
{
    public static void main(String[] args)
    {
    	enum_example.FIRST.commonMethod();     //Output : Common method Overridden in FIRST
 
    	enum_example.SECOND.commonMethod();    //Output : Common method Overridden in SECOND
 
    	enum_example.THIRD.commonMethod();     //Output : Common method Overridden in THIRD
    	
    	enum_example.FOURTH.commonMethod();
    }
}