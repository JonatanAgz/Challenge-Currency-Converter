import com.aluracursos.currencyconverter.metodos.Conexion;
import com.aluracursos.currencyconverter.metodos.ConvertirMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conexion conexion = new Conexion();

        boolean continuar = true;

        System.out.println("Bienvenido al conversor de monedas!");

        while (continuar) {
            System.out.println("Ingrese una opción de la siguiente lista: ");

            System.out.println("Menú de opciones: " +
                    "1: Cambio de USD a COP\n" +
                    "2: Cambio de USD a CLP\n" +
                    "3: Cambio de USD a ARS\n" +
                    "4: Cambio de COP a USD\n" +
                    "5: Cambio de CLP a USD\n" +
                    "6: Cambio de ARS a USD");

            String moneda = null;
            String monedaDestino = null;
            int opcion = -1;
            while (true) {
                System.out.print("Seleccione una opción: ");
                String entrada = scanner.next();
                try {
                    opcion = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Opción inválida, por favor ingrese un número entre 1 y 7.");
                }
            }

            switch (opcion) {
                case 1:
                    moneda = "USD";
                    monedaDestino = "COP";
                    break;
                case 2:
                    moneda = "USD";
                    monedaDestino = "CLP";
                    break;
                case 3:
                    moneda = "USD";
                    monedaDestino = "ARS";
                    break;
                case 4:
                    moneda = "COP";
                    monedaDestino = "USD";
                    break;
                case 5:
                    moneda = "CLP";
                    monedaDestino = "USD";
                    break;
                case 6:
                    moneda = "ARS";
                    monedaDestino = "USD";
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Finalizando el programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción invalida, ingrese una opción valida");
            }
            if (opcion < 6  ) {
                System.out.println("Ingrese el valor que desea convertir: ");
            }
            double valor = scanner.nextDouble();
            if (moneda != null) {
                ConvertirMoneda.convertirMoneda(conexion, moneda, monedaDestino, valor);
            }
        }
    }
}