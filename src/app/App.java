package app;


import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Remitente rem = new Remitente("Emanuel");
        Destinatario des = new Destinatario("Ayelén");
        Destinatario des2 = new Destinatario("Enzo");
        Mensaje men = new Mensaje(rem, des, "Me prestas unos pesos?");

        System.out.println(men);

        Remitente rem2 = new Remitente("Emanuel");

        System.out.println(rem.equals(rem2));

        Buzon.recibirMensaje(men);

        Buzon.imprimirBuzon();

        Buzon.entregarMensaje(des2);

        Buzon.imprimirBuzon();

        System.out.println(des2);

        Buzon.entregarMensaje(des);
        Buzon.imprimirBuzon();
        System.out.println(des);

        
    }
}
