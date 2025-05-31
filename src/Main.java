public class Main {

    public static void main(String[] args) {

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        System.out.println("Demostracion de la lsita enlazada simple");

        System.out.println("Es una lista vacia? " + lista.esListaVacia());

        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        lista.insertarAlFinal(5);
        lista.eliminarAlInicio();

        lista.imprimir();

    }
}
