public class PilaHistorial {
    private NodoPila cima; // Top of the stack
    private int tamanio;

    public PilaHistorial() {
        this.cima = null;
        this.tamanio = 0;
    }

    // Método Push: O(1)
    public void push(TareaDeServidor tarea) {
        NodoPila nuevo = new NodoPila(tarea);
        nuevo.inferior = cima;
        cima = nuevo;
        tamanio++;
    }

    // Método Pop: O(1)
    public TareaDeServidor pop() {
        if (estaVacia()) {
            throw new IllegalStateException("El historial está vacío. No hay acciones para deshacer.");
        }
        TareaDeServidor tareaDeshecha = cima.tarea;
        cima = cima.inferior;
        tamanio--;
        return tareaDeshecha;
    }

    public boolean estaVacia() {
        return cima == null;
    }

}
