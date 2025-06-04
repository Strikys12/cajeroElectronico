
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidadVeces = 3;
        int saldoCuenta = 250000;
        int saldoRestante = 250000;
        int opcion = 0;
        int transacciones = 0;

        for (int i = 1; i <= 3; i++) {
            String usuario = "lordmefisto";
            String contrasena = "1234";

            System.out.print("Ingrese su usuario: ");
            usuario = sc.nextLine();

            System.out.print("Ingrese su contraseña: ");
            contrasena = sc.nextLine();

            if (usuario.equals("lordmefisto") && contrasena.equals("1234")) {

                int valorRetirar = 0;
                int valorConsignar = 0;

                System.out.println("¡Bienvenido al cajero electrónico!");

                for (opcion = 1; opcion != 5;) {

                    System.out.println(
                            "Seleccione una opción\n1 - Consultar Saldo\n2 - Retirar dinero\n3 - Transferir\n4 - Depositar a una cuenta propia\n5 - Cerrar sesión");
                    opcion = sc.nextInt();

                    switch (opcion) {

                        case 1:
                            System.out.println("Su saldo es: " + saldoRestante);
                            transacciones++;
                            break;

                        case 2:
                            System.out.println("Ingrese el valor que desea retirar: ");
                            valorRetirar = sc.nextInt();
                            saldoRestante = saldoRestante - valorRetirar;
                            if (valorRetirar > saldoCuenta) {
                                System.out
                                        .println("El valor a retirar supera el limite de su saldo, intentelo de nuevo");

                            } else {

                                if (valorRetirar > saldoCuenta) {
                                    System.out
                                            .println(
                                                    "El valor a consignar supera el limite de su saldo, intentelo de nuevo");

                                } else {

                                    if (valorRetirar - saldoCuenta == 0) {
                                        System.out.println("La cuenta no puede quedar en 0");

                                    } else {
                                        System.out.println("Transferencia realizada con éxito, su saldo es: "
                                                + (saldoCuenta - valorRetirar));
                                        transacciones++;
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Ingrese el valor que desea consignar: ");
                            valorConsignar = sc.nextInt();
                            saldoRestante = saldoRestante - valorConsignar;

                            if (valorConsignar > saldoCuenta) {
                                System.out
                                        .println(
                                                "El valor a consignar supera el limite de su saldo, intentelo de nuevo");

                            } else {

                                if (valorConsignar - saldoCuenta == 0) {
                                    System.out.println("La cuenta no puede quedar en 0");

                                } else {
                                    System.out.println("Transferencia realizada con éxito, su saldo es: "
                                            + (saldoCuenta - valorConsignar));
                                    transacciones++;
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Ingrese el valor que desea depositar: ");
                            valorConsignar = sc.nextInt();
                            saldoRestante = saldoRestante - valorConsignar;
                            if (valorConsignar > saldoCuenta) {
                                System.out
                                        .println(
                                                "El valor a depositar supera el limite de su saldo, intentelo de nuevo");

                            } else {

                                if (valorConsignar - saldoCuenta == 0) {
                                    System.out.println("La cuenta no puede quedar en 0");

                                } else {
                                    System.out.println("Deposito realizada con éxito.\nSu saldo restante es: "
                                            + (saldoCuenta - valorConsignar));
                                    transacciones++;
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Cerrando sesión");
                            i = 5;
                            break;

                    }
                }

            } else {
                cantidadVeces--;
                System.out.println("Usuario y/o contrasena incorrectos, le quedan: " + cantidadVeces + " intentos");

            }

        }

        if (opcion == 5) {
            System.out.println("Muchas gracias por utilizar nuestro servicio.\n Transacciones realizadas con éxito: "
                    + transacciones);

        } else {
            System.out.println("Ha alcanzado el limite de intentos, contacte a su administrador.");

        }

    }

}
