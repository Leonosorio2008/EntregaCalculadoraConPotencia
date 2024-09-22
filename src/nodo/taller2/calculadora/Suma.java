package nodo.taller2.calculadora;

public class Suma extends Operacion{
    double suma;

    public Suma(double op1, double op2, char operacion) {
        super(op1, op2, '+');
        this.suma = op1 + op2;
        this.setRes(this.suma);
    }


}
