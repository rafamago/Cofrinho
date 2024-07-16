public abstract class Moeda 
{
	//meus atributos
    protected double valor;

    //meu construtor
    public Moeda( double valor) 
    {
        this.valor = valor;
    }

    // método abstrato para converter o valor para real que é a moeda padrão e que vai ser sobrescrevido pelas classes filhas
    public abstract double converter(); 

    // meu metodo listar formata o valor em reais para vir duas casas decimais, e retorna também uma string com o nome da classe de cada tipo de moeda
    // o meu this get class pega o nome da minha classe e o get simple name retorna em string
    public String listar() 
    {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.valor);
    }
   
}