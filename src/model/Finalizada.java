package model;

public class Finalizada extends EstadoTarea {
    @Override
    public EstadoTarea cambiarEstado() {
        System.out.println("No se puede finalizar una tarea ya finalizada.");
        return new Finalizada();
    }
}
