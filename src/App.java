import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa 3 números:");
        Scanner consola = new Scanner(System.in);
        int n1 = consola.nextInt();
        int n2 = consola.nextInt();
        int n3 = consola.nextInt();
        consola.close();
        //hola

        System.out.println("La suma da: " + suma(n1, n2, n3));
    }

    public static int suma(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
