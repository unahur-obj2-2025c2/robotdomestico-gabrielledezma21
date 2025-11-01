package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.casa.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class LigOff extends Comando{

    private Habitacion habitacion;
    private Boolean estabaApagada;

    public LigOff(Habitacion habitacion){
        this.habitacion = habitacion;
        this.estabaApagada = ! habitacion.getLuzEncendida();
    }

    @Override
    protected void doEjecutar(Robot robot) {
        habitacion.apagarLuz();
    }

    @Override
    protected Double consumoDeBateria() {
       return estabaApagada ? 1.0 : 5.0;
    }

    @Override
    public Double getDuracion() {
        return estabaApagada ? 25.0 : 90.0;
    }

}
