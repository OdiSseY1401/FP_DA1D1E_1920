package explicacion;

public class Printf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character l = 'a';
		System.out.printf("%c %n", l); //Lo pone en minus
		System.out.printf("%C %n", l); //Lo pone en mayus
		
		l='A';
		System.out.printf("%c %n", l); //Lo mismo
		System.out.printf("%C %n", l); //Lo mismo
		
		double n = -1.25036;
		System.out.printf("%(10.2f %n", n);
		
		int v = -10;
		System.out.printf("%(10d %n",v);
		
		double q = 1.0/3.0;
		System.out.printf("1.0/3.0 = %5.3f %n", q);
		System.out.printf("1.0/3.0 = %7.5f %n", q);
		
		q = 1.0/2.0;
		System.out.printf("1.0/2.0 = %09.3f %n", q);
		q = 1000.0/3.0;
		System.out.printf("1000.0/2.0 = %7.1e %n",q);
		q= 3.0/4567.0;
		System.out.printf("3.0/4567.0 = %7.3e %n" , q);
		q = -1.0/0.0;
		System.out.printf("-1.0/0.0 = %7.2e %n" , q);
		q = 0.0/0.0;
		System.out.printf("0.0/0.0 = %5.2e %n" , q);
		System.out.printf("pi= %5.3f; e = %10.4f %n" , Math.PI, Math.E);
		
		double r = 1.1;
		System.out.printf("%1$.5f *%1$.5f %n", Math.PI,r);
		System.out.printf("%1$6.6f *%1$6.6f %n", Math.PI,r);
		
		System.out.printf("C = 2 * %1$5.5f * %2$4.1f, " + "A = %2$4.1f * %2$4.1f * %1$5.5f %n" , Math.PI,r);
		
		System.out.printf("%1$.5f *%2$8.5f %n", Math.PI,r);
		
	}

}
