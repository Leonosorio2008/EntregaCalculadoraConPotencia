package nodo.taller2.calculadora;

import  java.util.Scanner;

public class CalculadoraFinal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double op1, op2;
        char operacion;
        System.out.println("Ingrese el primer numero: ");
        op1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        op2 = sc.nextDouble();
        System.out.println("Ingrese la operacion a realizar: ");
        operacion = sc.next().charAt(0);
        switch (operacion) {
            case '+':
                Suma suma = new Suma(op1, op2, operacion);
                suma.mostrarResultado();
                break;
            case '-':
                Resta resta = new Resta(op1, op2, operacion);
                resta.mostrarResultado();
                break;
            case '*':
                Multiplicacion multiplicacion = new Multiplicacion(op1, op2, operacion);
                multiplicacion.mostrarResultado();
                break;
                case '^':
                Potencia potencia = new Potencia(op1, op2, operacion);
                potencia.mostrarResultado();
                break;
            case '/':
                Division division = new Division(op1, op2, operacion);
                division.mostrarResultado();
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
    }
}
