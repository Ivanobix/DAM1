import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    /**
     * 01. Constructor de la clase
     */    
    public GestorTareas() {
        tareas = new ArrayList<Tarea>();
    }

    /**
     * 09. Metodo que agrega una tarea al final de la lista
     */
    public void agregarTarea(String textoTarea) {
        tareas.add(new Tarea(textoTarea));
    }

    /**
     * 07. Método que devuelve un String con todas las tareas, una
     * en cada línea. Si no hay tarea, esa línea contiene la cadena
     * vacía.
     */
    public String devolverTareas() {
        String TextoAMostrar = ""; 
        for (Tarea tarea : tareas) {
            TextoAMostrar = TextoAMostrar + tarea.getTextoTarea() + "\n";
        }
        return  TextoAMostrar;
    }

    /**
     * 08. Método imprimeTareas que imprime por pantalla las tareas pendientes 
     * basandonse en el método anterior. No devuelve nada
     */
    public void imprimirTareas() {
        System.out.println(devolverTareas());   
    }

    /**
     * 10. Metodo getNumeroTareas que devuelve el numero de tareas pendientes
     * actuales y no requiere parámetros 
     */
    public int getNumeroTareas() {
        return tareas.size();
    }

    /**
     * 10.1. Metodo getNumeroTareas2 que devuelve el numero de tareas pendientes
     * actuales y no requiere parámetros. No se puede usar el metodo size
     */
    public int getNumeroTareas2() {
        int contadorTareas = 0;
        for(Tarea tarea : tareas) {
            contadorTareas ++ ;
        }
        return contadorTareas ;
    }

    /**
     * 12. getTareaMasAntigua
     * Devuelve la primera tarea que se agrego al gestor de tareas; si no 
     * hay tareas devuelve la cadena vacia;
     */
    public String getTareaMasAntigua() {
        String tareaMasAntigua = "";
        if (tareas.isEmpty() != true) {
            tareaMasAntigua = tareas.get(0).getTextoTarea();
        }       
        return tareaMasAntigua;
    }

    /**
     * 13. imprimirTareaMasAntigua
     * Imprime la primera tarea que se agrego al gestor de tareas; si no 
     * hay tareas imprime una línea en blanco;
     */
    public void imprimirTareaMasAntigua() {
        System.out.println(getTareaMasAntigua());
    }

    /**
     * 14. getListadoTareas
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la cadena vacía
     */
    public String getListadoTareas() {
        String listaTareas = "";
        int posicion = 1;
        if(!tareas.isEmpty()) {
            for (Tarea tarea : tareas) {
                listaTareas = listaTareas + posicion + ". " + tarea.getTextoTarea() + "\n";
                posicion ++; 
            }
        }
        return listaTareas;
    }

    /**
     * 15. imrpimirListadoTareas
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas imprime
     * una línea en blanco. El método no devuelve nada.
     */
    public void imprimirListadoTareas() {
        System.out.println(getListadoTareas()); 
    }

    /**
     * 16. getTareasEnUnaSolaLinea
     * Devuelve todas las tareas pendientes en una sola linea separadas
     * por comas, y por un espacio y con dos corcehete al inicio y al final
     * del tipo "[tarea1, tarea2, tarea3]. Si no hay tareas devuelve la 
     * cadena vacia. Es buena idea echar un vistazo a la API de la clase String
     */
    public String getTareasEnUnaSolaLinea() {
        String textoADevolver = "";
        int contador = 1;
        for (Tarea tarea : tareas){
            if (tareas.size() == contador){
                textoADevolver += tarea.getTextoTarea();
            } 
            else {
                textoADevolver += tarea.getTextoTarea() + ", ";
                contador ++;
            }
        }
        return "[" + textoADevolver + "]";

    }

    /**
     * 17. imprimirTareasEnUnaSolaLinea
     * Imrime todas las tareas pendientes en una sola linea separadas
     * por comas, y por un espacio y con dos corcehete al inicio y al final
     * del tipo "[tarea1, tarea2, tarea3]. Si no hay tareas imprime una 
     * línea en blanco.
     */
    public void imprimirTareasEnUnaSolaLinea() {
        System.out.println(getTareasEnUnaSolaLinea()); 
    }

    /**
     * 18. existeTareaConElTexto
     * Devuelve true si hay al menos una tarea que contenga 
     * el texto indicado como parametro, false en caso contrario. 
     * Hay que hacerlo con bucle for-each.
     */
    public boolean existeTareaConElTexto(String textoABuscar) {
        boolean existeTarea = false;
        for (Tarea tarea : tareas){
            if (tarea.getTextoTarea().contains(textoABuscar)) {
                existeTarea = true;
            }
        }
        return existeTarea;
    }

    /**
     * 19. getTareasImportantes
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama (importante)\n3. Estudiar (Importante)\n") 
     * siempre que la tarea contenga la palabra "importante" 
     * (que puede aparecer en mayúsculas o en minúsculas). 
     * Si no hay tareas de ese tipo devuelve la cadena vacía
     */
    public String getTareasImportantes() {
        String tareasImportantes = "";
        int posicion = 1;
        for (Tarea tarea : tareas){
            if (tarea.getTextoTarea().toLowerCase().contains("importante")) {
                tareasImportantes += posicion + ". " + tarea.getTextoTarea() + "\n"; 
            }
            posicion ++;
        }
        return tareasImportantes;
    }

    /**
     * 20. imprimirTareasImportantes
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama (importante)\n3. Estudiar (Importante)\n") 
     * siempre que la tarea contenga la palabra "importante" 
     * (que puede aparecer en mayúsculas o en minúsculas). 
     * Si no hay tareas de ese tipo imprime una línea en blanco.
     */
    public void imprimirTareasImportantes() {
        System.out.println(getTareasImportantes()); 
    }

    /**
     * 21. getTareasImpares
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama\n3.Estudiar\n") siempre que la tarea ocupe una posición
     * impar. Si no hay tareas de ese tipo devuelve la cadena vacía.
     */
    public String getTareasImpares() {
        String tareasImpares = "";
        int posicion = 1;
        for (int x = 1; x <= tareas.size(); x += 2) {
            tareasImpares += posicion + ". " + tareas.get(posicion-1).getTextoTarea() + "\n";
            posicion += 2;
        }

        return tareasImpares; 
    }

    /**
     * 22. imprimirTareasImpares
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama") siempre que la tarea ocupe una posición
     * impar. Si no hay tareas de ese tipo imprime una línea en blanco.
     */
    public void imprimirTareasImpares() {
        System.out.println(getTareasImpares()); 
    }

    /**
     * 23. eliminarTarea
     * Elimina la tarea cuya numeración obtenida al listar las tareas coincide
     * con el parametro indicado. 
     * Devuelve true si la tarea existe y se elimina y false en caso contrario
     */ 
    public boolean eliminarTarea(int tarea) {
        boolean textoADevolver = false;
        if (tareas.size() > tarea - 1){
            tareas.remove(tarea-1);
            textoADevolver = true;
        }
        return textoADevolver;
    }

    /**
     * 24. getPrimeraTareaConElTexto
     * Devuelve un String conteniendo la primera tarea que contenga el texto 
     * indicado como parametro. En caso de que no haya ninguna coincidencia 
     * devuelve la cadena vacía. Hay que hacerlo con un bucle for-each.
     */
    public String getPrimeraTareaConElTexto(String texto) {
        String textoADevolver = "";
        int contador = 0;
        for (Tarea tarea : tareas){
            if (tarea.getTextoTarea().contains(texto) && contador < 1) {
                textoADevolver = tarea.getTextoTarea();
                contador ++;
            }
        }
        return textoADevolver;
    }

    /**
     * 25. imprimePrimeraTareaConTexto
     * Imprime por pantalla la primera tarea que contenga el texto 
     * indicado como parametro. En caso de que no haya ninguna coincidencia 
     * imprime una línea en blanco. 
     */
    public void imprimePrimeraTareaConTexto(String texto) {
        System.out.println(getPrimeraTareaConElTexto(texto)); 
    }

    /**
     * 26. getListadoTareasWhile Devuelve un String con todas las tareas pendientes,
     * una en cada línea, precedidas de su posicion (empezando en 1), un punto y un
     * espacio (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la
     * cadena vacía. Hay que hacerlo con un bucle while.
     */
    public String getListadoTareasWhile() {
        String listaTareas = "";
        int posicion = 1;
        while (tareas.size() > (posicion-1)) {
            listaTareas = listaTareas + posicion + ". " + tareas.get(posicion-1).getTextoTarea() + "\n";
            posicion ++; 
        }
        return listaTareas;
    }

    /**
     * 27. imprimirListadoTareasWhile Imprime por pantalla todas las tareas
     * pendientes, una en cada línea, precedidas de su posicion (empezando en 1), un
     * punto y un espacio (por ejemplo: "1. Hacer la cama"). Si no hay tareas
     * imprime una línea en blanco. El método no devuelve nada.
     */
    public void imprimirListadoTareasWhile() {
        System.out.println(getListadoTareasWhile()); 
    }

    /**
     * 28. getPrimeraTareaConElTextoWhile Devuelve un String conteniendo la primera tarea
     * que contenga el texto indicado como parametro. En caso de que no haya ninguna
     * coincidencia devuelve la cadena vacía. Hay que hacerlo con un bucle while.
     * La coincidencia tiene que ser case-sensitive.
     */
    public String getPrimeraTareaConElTextoWhile (String textoABuscar) {
        String textoADevolver = "";
        int contador = 0;
        while (textoADevolver.equals("") && contador < tareas.size()) {
            if (tareas.get(contador).getTextoTarea().contains(textoABuscar)){
                textoADevolver = tareas.get(contador).getTextoTarea();
            }
            contador ++;
        }
        return textoADevolver;
    }

    /**
     * 29. imprimePrimeraTareaConTextoWhile Imprime por pantalla la primera tarea que
     * contenga el texto indicado como parametro. En caso de que no haya ninguna
     * coincidencia imprime una línea en blanco. La coincidencia tiene que ser
     * case-sensitive.
     */
    public void imprimePrimeraTareaConTextoWhile(String textoABuscar) {
        System.out.println(getPrimeraTareaConElTextoWhile(textoABuscar)); 
    }

    /**
     * 30. getPrimerasTareas Devuelve un String oonteniendo las primeras n tareas
     * (siendo n el parametro del metodo), una en cada linea con su número delante.
     * En caso de que no haya suficientes se devuelven solo las que haya. En caso de
     * no haber tareas se devuelve la cadena vacía.
     */
    public String getPrimerasTareas(int numeroTareas) {
        String textoADevolver = "";
        int posicion = 1;
        while ((posicion - 1) < tareas.size() && posicion <= numeroTareas) {
            textoADevolver += posicion + ". " + tareas.get(posicion - 1).getTextoTarea() + "\n";
            posicion ++;
        }

        return textoADevolver;
    }

    /**
     * 31. imprimePrimerasTareas Imprime por pantalla las primeras n tareas (siendo
     * n el parametro del metodo), una en cada linea con su número delante. En caso
     * de que no haya suficientes se imprimen solo las que haya. En caso de no haber
     * tareas se imprime una linea en blanco. El metodo no devuelve nada y debe usar
     * el método anterior
     */
    public void imprimePrimerasTarea(int numeroTareas) {
        System.out.println(getPrimerasTareas(numeroTareas)); 
    }

    /**
     * 32. hayTareaConElTextoEficiente Devuelve true si hay al menos una tarea que
     * contenga el texto indicado como parámetro y false en caso contrario. El
     * metodo se debe ejecutar de la forma mas rapida posible
     */
    public boolean hayTareaConElTextoEficiente(String textoABuscar) {
        boolean existeTarea = false;
        int tarea = 0;
        while (existeTarea == false && tarea < tareas.size()) {
            if (tareas.get(tarea).getTextoTarea().contains(textoABuscar)) {
                existeTarea = true;
            }
            tarea ++;
        }
        return existeTarea;
    }

    /**
     * 33. getTareasConElTexto Devuelve un String conteniendo todas las tareas que
     * contienen el texto indicado como parametro, una en cada linea (sin número
     * asociado). El String devuelto contiene una ultima linea adicional que indica
     * el numero de tareas encontradas o el texto "No se encontraron coincidencias".
     * La coincidencia tiene que ser case-sensitive.
     */
    public String getTareasConElTexto (String textoABuscar) {
        String textoADevolver = "";
        int tareasEncontradas = 0;
        for (Tarea tarea : tareas) {
            if (tarea.getTextoTarea().contains(textoABuscar)) {
                textoADevolver += tarea.getTextoTarea() +"\n";
                tareasEncontradas ++;
            }
        }
        if (tareasEncontradas == 0) {
            textoADevolver = "No se encontraron coincidencias";
        }
        else {
            textoADevolver += tareasEncontradas;
        }
        return textoADevolver;
    }

    /**
     * 34. imprimirTareasConElTexto Muestra por pantalla todas las tareas que
     * contienen el texto indicado como parametro, una en cada linea. Se imprime una
     * ultima linea adicional que indica el numero de tareas encontradas o el texto
     * "No se encontraron coincidencias" si no hay ninguna que contenga el texto
     * buscado imprime una linea en blanco. La coincidencia tiene que ser
     * case-sensitive.
     */
    public void imprimirTareasConElTexto(String textoABuscar) {
        System.out.println(getTareasConElTexto (textoABuscar)); 
    }

    /**
     * 35. eliminaPrimeraTareaConElTexto Elimina la primera tarea que contiene el
     * texto indicado por parámetro. Devuelve true si se eliminó una tarea o false
     * en caso contrario. Hay que hacerlo lo mas eficiente posible
     */
    public boolean eliminaPrimeraTareaConElTexto(String textoABuscar) {
        boolean tareaBorrada = false;
        int contador = 0;
        while (!tareaBorrada && contador < tareas.size()) {
            if (tareas.get(contador).getTextoTarea().contains(textoABuscar)){
                tareas.remove(contador);
                tareaBorrada = true;
            }
            contador ++;
        }
        return tareaBorrada;
    }

    /**
     * 36. eliminaTodasLasTareasConElTexto Elimina todas las tareas 
     * que contienen un texto pasado como parametro. 
     * Devuelve el numero de tareas eliminadas. 
     * Hay que hacerlo con un bucle while.
     */
    public int eliminaTodasLasTareasConElTexto(String textoABuscar) {
        int tareasBorradas = 0;
        int contador = 0;
        while (contador < tareas.size()) {
            if (tareas.get(contador).getTextoTarea().contains(textoABuscar)) {
                tareas.remove(contador);
                tareasBorradas += 1;
            }
            else {
                contador ++;
            }
        }
        return tareasBorradas;       
    }

    /**
     * 37. eliminaTodasLasTareasConElTextoFoEach Elimina todas las tareas que
     * contienen un texto pasado como parametro. Devuelve el numero de tareas
     * eliminadas. Hay que hacerlo con un bucle for-each.
     */
    //No se puede hacer

    /**
     * 38. editarTarea Modifica el texto de la tarea indicada cuyo numero al
     * listarla coincide con el pasado como primer parametro dejando el texto
     * indicado en el segundo parámetro. Si la operación tiene exito devuelve
     * true; false en caso contrario.
     */
    public boolean editarTarea(int numeroTarea, String textoAModificar) {
        boolean tareaModificada = false;
        if (numeroTarea <= tareas.size() && numeroTarea > 0){
            tareas.get(numeroTarea - 1).setTextoTarea (textoAModificar);
            tareaModificada = true;
        }
        return tareaModificada;
    }

    /**
     * 39. getListaTareasCompletadasYNoCompletadas Devuelve un String con todas las
     * tareas una en cada línea, precedidas de su posicion (empezando en 1), un
     * punto un espacio y, si estan completadas, un corchete, una x y otro corchete,
     * y luego el texto de la tarea. Ejemplo de tarea terminada sería 
     * "1. [x] Hacer la cama". Ejemplo de tarea no terminada sería "1. Hacer la cama". 
     * Si no hay tareas devuelve la cadena vacía. Se asume que las tareas cuando 
     * se insertan en el gestor no están completadas. No se pueden agregar nuevas 
     * clases al proyecto.
     */
    public String getListaTareasCompletadasYNoCompletadas() {
        String textoADevolver = "";
        int posicion = 1;
        for (Tarea tarea : tareas) {
            textoADevolver += posicion + ". ";
            textoADevolver += (tareas.get(posicion - 1).getCompleta() == true)?"[x] ":""; 
            textoADevolver += tarea.getTextoTarea() + "\n";
            posicion ++;
        }
        return textoADevolver;
    }

    /**
     * 40. marcarComoCompletada Marca como completada la tarea cuyo numero al
     * listarla coincide con el pasado como parametro y devuelve true si pudo
     * realizar la operacion o false en caso contrario (se entiende que una tarea
     * que ya esta completada no se puede volver a marcar como completada)
     * No se pueden agregar nuevas clases al proyecto. Tampoco se puede cambiar
     * el texto de una tarea (el resto de método anteriores deben seguir
     * funcionando tal y como estan ahora mismo)
     */
    public boolean marcarComoCompletada(int tareaCompleta) {
        boolean completadoTarea = false;
        if (tareaCompleta <= tareas.size() && tareas.get(tareaCompleta - 1).getCompleta() == false) {
            tareas.get(tareaCompleta - 1).setCompleta();
            completadoTarea = true;
        }
        return completadoTarea;
    }

    /**
     * 41. getListaTareasConPrioridad Devuelve todas las tareas, una en cada linea, 
     * indicando si esta pendiente con el texto "[ ]" o si no esta pendiente con el 
     * texto "[x]" delante del texto de la tarea y luego un espacio 
     * (por ejemplo "1. [x] Hacer la cama"); además muestra la prioridad de la tarea 
     * al final de la linea separada por un espacio de la 
     * descripcion de la tarea; si no hay tareas devuelve la cadena vacia. La prioridad
     * de una tarea por defecto es
     */       
    public String getListaTareasConPrioridad() {
        String textoADevolver = "";
        int posicion = 1;
        for (Tarea tarea : tareas) {
            textoADevolver += posicion + ". ";
            textoADevolver += (tareas.get(posicion - 1).getCompleta() == true)?"[x] ":"[ ] "; 
            textoADevolver += tarea.getTextoTarea() + " " +tarea.getPrioridad() + "\n";
            posicion ++;
        }
        return textoADevolver;
    }

    /**
     * 42. setPrioridad Metodo que fija la prioridad de la tarea que ocupa la posicion indicada
     * como primer parametro al valor indicado en el segundo parametro. Las 
     * prioridades van de 1 (muy importante) a 5 (poco importante), La prioridad 
     * por defecto es 5. Si el valor que se indica como nueva prioridad es ilegal,
     * la prioridad se queda como esta.
     */
    public void setPrioridad(int tareaACambiar, int prioridadACambiar) {
        if (tareaACambiar <= tareas.size() && tareaACambiar > 0) {
            tareas.get(tareaACambiar - 1).setPrioridad(prioridadACambiar);
        }
    }

    /**
     * 43. getTareaMasPrioritaria Devuelve todos los datos (posicion, completada o no, texto y prioridad) 
     * de la tarea con mayor prioridad. Si hay empate, devuelve la última encontrada. Si no hay tareas 
     * devuelve la cadena vacia
     */
    public String getTareaMasPrioritaria() {
        String textoADevolver = "";
        int prioridadMayor = 5;
        int posicion = 1;        
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() <= prioridadMayor) {
                prioridadMayor = tarea.getPrioridad();
                textoADevolver = posicion + ". ";
                textoADevolver += (tarea.getCompleta())?"[x] ":"[ ] "; 
                textoADevolver += tarea.getTextoTarea() + " " +tarea.getPrioridad();
            }
            posicion ++;
        }
        return textoADevolver;
    }

    /**
     * 44. getTareaMenosPrioritaria Devuelve todos los datos (posicion, completada o no, texto y prioridad) 
     * de la tarea con menor prioridad. Si hay empate, devuelve la última encontrada. Si no hay tareas 
     * devuelve la cadena vacia
     */
    public String getTareaMenosPrioritaria (){
        String textoADevolver = "";
        int prioridadMenor = 1;
        int posicion = 1;        
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() >= prioridadMenor) {
                prioridadMenor = tarea.getPrioridad();
                textoADevolver = posicion + ". ";
                textoADevolver += (tarea.getCompleta())?"[x] ":"[ ] "; 
                textoADevolver += tarea.getTextoTarea() + " " +tarea.getPrioridad();
            }
            posicion ++;
        }
        return textoADevolver;
    }

    /**
     * 45. getTareasPorPrioridad Devuelve las descripciones de las tareas junto con su prioridad ordenadas por 
     * prioridad, una en cada linea. Si no hay tareas devuelve la cadena vacía. En caso de que dos tareas
     * tengan la misma prioridad debe aparecer antes la útima añadida.
     */
    public String getTareasPorPrioridad() {
        String aDevolver = "";
        Tarea tareaAAñadir = null;
        int prioridadMasAlta = 5;
        int cont = 0;

        ArrayList<Tarea> copiaTareas = new ArrayList<Tarea>();
        for (Tarea tarea: tareas) {
            copiaTareas.add(tarea);
        }

        while (cont < tareas.size()) {
            for (Tarea tarea : copiaTareas) {
                if (tarea.getPrioridad() <= prioridadMasAlta) {
                    prioridadMasAlta = tarea.getPrioridad();
                    tareaAAñadir = tarea;
                }
            }
            copiaTareas.remove(tareaAAñadir);
            prioridadMasAlta = 5;
            cont++;
            aDevolver += tareaAAñadir.getTextoTarea() + " " +tareaAAñadir.getPrioridad() + "\n";
        }

        return aDevolver;
    }

    /**
     * 46. getTareasPorPrioridadSeleccion Devuelve las descripciones de las tareas junto 
     * con su prioridad ordenadas por prioridad, una en cada linea. Si no hay tareas 
     * devuelve la cadena vacía. En caso de que dos tareas tengan la misma prioridad debe 
     * aparecer antes la útima añadida de las dos. Es obligatorio que el algoritmo 
     * implementado sea el algoritmo de ordenación por selección.
     */ 
    public String getTareasPorPrioridadSeleccion() {
        String aDevolver = "";
        int contadorExterno = 0;
        ArrayList<Tarea> copiaTareas = new ArrayList<Tarea>();
        for (Tarea tarea : tareas) {
            copiaTareas.add(tarea);
        }

        while (contadorExterno < tareas.size() - 1) {
            Tarea tareaMasPrioritaria = null;
            int prioridadMayor = 6;
            int posicionMasPrioritaria = 0;
            int contadorInterno = contadorExterno;

            while (contadorInterno < tareas.size()) {
                Tarea tareaActual = copiaTareas.get(contadorInterno);
                if (tareaActual.getPrioridad() <= prioridadMayor) {
                    prioridadMayor = tareaActual.getPrioridad();
                    tareaMasPrioritaria = tareaActual;
                    posicionMasPrioritaria = contadorInterno;
                }
                contadorInterno++;
            }
            copiaTareas.set(posicionMasPrioritaria, copiaTareas.get(contadorExterno));
            copiaTareas.set(contadorExterno, tareaMasPrioritaria); 
            contadorExterno++;
        }

        for (Tarea tareaOrdenada : copiaTareas) {
            aDevolver += tareaOrdenada.getTextoTarea() + " " +tareaOrdenada.getPrioridad() + "\n";
        }

        return aDevolver;
    }

    /**
     * 47. fijarFechaTope Fija una fecha limite para la tarea cuyo posicion 
     * nos indican. El ano se especifica con 4 digitos (por ejemplo, 2019).indice
     * Si la posicion indicada no es valida, el metodo no hace nada. El orden
     * de los parametros es posicion de la tarea, dia, mes y ano.
     */
    public void fijarFechaTope(int posicionAModificar, int diaVencimiento, int mesVencimiento, int anoVencimiento) {
        if (posicionAModificar <= tareas.size() && posicionAModificar > 0) {
            tareas.get(posicionAModificar - 1).setFechaVencimiento(diaVencimiento, mesVencimiento, anoVencimiento);
        }
    }

    /**
     * 48. getListaTareasConFechaVencimiento Devuelve todas las tareas, una en cada linea, 
     * indicando su posicion y la fecha de vecimiento en formato DD/MM/YYYY. Por ejemplo, 
     * una tarea se mostraria "1. Hacer la cama - 21/01/2019"; si no hay fecha de vencimiento la ultima 
     * parte no se muestra; si no hay tareas devuelve la cadena vacia
     */
    public String getListaTareasConFechaVencimiento() {
        String aDevolver = "";
        int posicion = 1;
        for (Tarea tarea : tareas) {
            aDevolver += posicion + ". " + tarea.getTextoTarea();
            if (tarea.getFechaVencimiento() != null ) {
                aDevolver += " - ";
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                aDevolver += tarea.getFechaVencimiento().format(formato);
            }
            aDevolver += "\n";
            posicion++;
        }
        return aDevolver;
    }

    /**
     * 49. getTareasQueVencenEn Devuelve un String conteniendo todas las tareas que vencen en la fecha indicada
     * como parametro (el orden de los parametros es dia, mes y año -este ultimo con 4 dígitos), una por linea
     * (solo la descripcion de cada tarea). Si no hay tareas que venzan en dicha fecha devuelve la cadena vacia.
     */
    public String getTareasQueVencenEl(int dia, int mes, int ano) {
        String textoADevolver = "";
        LocalDate fechaAComparar = LocalDate.of(ano, mes, dia);
        for(Tarea tareaActual : tareas) {
            if(fechaAComparar.equals(tareaActual.getFechaVencimiento())){
                textoADevolver += tareaActual.getTextoTarea() + "\n";
            }
        }    
        return textoADevolver;
    }

    /**
     * 50. getTareaVencimientoMasInminente Devuelve la tarea con la fecha tope más inminente. Si hay empate,
     * devuelve todas las empatadas, una en cada línea. Si no hay ninguna con fecha tope más inminente devuelve 
     * la cadena vacia. Evidentemente no tendremos en cuenta tareas con fecha tope ya pasada.
     */
    public String getTareaVencimientoMasInminente() {
        String aDevolver = "";
        LocalDate fechaMasCercana = LocalDate.MAX;
        for (Tarea tarea : tareas) {
            if (tarea.getFechaVencimiento() != null && (tarea.getFechaVencimiento().isAfter(LocalDate.now()) || tarea.getFechaVencimiento().equals(LocalDate.now()))) {
                if (tarea.getFechaVencimiento().isBefore(fechaMasCercana)) { 
                    fechaMasCercana = tarea.getFechaVencimiento();
                    aDevolver = tarea.getTextoTarea() + "\n";
                }
                else if (tarea.getFechaVencimiento().equals(fechaMasCercana)) {
                    aDevolver += tarea.getTextoTarea() + "\n";
                }
            }
        }
        return aDevolver;
    }

    /**
     * 51. getTareaVencimientoMasLejano Devuelve la tarea con la fecha tope más 
     * lejana. Si hay empate, devuelve todas la s empatadas, una en cada linea.
     * Si no hay ninguna con fecha tope devuelve la cadena vacia. 
     * Evidentemente no tendremos en cuenta tareas con fecha tope ya pasada.
     */    
    public String getTareaVencimientoMasLejano() {
        String aDevolver = "";
        LocalDate fechaMasLejana = LocalDate.now();
        for (Tarea tarea : tareas) {
            if (tarea.getFechaVencimiento() != null && (tarea.getFechaVencimiento().isAfter(LocalDate.now()) || tarea.getFechaVencimiento().equals(LocalDate.now()))) {
                if (tarea.getFechaVencimiento().isAfter(fechaMasLejana)) { 
                    fechaMasLejana = tarea.getFechaVencimiento();
                    aDevolver = tarea.getTextoTarea() + "\n";
                }
                else if (tarea.getFechaVencimiento().equals(fechaMasLejana)) {
                    aDevolver += tarea.getTextoTarea() + "\n";
                }
            }
        }
        return aDevolver;
    }

    /**
     * 52. getTareasVencidas Devuelve un String conteniendo todas las tareas que 
     * han vencido ya, una por linea, junto con su numero de tarea. Si no hay 
     * tareas que cumplan la condicion devuelve la cadena vacia
     */
    public String getTareasVencidas() {
        String aDevolver = "";
        int posicion = 1;
        for (Tarea tarea : tareas) {
            if (tarea.getFechaVencimiento() != null && tarea.getFechaVencimiento().isBefore(LocalDate.now())) {
                aDevolver += posicion + ". " + tarea.getTextoTarea() + "\n";
            }
            posicion++;
        }
        return aDevolver;
    }

    /**
     * 53. getTareasPorFechaVencimiento Metodo que devuelve un String coneniendo 
     * las tareas con fecha de vencimiento a partir de hoy (inlcuido) ordenadas por 
     * fecha de vencimiento (las mas proximas primero). Si no hay tareas devuelve 
     * la cadena vacia. Si hay empate devuelve primero la que se agregara antes 
     * en el gestor de tareas
     */
    public String getTareasPorFechaVencimiento() {
        String aDevolver = "";
        int cont = 0;
        Tarea tareaAAñadir = null;
        LocalDate fechaMasProxima = LocalDate.MAX;
        ArrayList<Tarea> copiaTareas = new ArrayList<Tarea>();
        for (Tarea tarea: tareas) {
            copiaTareas.add(tarea);
        }
        while (cont < tareas.size()) {
            for (Tarea tarea : copiaTareas) {
                if (tarea.getFechaVencimiento() != null && tarea.getFechaVencimiento().isAfter(LocalDate.now()) && 
                (tarea.getFechaVencimiento().isBefore(fechaMasProxima))) {
                    fechaMasProxima = tarea.getFechaVencimiento();
                    tareaAAñadir = tarea;
                }
            }
            if (tareaAAñadir != null) {
                copiaTareas.remove(tareaAAñadir);
                fechaMasProxima = LocalDate.MAX;
                aDevolver += tareaAAñadir.getTextoTarea() + "\n";
                tareaAAñadir = null;
            }
            cont++;
        }
        return aDevolver;
    }

    /**
     * 54. getListadoTareasConIterador Devuelve un String con todas las tareas pendientes, una
     * en cada línea, precedidas de su posicion (empezando en 1), un punto y un
     * espacio (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la
     * cadena vacía. Es obligatorio utilizar un bucle while basado en un iterador
     */
    public String getListadoTareasConIterador() {
        String aDevolver = "";
        Iterator<Tarea> it = tareas.iterator();
        int posicion = 1;
        while (it.hasNext()) {
            aDevolver += posicion + ". " + it.next().getTextoTarea() + "\n";
            posicion++;
        }
        return aDevolver;
    }

    /**
     * 55. getListaTareasConPrioridadIterador Devuelve todas las tareas, una en cada linea, 
     * indicando además la prioridad de la tarea  al final de la linea separada por un espacio de la 
     * descripcion de la tarea; si no hay tareas devuelve la cadena vacia. Es obligatorio hacerlo 
     * con un bucle while basado en un iterador
     */
    public String getListaTareasConPrioridadIterador() {
        String aDevolver = "";
        Iterator<Tarea> it = tareas.iterator();
        int posicion = 1;
        while (it.hasNext()) {
            Tarea itnext = it.next();
            aDevolver += posicion + ". " + itnext.getTextoTarea() + " " + itnext.getPrioridad() + "\n";
            posicion++;
        }
        return aDevolver;
    }

    /**
     * 56. olvidaTareasYaPasadas Elimina todas las tareas con fecha limite previa a la fecha actual.
     * Devuelve true si realizó alguna eliminación, false en caso contrario
     */
    public boolean olvidaTareasYaPasadas() {
        boolean aDevolver = false;
        Iterator<Tarea> it = tareas.iterator();
        while (it.hasNext()) {
            Tarea tarea = it.next();
            if (tarea.getFechaVencimiento() != null && tarea.getFechaVencimiento().isBefore(LocalDate.now())) {
                it.remove();
                aDevolver = true;
            }
        }
        return aDevolver;
    }

    /**
     * 57. Metodo que devuelve true si hay tareas duplicadas (dos tareas al menos con la 
     * misma descripcion) o false en caso contrario
     */
    public boolean hayTareasDuplicadas() {
        boolean aDevolver = false;
        int contadorExterno = 0;
        while (contadorExterno < tareas.size() && !aDevolver) {
            int contadorInterno = contadorExterno + 1;
            String tareaABuscar = tareas.get(contadorExterno).getTextoTarea();
            while (contadorInterno < tareas.size() && !aDevolver) {
                String tareaAComparar = tareas.get(contadorInterno).getTextoTarea();
                if (contadorExterno != contadorInterno && tareaABuscar.equals(tareaAComparar)) {
                    aDevolver = true;  
                }
                contadorInterno++;
            }
            contadorExterno++;
        }
        return aDevolver;
    }

    /**
     * 58. eliminaTareaMasVieja Elimina la tarea mas antigua. Si no hay tareas devuelve false,
     * true en caso contrario
     */
    public boolean eliminaTareaMasVieja() {
        boolean aDevolver = false;
        if (tareas.size() > 0) {
            tareas.remove(0);
            aDevolver = true;
        }
        return aDevolver;
    }


}