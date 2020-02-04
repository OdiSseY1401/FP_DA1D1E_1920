package funciones1;
import javax.swing.JOptionPane;

public class F7 {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int num=Integer.parseInt(texto);
        
        String binario=decimalBinario(num);
        System.out.println("El numero "+num+ " en binario es "+binario);
        JOptionPane.showMessageDialog(null, "El numero "+num+ " en binario es "+binario);
        
        binario=decimalBinario2(num);
        System.out.println("El numero "+num+ " en binario es "+binario);
        JOptionPane.showMessageDialog(null, "El numero "+num+ " en binario es "+binario);
        
        binario=decimalBinario3(num);
        System.out.println("El numero "+num+ " en binario es "+binario);
        JOptionPane.showMessageDialog(null, "El numero "+num+ " en binario es "+binario);
    }
    
    public static String decimalBinario (int i){
        String binario="", digito;
          
        while(i>0){
        	if(i%2==1){
                digito="1";
            }else{
                digito="0";
            }
        	     	               
            //Se añade el digito al principio
            binario=digito+binario;
            i/=2;
        }
       
        return binario;
    }
    
    public static String decimalBinario2 (int numero){
        String binario="", digito;
        int i=numero;

        for(i=numero; i>0; i/=2){
            if(i%2==1) {
                digito="1";
            }else {
                digito="0";
            }
            //Se añade el digito al principio
            binario=digito+binario;
        }
        return binario;
    }
    
    public static String decimalBinario3 (int numero){
        String binario="";
        int i=numero;

        for(i=numero; i>0; i/=2)          
            binario=String.valueOf(i%2)+binario;          
       
        return binario;
    }
}

