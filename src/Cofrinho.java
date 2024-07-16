import java.util.ArrayList;

public class Cofrinho 
{
	
	//criei uma lista de arrays
    private ArrayList<Moeda> moedas;

    
    //criei meu construtor que adiciona as moedas na lista de acordo com o tipo escolhido
    public Cofrinho() {
        moedas = new ArrayList<>();
        moedas.add(new Real(0));
        moedas.add(new Dolar(0));
        moedas.add(new Euro(0));
    }

    // meu metodo adicionar moedas tem como parametro a moeda escolhida e se a moeda escolhida for igual a existente ele vai adicionar o valor e exibir
    public void adicionarMoedas(Moeda m) 
    {
        for (Moeda moeda : moedas) {
            if (moeda.getClass().equals(m.getClass())) 
            {
                moeda.valor += m.valor;
                System.out.println("Valor de " + moeda.getClass().getSimpleName() + " na conta: " + moeda.valor);
            }
        }
    }

    //meu metodo de remover moeda vai verificar se tem a moeda solicitada e se tiver vai retirar o valor solicitado da moeda e exibir, se não ele vai dar mensagem de saldo insuficiente e mostrar o valor disponível
    public void removerMoeda(Moeda m) 
    {
        for (Moeda moeda : moedas) 
        {
            if (moeda.getClass().equals(m.getClass())) 
            {
                if (moeda.valor > 0 && moeda.valor > m.valor) 
                {
                    moeda.valor -= m.valor;
                    System.out.println("Valor de " + moeda.getClass().getSimpleName() + " na conta: " + moeda.valor);
                } 
                else 
                {
                    System.out.println("Saldo insuficiente\nVocê tem " + moeda.getClass().getSimpleName() + ": " + moeda.valor);
                }
            }
        }
        moedas.remove(m);
    }
    
    //vai listar as moedas e valores disponiveis no cofre
    public void listarMoedas() 
    {
        for (Moeda m : moedas) 
        {
            System.out.println(m.listar());
        }
    }
    
    //vai calcular o total do valor de todas as moedas convertidas para a moeda padrão que é o real

    public double verificarTotal() 
    {
        double total = 0;
        for (Moeda m : moedas) 
        {
            total += m.converter();
        }
        return total;
    }
}
