import java.util.Scanner;

public class RESPOSTA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    Scanner leitor = new Scanner(System.in);
        int cont = 1;
        int valor;
        int maior = 0;
        System.out.println("Digite 15 números");
        do {
            System.out.printf("%d:",cont);
            valor = leitor.nextInt();
            cont++;
            
            if(valor > maior){
                maior = valor;
            }
            
            
        } while (cont <= 15);
        System.out.println("O maior número digitado é:"+maior);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
