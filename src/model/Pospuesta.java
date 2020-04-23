package model;

public class Pospuesta extends EstadoTarea {
    @Override
    public EstadoTarea cambiarEstado() {
        System.out.println("La tarea pospuesta ha sido cambiada a pendiente por hacer");
        return new Pendiente();
    }
}
