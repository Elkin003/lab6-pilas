public class NodoPila {
    TareaDeServidor tarea;
    NodoPila inferior; // Apunta al elemento debajo de la pila

    public NodoPila(TareaDeServidor t) {
        this.tarea = t;
        this.inferior = null;
    }
}
