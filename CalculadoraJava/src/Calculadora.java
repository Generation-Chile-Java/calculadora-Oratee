import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica el primer numero");
        int numeroUno = teclado.nextInt();

        System.out.println("Indica el segundo numero");
        int numeroDos = teclado.nextInt();

        System.out.println("Elige la operacion +,-,*,/,%");

        Scanner operador = new Scanner(System.in);

        String operar = operador.next();
        int resultadoSuma = numeroUno + numeroDos;
        int resultadoResta = numeroUno - numeroDos;
        int resultadoMultiplicacion = numeroDos*numeroUno;
        float resultadoDivision = numeroUno/numeroDos;
        float resultadoModulo = numeroUno%numeroDos;

        if (operar.equals("+") ) {
            System.out.println("La suma es " + resultadoSuma);
        }
        else if (operar.equals("-")){
            System.out.println("La resta es " + resultadoResta);
        }
        else if (operar.equals("*")){
            System.out.println("La multiplicacion es " + resultadoMultiplicacion);
        }
        else if (operar.equals("/")){
            System.out.println("La division es " + resultadoDivision);
        }
        else if (operar.equals("%")) {
            System.out.println("El modulo es " + resultadoModulo);
        };



    }


}
