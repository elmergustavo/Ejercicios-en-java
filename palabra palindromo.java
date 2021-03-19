package palindromo;

import java.util.Scanner;

/**
 *
 * @author elmer
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        String palabra = entrada.next();
        
        if (palindrome(palabra)){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }
        
        
    }
    
    public static boolean Palindromo(String s){
        
        for (int i=0, j=s.length()-1; i<j; ++i,--j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean palindrome(String s){
        return (s.equals(new StringBuilder(s).reverse().toString()));
    }
}
