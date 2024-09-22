package nodo.taller2.calculadora;

public class Potencia extends Operacion{
    double potencia;
    public Potencia(double op1, double op2, char operacion) {
        super(op1, op2, '^');
        this.potencia = Math.pow(op1, op2);
        this.setRes(this.potencia);
    }
}
