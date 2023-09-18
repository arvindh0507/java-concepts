package com.markerinterface;

interface Cash
{
	
}
 
interface Checque
{
 
}
 
class PaymentOne implements Cash
{
    static void paymentByCash()
    {
        System.out.println("Payment is done by cash");
    }
}
 
class PaymentTwo implements Checque
{
    static void paymentByChecque()
    {
        System.out.println("Payment is done by checque");
    }
}
 
public class UserDefinedMarkerInterface
{
    public static void main(String[] args)
    {
        PaymentOne.paymentByCash();
 
        PaymentTwo.paymentByChecque();
    }
}