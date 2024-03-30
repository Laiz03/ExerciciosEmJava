package com.example;

public class Pessoa {
    String nome, email;
    int idade;
    @Override  //clica no botão direito do mouse, "SOURCE ACTION" -> "GENERATE TOSTRING" 
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
    }
    
}
