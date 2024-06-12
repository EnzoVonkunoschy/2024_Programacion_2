package dominio;

import java.util.ArrayList;

public class Destinatario extends Persona {

    ArrayList<Mensaje> mensajes = new ArrayList<>();

    public Destinatario(String nom){
        super(nom);
    }

    public void tomarMensaje(Mensaje men){
        mensajes.add(men);
    }

    public String toString(){
        String str="\nDestinatario ---------\n";
        str += this.getNombre()+"\n";
        for(int i=0 ; i<mensajes.size() ; i++){
            str += mensajes.get(i).toString();
        }
        return str;
    }
    
}
