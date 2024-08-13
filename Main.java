public class Main {
  public static void main(String[] args) {
    Fila fila = new Fila(5);

    fila.insere(999);
    fila.insere(101010);
    fila.insere(123);

    System.out.println("Fila:");
    fila.imprime();

    fila.remove();
    System.out.println("Fila depois de excluir:");
    fila.imprime();
  }
}
