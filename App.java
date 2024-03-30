package com.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        BufferedReader arquivo = null;
        try {
            arquivo = new BufferedReader(new FileReader("C:\\Users\\laiz.oliveira\\Desktop\\arquivoercf\\arquivo.csv"));
            String str;
            Pessoa p;
            while ((str = arquivo.readLine()) != null) {
                if (str.startsWith("nome,")) {  //PASSA A PRIMEIRA LINHA ONDE COMEÇA COM (NOME,)
                    continue;
                }
                String[] strL = str.split(","); //linha dividida em partes usando a  ",", e armazenando as partes no array strL 
                System.out.println("Quantas palavras tem?" + strL.length);
                System.out.println(str);
                p = new Pessoa();
                p.nome = strL[0];
                p.idade = Integer.parseInt(strL[1]); //conversão de string p int  
                p.email = strL[2];
                System.out.println(p);
            } 

            arquivo.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

        /*
         * String loremIpsum =
         * "Lorem;Ipsum;is;simply;dummy;text;of;the;printing;and;typesetting;industry"
         * StringTokenizer tokenizer = new StringTokenizer(loremIpsum, ";");
         * System.out.println("Quantas palavras tem? " + tokenizer.countTokens());
         * 
         * String[] loremIpsumSplitted = loremIpsum.split(";");
         * System.out.println("O item tem 23? " + loremIpsumSplitted());
         */
    }
}
