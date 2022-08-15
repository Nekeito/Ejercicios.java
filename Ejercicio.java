import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int [] a = new int [10];
        int [] b = new int [10];
        int [] c = new int [20];
        int j=0;

        // llenando el primer arreglo
        System.out.println("Digite los numeros del primer arreglo");
        for(int i=0; i<10; i++){
            System.out.print("\n" + (i+1) + " Digite un numero: ");
            a[i] = numeros.nextInt();
        }
        // llenando el segundo arreglo
        System.out.println("\n Digite los numeros del segundo arreglo");
        for(int i=0; i<10; i++){
            System.out.print("\n" + (i+1) + " Digite un numero: ");
            b[i] = numeros.nextInt();
        }

        //Organizando los arreglos a y b en el arrelo c
        System.out.println("Ordenando el arreglo C ");
        for(int i=0; i<10; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("\nEl arreglo c es el siguiente: ");
        for(int i=0; i<20; i++){
            System.out.println(c[i]);
        }

    }
}
