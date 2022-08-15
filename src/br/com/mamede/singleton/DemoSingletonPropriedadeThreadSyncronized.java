package br.com.mamede.singleton;

public class DemoSingletonPropriedadeThreadSyncronized {
    public static void main(String args[]){
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }

    //Runnable é uma interface, com o método run que deve ser usada para programação paralela em forma de Thread
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropriedadeSyncronized singleton = SingletonPropriedadeSyncronized.getInstance("Teste");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run(){
            SingletonPropriedadeSyncronized singleton = SingletonPropriedadeSyncronized.getInstance("Teste 1");
            System.out.println(singleton.getValue());
        }
    }
}
