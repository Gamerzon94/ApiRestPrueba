package api.domain;

public class Usuario {

    private int id;
    private String nombre;
    private String cargo;
    private String mensaje;

    public Usuario(int id, String nombre, String cargo, String mensaje) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
