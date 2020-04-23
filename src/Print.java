import model.Pospuesta;

public class Print {

    public static void main(String[] args) {
        Tarea tarea = new Tarea();

        tarea.finalizar();

        tarea.setEstadoTarea(new Pospuesta());

        tarea.finalizar();

    }
}
