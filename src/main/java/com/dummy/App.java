package com.dummy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main( String[] args )
    {
        int s=App.sum(5, 4);
        System.out.println(s);
    }
}
