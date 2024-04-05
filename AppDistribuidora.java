import java.util.Scanner;

public class AppDistribuidora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Bienvenido a la aplicación de la distribuidora de alimentos");
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edadUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Ingrese la marca del vehículo: ");
        String marcaVehiculo = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        String modeloVehiculo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada del vehículo: ");
        int cilindradaVehiculo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Ingrese el tipo de combustible del vehículo: ");
        String tipoCombustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros del vehículo: ");
        int capacidadPasajeros = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Mostrar los datos ingresados por el usuario
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre del usuario: " + nombreUsuario);
        System.out.println("Edad del usuario: " + edadUsuario);
        System.out.println("Marca del vehículo: " + marcaVehiculo);
        System.out.println("Modelo del vehículo: " + modeloVehiculo);
        System.out.println("Cilindrada del vehículo: " + cilindradaVehiculo);
        System.out.println("Tipo de combustible del vehículo: " + tipoCombustible);
        System.out.println("Capacidad en pasajeros del vehículo: " + capacidadPasajeros);

        // Cerrar el scanner
        scanner.close();
    }
}
