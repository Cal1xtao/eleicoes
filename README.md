# eleicoes
package exercicio_2_05;
import java.util.Scanner;
public class exercicio_2_05 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		//Setando e inicializando todas as variáveis que irão ser utilizadas
		int quantidade,i,num = 0,pt=0,pdt=0,pl=0,psdb=0,nulo=0,branco=0;
		quantidade=0;
		//For para repetir a impressão do menu e da frase pedindo para digitar o voto da pessoa
		for (i=0; i<=49;i++) { ;
			
		
			//Imprimindo menu
			System.out.printf("Menu:\nPT(13)\nPDT(12)\nPL(22)\nPSDB(45)\nVoto em branco(1)\nVoto em branco(0)\n");
			//Imprimindo a frase pedindo para digitar o numero do candidato
			System.out.printf("Digite o numero do candidato em que deseja votar:\n");
			//Lendo numero digitado
			num=ler.nextInt();
			//Switch para separar o voto que a pessoa digitou
			switch (num) {
			//Caso a pessoa digite 13
		    case 13:
		    	//Imprimindo frase "Voce votou no PT"
		    System.out.printf("Voce votou no PT\n");
		    //Somando o voto para saber quantos votos o partido recebeu
		    pt=pt+1;
		    break;
		    //Caso a pessoa digite 12
		    case 12:	
		    	//Imprimindo frase "Voce votou no PDT"
	        System.out.printf("Voce votou no PDT\n");
	        //Somando o voto para saber quantos votos o partido recebeu
	        pdt=pdt+1;
		    break;
		    //Caso a pessoa digite 22
		    case 22:
		    	//Imprimindo "Voc votou no PL"
		    System.out.printf("Voce votou no PL\n");
		    //Somando o voto para saber quantos votos o partido recebeu
		    pl=pl+1;
		    break;
		    //Caso a pessoa digite 45
		    case 45:		
		    	//Imprimindo "Voc votou no PSDB"
		    System.out.printf("Voce votou no PSDB\n");
		    //Somando o voto para saber quantos votos o partido recebeu
		    psdb=psdb+1;
		    break;
		    //Caso a pessoa digite 0
		    case 0:	
		    	//Imprimindo "Voc votou nulo"
		    System.out.printf("Voce votou nulo\n");
		    //Somando o voto para saber quantos votos o partido recebeu
		    nulo=nulo+1;
		    break;
		    //Caso a pessoa digite 1
		    case 1:	 	
		    	//Imprimindo "Voc votou em branco"
		    System.out.printf("Voce votou em branco\n");
		    //Somando o voto para saber quantos votos o partido recebeu
		    branco=branco+1; 
		    break;
			}
			
			
		//Imprimindo que o total de votos foi atingido
		System.out.printf("Total de votos atingido (50 votos)\n");
		//Imprimindo que o total de votos
		System.out.printf("Total de votos em branco %d\n", branco);
		//Imprimindo que o total de votos
		System.out.printf("Total de votos nulos %d\n", nulo);
		//Imprimindo que o total de votos
		System.out.printf("Total de votos no PT %d\n", pt);
		//Imprimindo que o total de votos
		System.out.printf("Total de votos no PDT %d\n", pdt);
		//Imprimindo que o total de votos
		System.out.printf("Total de votos no PL %d\n", pl);
		//Imprimindo que o total de votos
		System.out.printf("Total de votos no PSDB %d\n", psdb);
		}
	}	 
}
}![Eleições](https://user-images.githubusercontent.com/101893557/168132634-7fb85af0-2b90-4c87-9a25-4bcbeedfe777.jpeg)
