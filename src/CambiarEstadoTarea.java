public class CambiarEstadoTarea {

    public void finalizar(Tarea tarea){
        System.out.println("Estado inicial de la tarea: "+ tarea.getEstadoTarea().getClass());
        tarea.setEstadoTarea(tarea.getEstadoTarea().cambiarEstado());
        System.out.println("Estado final de la tarea: "+ tarea.getEstadoTarea().getClass());
    }
}
