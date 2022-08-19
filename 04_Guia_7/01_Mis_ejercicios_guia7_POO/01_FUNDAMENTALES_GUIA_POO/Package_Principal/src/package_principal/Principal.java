
package package_principal;


public class Principal {

    
    public static void main(String[] args) {

        Operacion num = new Operacion();

        num.crearoperacion();

        System.out.println("suma-> " + num.suma(num.getNum1(), num.getNum2()));

        System.out.println("resta-> " + num.resta(num.getNum1(), num.getNum2()));

        if (num.multiplicar() == 0) {

            System.out.println("Multiplicación-> " + num.multiplicar() + " los numero ingresados son  " + num.getNum1() + " y " + num.getNum2() + " ,un resultado nulo");

        } else {

            System.out.println("Multiplicación-> " + num.multiplicar());

        }

        if (num.division() == 0) {

            if (num.getNum2() == 0) {

                System.out.println("Disculpe, el divisor debe ser mayor que cero");

            } else {

                System.out.println("La División es-> " + num.division() + " los numero ingresados son " + num.getNum1() + " y " + num.getNum2());

            }

        } else {

            System.out.println("La División es-> " + num.division());

        }

    }

}
