package EjEntregar;
import java.util.Scanner;
public class Avanzado4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int min;
	    System.out.println("Dime los min: ");
	    min = sc.nextInt();
	    double dias = (min / 1440), acum = (min % 1440),horas = (acum / 60), minu = (acum % 60);
	    long iDias = (long) dias;
	    long iHoras = (long) horas;
	    System.out.println("Dias: "+ iDias + " Horas: " + iHoras + " Minutos: " + minu);
	    sc.close();
	    }

	}
