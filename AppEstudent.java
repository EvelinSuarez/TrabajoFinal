package TrabajoFinal;
//Se importa la libreria JOptionPane
import javax.swing.JOptionPane;

public class AppEstudent {
    public static void main(String[] args) {
    ConstruccionEstudent obj = new ConstruccionEstudent();

    byte option;
        do {
            //Se crea un menu para seleccionar que se quiere realizar en el programa
            option = Byte.parseByte(JOptionPane.showInputDialog(
                "Menu principal\n"
                +"1. Agregar estudiante\n"
                +"2. Mostrar Estudiantes\n"
                +"3. Buscar Estudiantes\n"
                +"4. Actuallizar estudiante\n"
                +"5. Salir"
            ));
            switch (option) {//Switch para seleccionar la informacion dependiendo del caso
                case 1:
                    obj.cargarDatos();
                    break;
                case 2:
                    obj.MostrarEstudent();
                    break;
                case 3:
                    obj.ConsultarEstudent();
                    break;
                case 4:
                obj.Actualizar();

                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias");
                    break; 
            
                default:
                    JOptionPane.showMessageDialog(null, "no encontrado");
                    break;
            }
        } while (option != 0);
    }
}
