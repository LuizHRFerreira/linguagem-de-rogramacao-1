package CalculadoraDeFracao;

import java.util.Scanner;

public class CalculadoraDeFracao {

    private int numerador;
    private int denominador;

    /**
     * Construtor da classe CalculadoraDeFracao.
     * 
     * @param numerador   O numerador da fração.
     * @param denominador O denominador da fração. Deve ser diferente de zero.
     */
    public CalculadoraDeFracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador da fração não pode ser zero!");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Calcula o Máximo Divisor Comum (MDC) entre dois números.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O MDC dos dois números.
     */
    public int calcularMDC(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }

    /**
     * Simplifica a fração dividindo o numerador e o denominador pelo MDC.
     * 
     * @return Uma nova fração simplificada.
     */
    public CalculadoraDeFracao simplificar() {
        int mdc = calcularMDC(numerador, denominador);
        return new CalculadoraDeFracao(numerador / mdc, denominador / mdc);
    }

    /**
     * Soma a fração atual com outra fração.
     * 
     * @param outraFracao A outra fração a ser somada.
     * @return A fração resultante da soma, simplificada.
     */
    public CalculadoraDeFracao somar(CalculadoraDeFracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador + outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new CalculadoraDeFracao(novoNumerador, novoDenominador).simplificar();
    }

    /**
     * Subtrai outra fração da fração atual.
     * 
     * @param outraFracao A outra fração a ser subtraída.
     * @return A fração resultante da subtração, simplificada.
     */
    public CalculadoraDeFracao subtrair(CalculadoraDeFracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador - outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new CalculadoraDeFracao(novoNumerador, novoDenominador).simplificar();
    }

    /**
     * Divide a fração atual por outra fração.
     * 
     * @param outraFracao A outra fração pela qual a fração atual será dividida.
     * @return A fração resultante da divisão, simplificada.
     */
    public CalculadoraDeFracao dividir(CalculadoraDeFracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador;
        int novoDenominador = this.denominador * outraFracao.numerador;
        return new CalculadoraDeFracao(novoNumerador, novoDenominador).simplificar();
    }

    /**
     * Multiplica a fração atual por outra fração.
     * 
     * @param outraFracao A outra fração com a qual a fração atual será multiplicada.
     * @return A fração resultante da multiplicação, simplificada.
     */
    public CalculadoraDeFracao multiplicar(CalculadoraDeFracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new CalculadoraDeFracao(novoNumerador, novoDenominador).simplificar();
    }

    /**
     * Retorna uma representação em string da fração no formato "numerador/denominador".
     * 
     * @return A fração como uma string.
     */
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
