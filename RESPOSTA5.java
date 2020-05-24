import java.util.Scanner;

public class RESPOSTA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		  Scanner leitor = new Scanner(System.in);
	        int cont = 1;
	        double soma = 0;
	        float maior = 0;
	        float menor = 0;
	        double salario;
	        float altura;
	        String sexo ;
	        String quant = "f";
	        
	        System.out.println("Cadastro dos empregados");
	        do {
	            System.out.printf("%dº - Pessoa\n",cont);
	            System.out.print("Altura:");
	            altura = leitor.nextFloat();
	            System.out.print("Sexo(M/F):");
	            sexo = leitor.next();
	            System.out.print("Salário:");
	            salario = leitor.nextFloat();
	            cont++;
	            soma = soma+ salario/20;
	            if(altura > maior){
	                altura = maior;
	            }if(altura < menor){
	                altura = menor;
	            }if(!(quant ==sexo)){
	                quant = sexo;
	            } 
	            
	        } while (cont <= 20);
	        
	        System.out.println("Média salárial:"+soma);
	        System.out.println("Maior altura:"+maior 
	            +"\nMenor altura:"+ menor);
	       System.out.println("quantidade de mulheres com salário até R$1.000,00 :"+quant);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
