import java.util.Scanner;

public class datosConsola {
    
    public static void main(String[] args) {
        
        // entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        
        // declarar variables con literal de información
        //byte edad = 127; // 1 byte, -128 a 127
        //float estatura = 1.76f; // 4 bytes, -3.40282347E+38 a 3.40282347E+38
        //double  salario = 4.000;

        int edad;
        String nombre;
        float estatura;
        char letra;

        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Digite el nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Digite la estatura: ");
        estatura = entrada.nextFloat();

        System.out.println("Digite una letra: ");
        letra = entrada.next().charAt(0);
        
        //imprimir datos por consola
        System.out.println("La edad del estudiante es: " + edad + " anios");
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La estatura del estudiante es: " + estatura + " metros");
        System.out.println("La letra es: " + letra);
    }
}
