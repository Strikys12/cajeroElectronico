
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidadVeces = 3;
        String usuario = "lordmefisto";
        String contrasena = "1234";

        for (int i = 1; i <= 3; i++) {

            System.out.print("Ingrese su usuario");
            usuario = sc.nextLine();

            System.out.print("Ingrese su contraseña: ");
            contrasena = sc.nextLine();

            if (usuario.equals("lordmefisto") && contrasena.equals("1234")) {
                System.out.println("¡Bienvenido al cajero electrónico!");

            } else {
                cantidadVeces--;
                System.out.println("Usuario y/o contrasena incorrectos, le quedan: " + cantidadVeces  + " intentos");
                
               
            }

            
        }

        System.out.println("Ha alcanzado el limite de intentos, contacte a su administrador.");


    }
}
