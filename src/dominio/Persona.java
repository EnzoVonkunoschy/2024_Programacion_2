package dominio;

public class Persona {
    String nombre;

    public Persona(String nom){
        this.nombre = nom;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public boolean equals(Object obj){
        Persona per = (Persona) obj;
        return per.nombre == this.nombre;
    }

    
}
