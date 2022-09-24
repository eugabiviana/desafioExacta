package com.exacta.desafio.gasto;

public class ResourceNotFoundExeception extends RuntimeException {
//        cógigo padrão

    private static final long serialVersionUID = 1L;
    public ResourceNotFoundExeception(String msg){
        super(msg);
    }

}
