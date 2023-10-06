package org.example;

public class Main {
    public static void main(String[] args) {

        ContadorGlobal singleton = ContadorGlobal.getInstance();

        System.out.println(singleton.getContador());
        singleton.incrementar();
        singleton.incrementar();
        singleton.incrementar();
        System.out.println(singleton.getContador());

    }
}