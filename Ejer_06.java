import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese horas: ");
        int horas = sc.nextInt();
        System.out.print("Ingrese minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Ingrese segundos: ");
        int segundos = sc.nextInt();
        int totalsegundos = (horas * 3600) + (minutos * 60) + segundos;
        System.out.println("El equivalente en segundos es: " + totalSegundos);
        
        sc.close();
    }
}