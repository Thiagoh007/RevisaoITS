package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
    void testarSoma(){
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double esperado = 4.0;
        Double resultado  = Calculadora.somar(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testarSubtracao(){
        calculadora = new Calculadora();
        Double numero1 = 4.0;
        Double numero2 = 4.0;
        Double esperado = 0.0;


        Double resultado  = calculadora.subtrair(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testarMultiplicacao(){
        calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double esperado = 4.0;
        Double resultado  = calculadora.multiplicar(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testarDivisao() {
        calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 2.0;
        Double esperado = 1.0;

        Double resultado  = calculadora.dividir(numero1, numero2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testarDivisaoComZero(){
        calculadora = new Calculadora();
        Double numero1 = 2.0;
        Double numero2 = 0.0;
        Double esperado = -1.0;

        Double resultado = calculadora.dividir(numero1, numero2);
        Assertions.assertEquals(expected, result);

    }

}
