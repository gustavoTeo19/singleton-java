package br.com.mamede.singleton;

public class DamoSingletonPropriedade {
    public static void main(String args[]){
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("chegou");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
