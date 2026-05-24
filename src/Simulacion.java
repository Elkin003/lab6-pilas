public class Simulacion {
    public static void main(String[] args) {

        ControladorTareas ctarea = new ControladorTareas();

        // 1. Asignamos 3 tareas
        ctarea.asignarTarea("Ejecutar Algoritmo de IA");
        //ctarea.asignarTarea("Suspender Proceso de Backup");
        ctarea.asignarTarea("Lanzar Analisis Predictivo");
        ctarea.asignarTarea("Messi le gana a Cristiano Ronaldo");
        System.out.println("TAREAS ASIGNDAS: (4) ");

        // 2. Deshacemos la ultima tarea y la pasamos a pilaRehacer
        TareaDeServidor deshecha = ctarea.deshacer();
        System.out.println("TAREA DESHECHA : " + deshecha.descripcion);

        // 3. Verificamos por consola que ya no esta en tareas activas
        System.out.println("VERIFICACION ");
        System.out.println("pilaDeshacer vacia : " + ctarea.getPilaDeshacer().estaVacia());   // false = aun hay tareas activas
        System.out.println("pilaRehacer vacia  : " + ctarea.getPilaRehacer().estaVacia());    // false = tiene la tarea revertida
        System.out.println("\"" + deshecha.descripcion + "\" ya NO esta en tareas activas.");
        System.out.println("\"" + deshecha.descripcion + "\" SI esta en pilaRehacer.");
    }
}
