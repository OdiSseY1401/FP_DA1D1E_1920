package EjerciciosBasicos3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=0, num3=0,y=0;
		
		do {
			if (num3 > 9) {
				num3=0;
				num2++;
			}
			if (num2 > 9) {
				num2=0;
				num1++;
			}
			if (num1==3 && num2==3 && num3==3) {
				System.out.println("E" + "-" + "E" + "-" + "E");
			}
			else if (num1==3 && num2==3) {
				System.out.println("E" + "-" + "E" + "-" + num3);
			}
			else if (num1==3 && num3==3) {
				System.out.println("E" + "-" + num2 + "-" + "E");
			}
			else if (num1==3) {
				System.out.println("E" + "-" + num2 + "-" + num3);
			}
			else if(num2==3 && num3==3) {
				System.out.println(num1 + "-" + "E" + "-" + "E");
			}
			else if (num2==3) {
				System.out.println(num1 + "-" + "E" + "-" + num3);
			}
			else if(num3==3) {
				System.out.println(num1 + "-" + num2 + "-" + "E");
			}
			else {
				System.out.println(num1 + "-" + num2 + "-" + num3);
			}
			
			num3++;
			y++;
		} while (y<1000);
	}

}
