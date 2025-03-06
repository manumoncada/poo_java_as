package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("Manuel", 12000, 1234);
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan", 1300000, 5678);
        CuentaBancaria cuenta3 = new CuentaBancaria("Moncada", 152000, 9876);

        boolean inicio = true;

        while (inicio) {
            System.out.println("""
                    seleccione una de las siguientes opciones
                    
                    1 mostrar informacion de la cuenta bancaria
                    2 depositar dinero
                    3 retirar dinero
                    4 salir
                    
                    """);


            int g = teclado.nextInt();
            CuentaBancaria cuentaSeleccionada = null;

            if (g >= 1 && g <= 3) {
                System.out.print("Ingrese el número de cuenta: ");
                int numeroCuentaIngresado = new Scanner(System.in).nextInt();
                new Scanner(System.in);

                if (numeroCuentaIngresado == cuenta1.getNumeroCuenta()) {
                    cuentaSeleccionada = cuenta1;
                } else if (numeroCuentaIngresado == cuenta2.getNumeroCuenta()) {
                    cuentaSeleccionada = cuenta2;
                } else if (numeroCuentaIngresado == cuenta3.getNumeroCuenta()) {
                    cuentaSeleccionada = cuenta3;
                } else {
                    System.out.println("el numero de cuenta ingresado no es valido");
                }
            }

            switch (g) {
                case 1 ->{
                    System.out.println("la informacion de la cuenta seleccionada es: " + cuentaSeleccionada);

                }
                case 2-> {
                    System.out.print("Ingrese la cantidad que desea depositar: ");
                    int deposito = teclado.nextInt();
                    cuentaSeleccionada.depositoDinero(deposito);
                }

                case 3-> {
                    System.out.print("Ingrese la cantidad que desea retirar: ");
                    int retiro = teclado.nextInt();
                    cuentaSeleccionada.retiroDinero(retiro);
                }

                case 4-> {
                    System.out.println("finalizando el programa, feliz dia ");
                    inicio = false;
                }
                default->
                        System.out.println("por favor ingrese una opcion valida");
            }
        }
    }
}
