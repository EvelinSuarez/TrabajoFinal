package TrabajoFinal;

public class Estudiante {
    //atributos
    private int numEstudent;
    private String identificacion;
    private String nombre;
    private String email;


    //Constructor
    public Estudiante(){
        numEstudent = 0;
        identificacion ="";
        nombre = "";
        email = "";
    }
    //Setting and Getting
    public int getNumEstudent(){
        return numEstudent;
    }

    public void setNumEstudent(int numEstudent){
        this.numEstudent = numEstudent;
    }

    public String getIdentificacion() {
        return identificacion;
    }


    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
}
