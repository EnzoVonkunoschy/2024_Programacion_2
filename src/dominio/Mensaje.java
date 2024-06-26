package dominio;

import javax.management.Descriptor;

public class Mensaje {
    private Remitente remitente;
    private Destinatario destinatario;
    private String texto = "";

    public Mensaje(Remitente rem, Destinatario des, String men){
        this.remitente = rem;
        this.destinatario = des;
        this.texto = men;
    }

    public Destinatario getDestinatario() {
        return this.destinatario;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public String toString(){
        String str = "";
            str += "\nMensaje ---------------------\n";
            str += "Remitente: "+this.remitente.getNombre()+"\n";
            str += "Destinatario: "+this.destinatario.getNombre()+"\n";
            str += "Mensaje: "+this.texto+"\n";
        return str;
    }

}
