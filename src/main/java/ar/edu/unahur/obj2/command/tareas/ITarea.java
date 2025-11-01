package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public interface ITarea {

    void ejecutar(Robot robot);

    Double getDuracion();

}
