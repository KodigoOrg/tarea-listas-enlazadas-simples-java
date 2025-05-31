public class Main {

    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        System.out.println("Demostracion de la lsita enlazada simple");

        System.out.println("Es una lista vacia? " + lista.esListaVacia());

        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        lista.insertarAlFinal(5);
        lista.eliminar(20);
        lista.eliminarAlInicio();
        System.out.println();
        System.out.println("EXISTE EL NUMERO 20? "+ lista.buscar(20));
        System.out.println("EXISTE EL NUMERO 10? "+ lista.buscar(10));
        System.out.println();
        System.out.println("Tamanio de la lista: " +lista.tamanio());
        System.out.println("Informe de memoria: "+  lista.informacionMemoria());
        System.out.println();

        lista.imprimir();

    }
}
