import java.util.Scanner;

public class RESPOSTA1 {

	public static void main(String[] args) {

	      Scanner leitor = new Scanner(System.in); 
	        int valor;
	        int numero = 1;  
	    	
	        
	        
	        
	        System.out.println("Digite os valores");

	        
	        do {  
	        	            System.out.printf("%d: ", numero);
	             valor = leitor.nextInt();      
	           
	         
	          if(valor > 0){
	            System.out.println("O valor é positivo");
	           }else{
	            System.out.println("O valor é negativo");
	           }
	          numero++;
	        } while ( numero < 11);
	        
	        
	       
	            
	        
	                 
	              
	    }
	    
	}