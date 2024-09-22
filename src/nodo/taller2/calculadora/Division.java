package nodo.taller2.calculadora;

public class Division extends Operacion{
    double division;
    public Division(double op1, double op2, char operacion) {
        super(op1, op2, '/');
        if (op2==0){
            System.out.println("No se puede dividir por 0");
            return;
        } else {
            this.division = op1 / op2;
            this.setRes(this.division);
        }

    }
}
