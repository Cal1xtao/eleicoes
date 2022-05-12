package exercicio_2_05;
import java.util.Scanner;
public class exercicio_2_05 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int quantidade,i,num = 0,pt=0,pdt=0,pl=0,psdb=0,nulo=0,branco=0;
		quantidade=0;		
		for (i=0; i<=2;i++) { ;
			
		do {
			System.out.printf("Menu:\nPT(13)\nPDT(12)\nPL(22)\nPSDB(45)\nVoto em branco(1)\nVoto em branco(0)\n");
			System.out.printf("Digite o numero do candidato em que deseja votar:\n");
			num=ler.nextInt();
			switch (num) {
			
		    case 13:		
		    System.out.printf("Voce votou no PT\n");	
		    pt=pt+1;
		    break;
		    
		    case 12:		    
	        System.out.printf("Voce votou no PDT\n");
	        pdt=pdt+1;
		    break;
		    
		    case 22:		   
		    System.out.printf("Voce votou no PL\n");
		    pl=pl+1;
		    break;
		    
		    case 45:		  
		    System.out.printf("Voce votou no PSDB\n");
		    psdb=psdb+1;
		    break;
		    
		    case 0:	 		    
		    System.out.printf("Voce votou nulo\n");
		    nulo=nulo+1;
		    break;
		    
		    case 1:	 		    
		    System.out.printf("Voce votou em branco\n");
		    branco=branco+1; 
		    break;
			}
			++quantidade;
		} while (quantidade<=50);
		System.out.printf("Total de votos atingido (50 votos)\n");
		System.out.printf("Total de votos em branco %d\n", branco);
		System.out.printf("Total de votos nulos %d\n", nulo);
		System.out.printf("Total de votos no PT %d\n", pt);
		System.out.printf("Total de votos no PDT %d\n", pdt);
		System.out.printf("Total de votos no PL %d\n", pl);
		System.out.printf("Total de votos no PSDB %d\n", psdb);
		}
	}	 
}