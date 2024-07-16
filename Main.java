import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
    	
    	//estou armazenando os valores e instanciando a classe que vou usar
        Cofrinho cofrinho = new Cofrinho();
        Scanner s = new Scanner(System.in);
        int opcao, tipoMoeda;
        double valor;
        String escolha = "Escolha a moeda desejada:\n 1 - Dólar\n 2 - Euro\n 3 - Real";

        // enquanto a opcao não for 5 ele vai ficar no loop até receber 5 e encerrar
        do
        {
        	System.out.println("Escolha o que deseja fazer:\n 1 - Adicionar moeda\n 2 - Remover moeda\n 3 - Listar moeda\n 4 - Calcular total em reais\n 5 - Sair");
        	opcao = s.nextInt();

        
	        switch ( opcao)
	        {
	        
	        	case 1:
	        		
	        		System.out.println(escolha);
	                tipoMoeda = s.nextInt();
	                
	                System.out.println("Digite o valor:");
	                valor = s.nextDouble();
	        		
	        		
	        		switch (tipoMoeda)
			        {
	        			// sendo um dos tipos escolhidos, ao escolher um é criado uma nova instancia do objeto na moeda escolhida e recebendo o parametro valor
			        	
			        	case 1 :
			        		cofrinho.adicionarMoedas(new Dolar(valor));
			        		break;
			        	case 2:
			        		cofrinho.adicionarMoedas(new Euro (valor));
			        		break;
			        	case 3:
			        		cofrinho.adicionarMoedas(new Real (valor));
			        		break;
			        	default:
			        		System.out.println("Tipo de moeda inválida, tente novamente");	        			        	
			       }
	        	break;
	        	
	        	case 2: 
	        		
	        		System.out.println(escolha);
	                tipoMoeda = s.nextInt();
	                
	                System.out.println("Digite o valor:");
	                valor = s.nextDouble();
	                
	                
	                switch (tipoMoeda)
			        {
			        	
			        	case 1 :
			        		cofrinho.removerMoeda(new Dolar(valor));
			        		break;
			        	case 2:
			        		cofrinho.removerMoeda(new Euro (valor));
			        		break;
			        	case 3:
			        		cofrinho.removerMoeda(new Real (valor));
			        		break;
			        	default:
			        		System.out.println("Tipo de moeda inválida, tente novamente");	        			        	
			       }
	        	
	            break;
	        	case 3:
	        		//lista as moedas armazenadas com o tipo de moeda e o valor
	        		cofrinho.listarMoedas();
	        		break;
	        	case 4:
	        		// calcula o valor convertido para reais do total das moedas armazenadas
	        		double total = cofrinho.verificarTotal();
	        		System.out.println("O valor total em reais é: " + total);
	        		break;
	        	case 5:
	        		System.out.println("Programa encerrado.");
	        		break;
	        		
	        	default:
	        		System.out.println("Opção inválida. Tente novamente");
	        		
	        		
	        }
        
        
     }
     while (opcao != 5);
     s.close();
    }
}

