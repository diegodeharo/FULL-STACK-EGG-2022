package revolverDeAgua;

/**
 *
 * @author EL_SEMENTAL
 */
public class RevolverMetodos {

    //instancio un objeto de tipo revolver
    RevolverDeAgua rv = new RevolverDeAgua();

    //metodos
    /**
     * devuelve true si la posición del agua coincide con la posición actual
     *
     * @return bandera
     */
    public boolean mojar() {

        //variable bandera de retorno
        boolean bandera = false;

        return bandera = rv.getPosAcual() == rv.getPosicionAgua();
    }

    /**
     * me cambia la posicion del tambor del revolver
     *
     */
    public void siguienteChorro() {

        //array de posicion de tambor de revolver
        int[] posicion = {1, 2, 3, 4, 5};

        for (int i = 0; i < 6; i++) {

            if (rv.getPosAcual() == 6) {

                rv.setPosAcual(1);
                break;

            } else if (rv.getPosAcual() == posicion[i]) {

                rv.setPosAcual(rv.getPosAcual() + 1);
                break;

            }
        }

    }

}
