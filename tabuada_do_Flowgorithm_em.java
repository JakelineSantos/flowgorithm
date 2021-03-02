import java.util.*;
import java.lang.Math;

public class JavaApplication
{
    public static void main(String[] args)
    {
        int numero, tabuada, resultado, limite;
        
        numero = 0;
        tabuada = 9;
        limite = 90;
        resultado = numero * tabuada;
        while (numero <= 10)
        {
            resultado = numero * tabuada;
            System.out.println(Integer.toString(numero) + " x " + tabuada + " = " + resultado);
            numero = numero + 1;
        }
    }
}
