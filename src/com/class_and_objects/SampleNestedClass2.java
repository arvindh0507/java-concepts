package com.class_and_objects;

class ABC
{
    int i = 10101;
     
    {
        i--;
    }
    
    String s = "PPP";
    
    {
        System.out.println(s);
    }
    
    String methodP()
    {
        class DEF
        {
            String s = ABC.this.s+"QQQ";
             
            {
                System.out.println(s);
            }
        }
         
        return new DEF().s+s;
    }
     
    public ABC()
    {
        --i;
    }
     
    class XYZ
    {
        int i = this.i;
         
        {
            i++;
        }
         
        public XYZ() 
        {
            ++i;
        }
    }
}
 
public class SampleNestedClass2
{
    public static void main(String[] args)
    {
        ABC abc = new ABC();
         
        System.out.println(abc.i);
         
        ABC.XYZ xyz = abc.new XYZ();
         
        System.out.println(xyz.i);
         
        ABC.XYZ xyz1 = new ABC().new XYZ();
         
        System.out.println(xyz1.i);
    }
}
