/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatordemo;

import java.util.Scanner;

/**
 *
 * @author fa15-bse-046
 */
public class Calculator {
    public int sum(int a,int b)
    {
        int sum=a+b;
        System.out.println("the sum is = "+sum);
        return sum;
    }
    public int sub(int a,int b)
    {
        int sub=a-b;
        System.out.println("the subtraction is = "+sub);
        return sub;
    }
    public int mult(int a, int b)
    {
        int mult=a*b;
        System.out.println("the multiplication is = "+mult);
        return mult;
    }
    public float division(int a, int b)
    {
        int divide=a/b;
        System.out.println("the division is = "+divide);
        return divide;
    }
}
 