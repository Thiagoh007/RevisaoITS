package Test.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTest {

	@Test
     public void testarSoma(){
		Calculadora calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double esperado = 4.0;
        Double resultado  = calculadora.somar(numero1, numero2);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
      public void testarSubtracao(){
    	Calculadora calculadora = new Calculadora();
        Double numero1 = 4.0;
        Double numero2 = 4.0;
        Double esperado = 0.0;


        Double resultado  = calculadora.subtrair(numero1, numero2);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testarMultiplicacao(){
    	Calculadora calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double esperado = 4.0;
        Double resultado  = calculadora.multiplicar(numero1, numero2);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testarDivisao() {
    	Calculadora calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double esperado = 1.0;

        Double resultado  = calculadora.dividir(numero1, numero2);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testarDivisaoComZero(){
    	Calculadora calculadora = new Calculadora();;
        Double numero1 = 2.0;
        Double numero2 = 0.0;
        Double esperado = -1.0;

        Double resultado = calculadora.dividir(numero1, numero2);
        Assertions.assertEquals(esperado, resultado);

    }

}
