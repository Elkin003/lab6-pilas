public class Simulacion {
    public static void main(String[] args) {

        ControladorTareas ctarea = new ControladorTareas();

        // 1. Asignamos 4 tareas
        ctarea.asignarTarea("Ejecutar Algoritmo de IA");
        ctarea.asignarTarea("Suspender Proceso de Backup");
        ctarea.asignarTarea("Lanzar Analisis Predictivo");
        ctarea.asignarTarea("Messi le gana a Cristiano Ronaldo");
        System.out.println("TAREAS ASIGNADAS: (4)");

        // 2. Deshacemos todas las tareas
        TareaDeServidor deshecha1 = ctarea.deshacer();
        System.out.println("TAREA DESHECHA: " + deshecha1.descripcion);

        TareaDeServidor deshecha2 = ctarea.deshacer();
        System.out.println("TAREA DESHECHA: " + deshecha2.descripcion);

        TareaDeServidor deshecha3 = ctarea.deshacer();
        System.out.println("TAREA DESHECHA: " + deshecha3.descripcion);

        TareaDeServidor deshecha4 = ctarea.deshacer();
        System.out.println("TAREA DESHECHA: " + deshecha4.descripcion);

        System.out.println("pilaDeshacer vacia : " + ctarea.getPilaDeshacer().estaVacia()); // true
        System.out.println("pilaRehacer  vacia : " + ctarea.getPilaRehacer().estaVacia());  // false

        // 3. Rehacemos todas las tareas
        TareaDeServidor rehecha1 = ctarea.rehacer();
        System.out.println("TAREA REHECHA: " + rehecha1.descripcion);

        TareaDeServidor rehecha2 = ctarea.rehacer();
        System.out.println("TAREA REHECHA: " + rehecha2.descripcion);

        TareaDeServidor rehecha3 = ctarea.rehacer();
        System.out.println("TAREA REHECHA: " + rehecha3.descripcion);

        TareaDeServidor rehecha4 = ctarea.rehacer();
        System.out.println("TAREA REHECHA: " + rehecha4.descripcion);

        System.out.println("pilaDeshacer vacia : " + ctarea.getPilaDeshacer().estaVacia()); // false
        System.out.println("pilaRehacer  vacia : " + ctarea.getPilaRehacer().estaVacia());  // true
    }
}