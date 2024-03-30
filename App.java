package com.example;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        //cria o caminho do arquivo
        File arquivoDestinoExercicio = new File("E:\\Atividades ADS\\DESENVOLVIMENTO DE SOFTWARE - CHICO\\exerciciolerescrever\\arquivoDestinoexercicio.txt");

        //cria o arquivo
        try {
            arquivoDestinoExercicio.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }

        //cria as variaveis

        BufferedReader arquivoOrigemExercicio;
        BufferedWriter arquivoDestinoExercicio2;

        //cria o caminho
        try {
            arquivoDestinoExercicio2 = new BufferedWriter(new FileWriter
            ("E:\\Atividades ADS\\DESENVOLVIMENTO DE SOFTWARE - CHICO\\exerciciolerescrever\\arquivoDestinoexercicio.txt"));
            arquivoOrigemExercicio = new BufferedReader(new FileReader
            ("E:\\Atividades ADS\\DESENVOLVIMENTO DE SOFTWARE - CHICO\\exerciciolerescrever\\arquivoOrigemexercicio.txt"));
            String str;

            //ler o arquivo e já escreve no arquivo novo
            while ((str = arquivoOrigemExercicio.readLine()) != null){
                arquivoDestinoExercicio2.write(str);
                arquivoDestinoExercicio2.newLine(); 
            }

            arquivoDestinoExercicio2.close();
            arquivoOrigemExercicio.close();

        } catch (Exception e) {
            // TODO: handle exception
        }



    }
}
