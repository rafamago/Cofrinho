public class Real extends Moeda 
{
	// criando meu construtor
    public Real(double valor) 
    {
        super(valor);
    }
    // usando polimorfismo para sobrescrever meu metodo da classe mãe 
    @Override
    public double converter() 
    {
        return this.valor; // valor padrão
    }
}