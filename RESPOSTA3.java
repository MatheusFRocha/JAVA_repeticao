import java.util.Scanner;

public class RESPOSTA3 {

	public static void main(String[] args) {
	
		
		  Scanner leitor = new Scanner(System.in);
	        int cont = 1;
	        int valor;
	        int soma = 0;
	        double media;;
	        
	        System.out.println("Digite 20 números");
	        do {
	            System.out.printf("%d:",cont);
	            valor = leitor.nextInt();
	            ++cont; 
	          soma = soma + valor;
	          
	        } while (cont <= 20);
	         
	         System.out.println("Essa é a soma dos valores"+soma);
	         
	         media = soma/20;
	         
	         System.out.println("Essa é a média"+media);
	         
	         
	        	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
