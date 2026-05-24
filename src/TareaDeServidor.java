public class TareaDeServidor {
    String descripcion;
    long timestamp;

    public TareaDeServidor(String descripcion) {
        this.descripcion = descripcion;
        this.timestamp = System.currentTimeMillis();
    }
}
