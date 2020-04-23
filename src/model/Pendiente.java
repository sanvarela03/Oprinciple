package model;

public class Pendiente extends EstadoTarea {

    @Override
    public EstadoTarea cambiarEstado() {
        System.out.println("Finalizar tarea.");
        return new Finalizada();
    }
}
