public class Euro extends Moeda 
{
	//criando meu construtor
    public Euro(double valor) 
    {
        super (valor);
    }

    // usando polimorfismo para sobrescrever meu metodo da classe mãe 
    @Override
    public double converter() 
    {
        return this.valor * 6.0; // valor atual
    }
}