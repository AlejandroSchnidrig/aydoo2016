package ar.edu.untref.aydoo;

public class Program 
{
    public static final void main(String arg[])
    {
        FactoresPrimos factores = new FactoresPrimos();
        int numero = Integer.parseInt(arg[0]);
        factores.calcularFactoresPrimos(numero);
        System.out.println("Factores primos " + numero + ":" + factores.getLista().toString());
    }
} 
