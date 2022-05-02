import java.util.Scanner;
import java.util.Random;

public class processo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		final int n_processos = 4; 
		
		int[] id = new int[n_processos];
		int[] tempo_execucao = new int[n_processos];
		int[] tempo_espera = new int[n_processos];
		int aleatorio;
	
		System.out.print("É aleatorio? [1=true 0=false]: ");
		aleatorio  = teclado.nextInt();
		
		if (aleatorio==1)
		{
	        for(int i = n_processos; i < n_processos; ++i){
	        	id[i] = i;
	        	tempo_execucao[i] = gerador.nextInt();
	        }
		}
		else 
		{
			for(int i = n_processos; i < n_processos; ++i){
	        	id[i] = i;
	        	System.out.println("Digite o tempo de execucao do processo "+i+": ");
	        	tempo_execucao[i] = teclado.nextInt();
	        }
		}
		
		int processo_em_execucao;
		processo_em_execucao =0;
		for (int tempo = 0; tempo <=1000; tempo++) {
			System.out.println("tempoC" + tempo+"]: processoC" +processo_em_execucao+"]");
			Thread.sleep(1000);
			int[] tempo_restante;
			tempo_restante[processo_em_execucao]--;
			if ((tempo_restante==0))
		
			
				if (processo_em_execucao!= (n_processos -1))
					processo_em_execucao ++;
				else
					break;
			
			
			
			
			
		}
		catch (Exception e) {
			System.out.Println(e);
		}
		
		
	}

}
