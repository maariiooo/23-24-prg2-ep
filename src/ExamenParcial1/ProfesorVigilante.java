public class ProfesorVigilante {
    private String nombre;
    private String dni;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public ProfesorVigilante(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
}