import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Chiamo la funzione per eseguire l'operazione
        HashSet<Integer> hashSet = creaHashSetRiempito();
        verificaElementoEdElimina(hashSet);
        svuotaHashSetEVerifica(hashSet);
    }

    // Funzione che restituisce un HashSet riempito
    public static HashSet<Integer> creaHashSetRiempito() {
        HashSet<Integer> hashSet = new HashSet<>();

        // Aggiungi elementi all'HashSet
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        return hashSet;
    }

    // Funzione che verifica ogni elemento dell'HashSet e lo elimina se è uguale all'oggetto creato
    public static void verificaElementoEdElimina(HashSet<Integer> hashSet) {
        // Creo l'oggetto dello stesso tipo inserito nell'HashSet e lo popolo
        Integer oggettoDaVerificare = 2;

        // Scorro l'HashSet
        hashSet.removeIf(elemento -> elemento.equals(oggettoDaVerificare));
    }


    public static void svuotaHashSetEVerifica(HashSet<Integer> hashSet) {
        // Svuoto l'HashSet
        hashSet.clear();


        if (hashSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }
}
