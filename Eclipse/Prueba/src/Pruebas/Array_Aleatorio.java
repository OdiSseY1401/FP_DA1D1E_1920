package Pruebas;
import java.util.*;
public class Array_Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=20, max=100;
	}
	public static int aleatorio(int min, int max) {
		int ale;
		 Random rnd = new Random();
		ale = (int)(rnd.nextInt()*100);
		return ale;
	}
}
