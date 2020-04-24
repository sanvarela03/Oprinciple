import model.Cancelada;
import model.Finalizada;
import model.Pospuesta;

public class Print {

    public static void main(String[] args) {
      solucion();

    }

    public static void solucion(){
        Tarea tarea = new Tarea();
        CambiarEstadoTarea cambiarEstadoTarea = new CambiarEstadoTarea();

        tarea.setEstadoTarea(new Finalizada());
        cambiarEstadoTarea.finalizar(tarea);

        cambiarEstadoTarea.finalizar(tarea);
    }
}
