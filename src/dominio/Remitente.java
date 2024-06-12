package dominio;

public class Remitente extends Persona{
    
    public Remitente(String nom){
        super(nom);
    }

    public boolean equals(Remitente obj){
        Remitente rem = (Remitente) obj;
        return this.nombre == rem.nombre;
    }
}