import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = creaHashSetRiempito();
        verificaElementoEdElimina(hashSet);
        svuotaHashSetEVerifica(hashSet);
    }


    public static HashSet<Integer> creaHashSetRiempito() {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        return hashSet;
    }

    public static void verificaElementoEdElimina(HashSet<Integer> hashSet) {
        Integer oggettoDaVerificare = 2;

        hashSet.removeIf(elemento -> elemento.equals(oggettoDaVerificare));
    }

    public static void svuotaHashSetEVerifica(HashSet<Integer> hashSet) {
        hashSet.clear();

        if (hashSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }
}
