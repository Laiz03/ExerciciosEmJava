package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Conta c1 = new Conta ("Laíz", 123456);
        c1.saldo = 1.000;

        System.out.println("Bem Vindo(a) " + c1.dono);
    }
}
