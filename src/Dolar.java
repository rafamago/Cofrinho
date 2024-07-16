public class Dolar extends Moeda 
{
    public Dolar(double valor) 
    {
        super(valor);
    }

    @Override
    public double converter() 
    {
    	 // usando polimorfismo para sobrescrever meu metodo da classe mãe 
        return this.valor * 5.0;
    }
}