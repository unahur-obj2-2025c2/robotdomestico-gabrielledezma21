package ar.edu.unahur.obj2.command.invoker;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.robot.Robot;
import ar.edu.unahur.obj2.command.tareas.ITarea;

public class Usuario {
    private List<ITarea> tareas;
    private Robot robot;

    public Usuario(Robot robot) {
        this.robot = robot;
        this.tareas = new ArrayList<>();
    }

    public void agregarTareaAlRobot(ITarea tarea){
        tareas.add(tarea);
    }

    public void borrarTareasDelRobot(){
        tareas.clear();
    }

    public void indicarARobotQueComienceConLasTareas(){
        robot.ejecutar(tareas);
    }

}
