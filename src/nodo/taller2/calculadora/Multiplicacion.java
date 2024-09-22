package nodo.taller2.calculadora;

public class Multiplicacion extends Operacion{
    double multiplicacion;
    public Multiplicacion(double op1, double op2, char operacion) {
        super(op1, op2, '*');
        this.multiplicacion = op1 * op2;
        this.setRes(this.multiplicacion);
    }
}
