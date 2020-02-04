package basicos2;

public class Ej3 {
  public static void main(String[] args) {
	 
		double a=3.5, b=5;
		int anios=0;
		while (a<=b) {
			anios++;
			a=a*1.07;//a+a*0.7
			b=b*1.05;//a+a*0.5
		}
		
		System.out.println("La ciudad a alcanza a la ciudad b en el año "+(1980+anios));	

	}

}