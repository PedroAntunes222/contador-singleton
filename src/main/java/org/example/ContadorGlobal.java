package org.example;

public final class ContadorGlobal {
    private static ContadorGlobal instancia;
    private int contador = 0;

    private ContadorGlobal(){
    }

    public static ContadorGlobal getInstance()
    {
        if (instancia == null) {
            instancia = new ContadorGlobal();
        }
        return instancia;
    }

    public void incrementar(){
        contador++;
    }

    public int getContador(){
        return contador;
    }
}
