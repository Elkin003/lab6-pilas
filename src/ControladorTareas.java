public class ControladorTareas {
    private final PilaHistorial pilaDeshacer = new PilaHistorial();
    private final PilaHistorial pilaRehacer  = new PilaHistorial();

    public void asignarTarea(String descripcion) {
        pilaDeshacer.push(new TareaDeServidor(descripcion));
    }

    public TareaDeServidor deshacer() {
        if (pilaDeshacer.estaVacia()) throw new IllegalStateException("Nada que deshacer.");
        TareaDeServidor t = pilaDeshacer.pop();
        pilaRehacer.push(t);
        return t;
    }

    public TareaDeServidor rehacer() {
        if (pilaRehacer.estaVacia()) throw new IllegalStateException("Nada que rehacer.");
        TareaDeServidor t = pilaRehacer.pop();
        pilaDeshacer.push(t);
        return t;
    }

    public PilaHistorial getPilaDeshacer() {
        return pilaDeshacer; }
    public PilaHistorial getPilaRehacer()  {
        return pilaRehacer;  }
}
