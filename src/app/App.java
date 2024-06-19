package app;


import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Remitente rem = new Remitente("Emanuel");
        Destinatario des = new Destinatario("Ayelén");
        Mensaje men = new Mensaje(rem, des, "Me prestas unos pesos?");

        Buzon.recibirMensaje(men);

        Destinatario des2 = new Destinatario("Enzo");
        Remitente rem2 = new Remitente("Vicente");
        Mensaje men2 = new Mensaje(rem2, des2, "¿Hay consulta?");

        Buzon.recibirMensaje(men2);

        Buzon.entregarMensaje(des);
        Buzon.entregarMensaje(des2);

    }
}
