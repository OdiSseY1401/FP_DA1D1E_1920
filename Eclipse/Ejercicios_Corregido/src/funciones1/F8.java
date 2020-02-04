package funciones1;
import javax.swing.JOptionPane;
public class F8 {
    public static void main(String[] args) {
        int numero=0;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero positivo");
            numero=Integer.parseInt(texto);
        }while(numero<0);
        
        int numCifras=cuentaCifras(numero);
        
        //Controlamos en el caso de que haya una cifra o mas
        if (numCifras==1){
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifras");
        }
    }
    
    public static int cuentaCifras (int x){

         if (x < 0) {
             x = -x;
           }

           if (x == 0) {
             return 1;
           } else {
             int n = 0;
             while (x > 0) {
               x = x / 10; // se le quita un dígito a x
               n++; // incrementa la cuenta de dígitos
             }
             return n;
           }
         
    }
}