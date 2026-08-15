package logica

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private TipoUsuario tipoUsuario;

    public Usuario(String nombre, String apellido, String correo, TipoUsuario tipoUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}