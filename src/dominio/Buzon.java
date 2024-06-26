package dominio;

import java.util.*;

public class Buzon {
    private String nombre;
    ArrayList<Mensaje> mensajes = new ArrayList<>();
    ArrayList<Destinatario>suscriptores = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarSuscriptor(Destinatario des) {
        this.suscriptores.add(des);
    }

    public void recibirMensaje(Mensaje mx){
        System.out.println("Recibiendo mensaje de: "+ mx.getRemitente().getNombre());
        for(int i=0 ; i<suscriptores.size() ; i++){
            System.out.println(suscriptores.get(i));
            System.out.println(suscriptores.get(i).equals(mx.getDestinatario()));
        }



        //mensajes.add(mx);
    }

    public  void imprimirBuzon(){
        String str = "\n --- Contenido del buzón ---------";
        for(int i=0 ; i<mensajes.size() ; i++){
            //System.out.println( mensajes.get(i));
            str += mensajes.get(i).toString();
        }
        str += "------------------------------------------";
        System.out.println(str);
    }

    public Destinatario entregarMensaje(Destinatario des){
        System.out.println("Entregando mensaje a "+des.nombre);
        for(int i=0 ; i<mensajes.size() ; i++){
            //System.out.println(mensajes.get(i).getDestinatario().equals(des));
            if(mensajes.get(i).getDestinatario().equals(des)){
                Mensaje m1 = mensajes.remove(i);
                des.tomarMensaje(m1);
                i--;
            }
        }
        return des;
    }
}
