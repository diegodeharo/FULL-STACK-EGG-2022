package ejecutable;

import password.Password;

public class EjecutableMain {

    public static void main(String[] args) {

        Password[] array = new Password[2];

        for (int i = 0; i < 2; i++) {

            Password password = new Password();

            password.generarPassword();

            array[i] = password;

        }

        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////////////////");

        for (Password i : array) {

            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("Usuario: " + i.getUsuario() + " Su Contraseña es -> " + i.getContrasenia() + " es fuerte-> " + i.esFuerte());
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        }

    }

}


