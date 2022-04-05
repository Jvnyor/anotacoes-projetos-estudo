package com.Jvnyor.estudo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Integer, String> mapaNomeClientes = new HashMap<>();
    public static void main(String[] args) {


        mapaNomeClientes.put(1, "Willian Marques");
        mapaNomeClientes.put(2, "Antonio Dias");
        mapaNomeClientes.put(3, "Ortiz");
        mapaNomeClientes.put(1, "Teste");

        System.out.println(pesquisar());

    }
    private static String pesquisar(){
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Informe a key");
        Integer key = entrada.nextInt();
        if(mapaNomeClientes.containsKey(key)){
            return String.valueOf(mapaNomeClientes.get(key));
        }
        return null;
    }

}