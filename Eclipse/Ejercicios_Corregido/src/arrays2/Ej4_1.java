package arrays2;
import java.util.Scanner;
class Nif {

    private int dni;
    private char letra;

    //Constructores
    public Nif() {
    }

    public Nif(int dni) {
        this.dni = dni;
        letra = calcularLetra();
    }

    //Metodo para calcular la letra del NIF
    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni % 23];
    }

    //Método para leer por teclado el número de DNI y calcular la letra
    public void leer(Scanner sc) {      
        do {
            System.out.print("Introduce dni: ");
            dni = sc.nextInt();
        } while (dni <= 0);
        letra = calcularLetra();       
    }

    //Método que devuelve un String de la forma 99999999-X
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dni);
        sb.append("-");
        sb.append(letra);
        return sb.toString();
    }

}


//Clase Principal para probar el ejercicio:
public class Ej4_1 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
       
    	Nif nif1 = new Nif();
        nif1.leer(sc);
        System.out.println(nif1);

        Nif nif2 = new Nif(12345678);
        System.out.println(nif2);

        sc.close();
    }
}