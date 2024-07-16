package com.aluracursos.currencyconverter.excepciones;

public class ErrorOpcionEquivocada extends RuntimeException {

    private String mensaje;

    public ErrorOpcionEquivocada(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }


}
