package main;

import d1_Academia.Aulas;

public class Main {
    public static void main(String[] args) {
      
        Aulas objAulas = new Aulas("Ginástica",          
                "Bebedouro disponível",
                "Armários disponíveis",
                "Som ativado",         
                "Natação",              
                60,                   
                "10:00 - 11:00",      
                "Esporte aquático",
                "20 alunos"            
            );
        
        objAulas.AulaNatacao();
        objAulas.BebendoAgua();
    }
}
