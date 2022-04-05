package com.Jvnyor.estudo.map;

import java.util.*;

class Carteira {
    private int num;
    public void setNum(int num) { this.num = num; }
    public int getNum() { return this.num; }
    @Override
    public String toString() { return "Valor da carteira: " + num; }
}

public class TesteHash {
    public static void main(String[] args) {
        Map<String, List<Carteira>> filter = new HashMap<>();
        List<Carteira> carteiras = new ArrayList<>();
        Carteira carteira1 = new Carteira();
        Carteira carteira2 = new Carteira();

        carteira1.setNum(10);
        carteira2.setNum(15);
        carteiras.add(carteira1);
        carteiras.add(carteira2);
        filter.put("carteiras", carteiras);

        buscarCarteiras(filter);
    }

    public static void buscarCarteiras(Map<String, List<Carteira>> param) {
        //aqui responde a sua dúvida
        for(Map.Entry<String, List<Carteira>> entry: param.entrySet()) { 
            for(Carteira c: entry.getValue()) {
                //na variavel `c` vc tem um objeto carteira
                System.out.println(c);
            }
        }
    }
}