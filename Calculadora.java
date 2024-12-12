package org.example;

public class Calculadora {
private int num1;
private char operador;
private int num2;

public Calculadora() {
}
public Calculadora(int num1,char operador, int num2) {
    this.num1 = num1;
    this.operador = operador;
    this.num2 = num2;
}

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    private int sumar(){
    return num1 + num2;
    }
    private int restar(){
    return num1 - num2;
    }
    private int multiplicar(){
    return num1 * num2;
    }
    private int dividir(){
        return num1 / num2;
    }
    private int porcentaje(){
        return (num1 * num2) / 100;
    }

    public void imprimir(){
    switch(operador){
        case '+':
            System.out.println(num1 + " + " + num2 + " = " + sumar());
            break;
        case '-':
            System.out.println(num1 + " - " + num2 + " = " + restar());
            break;
        case '*':
            System.out.println(num1 + " * " + num2 + " = " + multiplicar());
            break;
        case "/":
            System.out.println(num1 + " / " + num2 + " = " + dividir())
        case '%':
            System.out.println(num1 + " % " + num2 + " = " + porcentaje());
            break;
    }
    }
}
