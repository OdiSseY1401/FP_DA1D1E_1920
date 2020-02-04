package explicacion;
import java.util.*;
public class ArrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n;
		/*do {
			System.out.println("Introducir número de componentes del array: ");
			n=teclado.nextInt();
		} while (n <= 0);*/
		n=5;
		char [] vocales = {'a', 'e', 'i', 'o', 'u'};
		System.out.println("\n Array con vocales \n");
		System.out.println(vocales);
		//Asi escribe la direccion del array
		System.out.println("\n Array convertido en srting \n");
		System.out.println("Vocales" + vocales);
		System.out.println("Vocales" + vocales.toString());
		
		char [] array1=new char[n];
		System.out.println("\nArray sin inicializar\n");
		System.out.println(array1);
		//Observamos como se intriducen espacios en blanco
		array1[0]='m';
		array1[2]='n';
		System.out.println("\nARRAY CON ALGUNOS VALORES\n");
		System.out.println("array" + array1);//Aqui se convierte en cadena
		System.out.println(array1);
		
		System.out.println("\n ARRAY CON ALGUNOS VALORES ESCRITO USANDO FUNCION\n");
		escribir(array1);
		
		//Creamos un String
		String s="Ordenador";
		
		System.out.println("\n ARRAY EN CHAR A PARTIR DE UNA CADENA\n");
		//Convierte una cadena en un arrat de caracteres
		char[] nuevo = s.toCharArray();
		System.out.println(nuevo);
		
		System.out.println("\n CADENA A PARTIR DE UN ARRAY DE CHAR\n");
		//Convierte un array de caracteres en una cadena
		s = new String(vocales);
		
		
		//Nuevo sigue teniendo sus datos
		System.out.println("*****");
		System.out.println(nuevo);
		System.out.println(s);
		System.out.println("*****");
		
		System.out.println("\n ULTIMO CARACTER DE UNA CADENA\n");
		//Imprimo el ultimo caracter
		System.out.println("Ultimo caracter " + s.charAt(s.length()-1));
		
		//String prueba="prueba"; System.out.println(prueba.replace('u','b'));
		
		int i= 0;
		System.out.println("\nELIMINAMOS EL ULTIMO CARACTER DE UNA CADENA\n");
		s=s.replace(s.charAt(s.length()-1), '\0');
		
		//s contiene las vocales, pero hemos borrado la ultima
		//Lo imprimimos caracter a caracter
		System.out.println("\nELIMINAMOS EL ULTIMO CARACTER DE UN ARRAY\n");
		while (s.charAt(i) != '\0') {
			System.out.println(s.charAt(i));
			i++;
		}
		
		System.out.println();
		
		//nuevo contiene ordenador
		//hacemos lo mismo, aunque en este caso es un String
		//internamente es un array de char
		nuevo[nuevo.length-1]='\0';
		i=0;
		while (nuevo[i] != '\0') {
			System.out.println(nuevo[i]);
			i++;
		}
			System.out.println();
			i=0;
			String linea="Hola que tal";
			String[] lineas=linea.split(" ");
			while (lineas[i] != " ") {
			System.out.println(lineas[i]);
			i++;
			/*for (int i=0;i<linea.length();i++){
			 * System.out.println(linea.charAt(i));
			 * if (linea.charAt(i)==' ') // separa las palabras por espacios
			 * System.out.println()}
			 */
		}
	}
		static void rellenar(char[] a,Scanner tec) {
			for(int i=0;i<a.length;i++) {
			System.out.println("Introducir valor en el array");
			a[i]=(char) (tec.next().charAt(0));
			}
		}
		
		static void escribir(char[] a) {
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
			System.out.println();
		}
	}

