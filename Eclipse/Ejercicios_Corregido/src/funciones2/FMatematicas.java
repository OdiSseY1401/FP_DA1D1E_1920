package funciones2;

public class FMatematicas {

	 /**
	   * Le da la vuelta a un numero.
	   *
	   * @param x numero al que se le quiere dar la vuelta
	   * @return  numero volteado (al reves)
	  */
	  public static long voltea(long x) {
	    if (x < 0)
	      return -voltea(-x);

	    long volteado = 0;

	    while(x > 0) {
	      volteado = (volteado * 10) + (x % 10);
	      x = x / 10;
	    }

	    return volteado;
	  }
	  

  /**
   * Devuelve verdadero si el numero que se pasa como parametro es capicua y
     falso en caso contrario.
   * <p>
   * Un numero capicua es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   * 
   * @param x numero del que se quiere saber si es capicua
   * @return  verdadero si el numero que se pasa como parametro es capicua y
   *          falso en caso contrario
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }


  /**
   * Cuenta el numero de digitos de un numero entero.
   *
   * @param x numero al que se le quieren contar los digitos
   * @return  numero de digitos que tiene el numero que se pasa como parámetro
   */
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; // se le quita un digito a x
        n++; // incrementa la cuenta de digitos
      }
      return n;
    }
  }
  
  /**
   * Devuelve el digito que esta en la posicion <code>n</code> de un numero
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x numero long
   * @param n posicion dentro del numero <code>x</code>
   * @return  digito que esta en la posicion n del numero <code>x</code>
   *          empezando a contar por el 0 y de izquierda a derecha
   */
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int)x % 10;
  }
  
  /**
   * Da la posicion de la primera ocurrencia de un digito dentro de un numero
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param x numero long
   * @param d digito a buscar dentro del numero
   * @return  posicion de la primera ocurrencia del digito dentro del numero o
   *          -1 si no se encuentra
   */
  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++);

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }
  
  /**
   * Le quita a un numero <code>n</code> digitos por detras (por la derecha). 
   *
   * @param x numero long
   * @param n numero de digitos que se le van a quitar
   * @return  numero inicial <code>x</code> con <code>n</code> digitos menos
   *          quitados de la derecha
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }

  /**
   * Le quita a un numero <code>n</code> digitos por delante (por la izquierda).                                                
   * @param x numero long
   * @param n numero de digitos que se le van a quitar
   * @return  numero inicial <code>x</code> con <code>n</code> digitos menos
   *          quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el numero por si acaso termina en 0
    //System.out.println("x " + x);
    x = voltea(quitaPorDetras(voltea(x), n));
    //System.out.println("x " + x);
    x = quitaPorDetras(x, 1);
    return x;
  }
 
  /**
   * Añade un digito a un numero por detras (por la derecha).
   *
   * @param x numero entero
   * @param d digito que se le va a pegar por la derecha
   * @return  numero inicial <code>x</code> con el digito <code>d</code> pegado
   *          por la derecha
   */
  
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }
  

  /**
   * Añade un entero a un numero por delante (por la izquierda).
   *
   * @param x numero entero
   * @param d digito que se le va a pegar por la izquierda
   * @return  numero inicial <code>x</code> con el digito <code>d</code> pegado
   *          por la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  
  /**
   * Toma como parametros las posiciones inicial y final dentro de un numero y
   * devuelve el trozo correspondiente.
   * <p>
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      numero entero
   * @param inicio posicion inicial
   * @param fin    posicion final
   * @return       trozo de numero compuesto por todos los digitos que van desde
   *               la posicion inicial a la posicion final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  // Las siguientes se usan como funciones auxiliares
  
  /**
   * Pega dos numeros para formar uno solo.
   *
   * @param x trozo que se pegara por la izquierda
   * @param y trozo que se pegara por la derecha
   * @return  numero compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }
  
  /**
   * Dada una base y un exponente, devuelve la potencia.
   *
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return          numero resultante de elevar la base a la potencia indicada
   */
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }
    else if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }
    else {
	    int n = 1;
	
	    for (int i = 0; i < Math.abs(exponente); i++) {
	      n = n * base;
	    }
	
	    return n;
    }
  }
   
}
