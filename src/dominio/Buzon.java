package dominio;

import java.util.*;

public class Buzon {

    static ArrayList<Mensaje> mensajes = new ArrayList<>();

    public static void recibirMensaje(Mensaje mx){
        mensajes.add(mx);
    }

    public static void imprimirBuzon(){
        String str = "\n --- Contenido del buzón ---------";
        for(int i=0 ; i<mensajes.size() ; i++){
            //System.out.println( mensajes.get(i));
            str += mensajes.get(i).toString();
        }
        str += "------------------------------------------";
        System.out.println(str);
    }

    public static Destinatario entregarMensaje(Destinatario des){
        System.out.println("Buzon.entregarMensaje().....");
        for(int i=0 ; i<mensajes.size() ; i++){
            //System.out.println(mensajes.get(i).getDestinatario().equals(des));
            if(mensajes.get(i).getDestinatario().equals(des)){
                Mensaje m1 = mensajes.remove(i);
                des.tomarMensaje(m1);
            }
        }
        return des;
    }
}
