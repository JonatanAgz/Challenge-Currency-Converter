package com.aluracursos.currencyconverter.metodos;

import com.aluracursos.currencyconverter.modelos.Moneda;

public class ConvertirMoneda {

    public static void convertirMoneda(Conexion conexion, String moneda, String monedaDestino, double valor) {
        Moneda resultado = conexion.cambioDeMoneda(moneda, monedaDestino, valor);
        System.out.println("La moneda actual es: " + resultado.base_code());
        System.out.println("La moneda a cambiar es: " + resultado.target_code());
        double valorDouble = Double.parseDouble(resultado.conversion_result());
        System.out.println("El resultado de la conversión de " + valor + " " + moneda + " a " + monedaDestino + " es igual a: " + String.format("%.2f", valorDouble) + " " + monedaDestino);
    }
}
