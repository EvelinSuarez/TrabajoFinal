package TrabajoFinal;
//se importan las librerias del arrayList y el javax.swing
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConstruccionEstudent {
    //Se crea el array list
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    //metodo que resive informacion de los input
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }

    //Metodo para ingresar los datos, usando el JOptionPane
    public void cargarDatos(){
        String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion: ");
        String nombre = Input("Ingrese su nombre completo: ");
        String email = Input("Ingrese su email: ");

        //Se crea un objeto para enviar la informacion cargada en el
        Estudiante estudent = new Estudiante();

        estudent.setIdentificacion(identificacion);
        estudent.setNombre(nombre);
        estudent.setEmail(email);
        estudiantes.add(estudent);
    }

    //Metodo para mostrar la lista de los estudiantes ingresados
    public void MostrarEstudent(){
        String string = "";
        for(int i = 0; i<estudiantes.size(); i++){
            string +="Estudiante: "+(i+1)+"\n";
            string += "Identificacion: "+estudiantes.get(i).getIdentificacion()+"\n";
            string += "Nombre:  "+estudiantes.get(i).getNombre()+"\n";
            string += "Email:  "+estudiantes.get(i).getEmail()+"\n";
        }
        //Metodo 
        JOptionPane.showMessageDialog(null, string);
    }

    //Metodo para buscar un estudiante dependiendo de su identificacion
    public void ConsultarEstudent(){
        String string = "";
        String preguntaIdent = JOptionPane.showInputDialog("Identidificacion a buscar: ");

        for(int i = 0; i<estudiantes.size(); i++){
            if (estudiantes.get(i).getIdentificacion().equalsIgnoreCase(preguntaIdent)) {
                string +="Estudiante: "+(i+1)+"\n";
                string += "Identificacion: "+estudiantes.get(i).getIdentificacion()+"\n";
                string += "Nombre:  "+estudiantes.get(i).getNombre()+"\n";
                string += "Email:  "+estudiantes.get(i).getEmail()+"\n";
            }   
        }
        //Metodo
        JOptionPane.showMessageDialog(null, string);
    }

    //Metodo para actualizar los datos de los estudiantes
    public void Actualizar(){
        String string = "";
        String preguntaActu = JOptionPane.showInputDialog("Ingresa la identicacion del estudiante a actualiar: ");

        for(int i = 0; i<estudiantes.size(); i++){
            if (estudiantes.get(i).getIdentificacion().equals(preguntaActu)) {
                //Mostrará los datos ya existentes del estudiante
                string +="Estudiante: "+(i+1)+"\n";
                string += "Identificacion: "+estudiantes.get(i).getIdentificacion()+"\n";
                string += "Nombre:  "+estudiantes.get(i).getNombre()+"\n";
                string += "Email:  "+estudiantes.get(i).getEmail()+"\n";

                String nombreNuevo = Input("ingrese el nuevo nombre: ");
                String nombreEmail = Input("ingrese el nuevo email: ");

                Estudiante actualizacion = new Estudiante();

                actualizacion.setNombre(nombreNuevo);
                actualizacion.setEmail(nombreEmail);
                estudiantes.add(actualizacion);
                //Mostrará los datos ya actualizados del estudiante
                string +="Nuevos datos Estudiantes: "+"\n";
                string += "Identificacion: "+estudiantes.get(i).getIdentificacion()+"\n";
                string += "Nombre:  "+nombreNuevo+"\n";
                string += "Email:  "+nombreEmail+"\n";
            }
        }
        //Metodo
        JOptionPane.showMessageDialog(null, string);
    }



}
