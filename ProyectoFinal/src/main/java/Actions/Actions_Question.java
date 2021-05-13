package Actions;

import Modelo.Question;
import java.util.List;

public interface Actions_Question {

    public boolean agregar(Question pregunta);

    public boolean editar(Question pregunta);

    public boolean eliminar(Question pregunta);
    
    public List obtenerPreguntas();
    
    public void asignarRespuestaCorrecta();
}
