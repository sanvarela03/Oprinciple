package model;

public class Cancelada extends EstadoTarea {
    @Override
    public EstadoTarea cambiarEstado() {
        System.out.println("Imposible finalizar, Tarea cancelada.");
        return new Cancelada();
    }
}
