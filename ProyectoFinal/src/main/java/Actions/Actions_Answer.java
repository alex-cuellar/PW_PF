package Actions;

import Modelo.Answer;
import java.util.List;

public interface Actions_Answer {

    public boolean agregar(Answer respuesta);

    public boolean editar(Answer respuesta);

    public boolean eliminar(Answer respuesta);

    public List obtenerRespuestas();
}
