
import java.util.ArrayList;
import java.util.Iterator;

public class Diccionario<K, V> {
    private ArrayList<ParOrdenado<K, V>> pares;

    public Diccionario() {
        pares = new ArrayList<>();
    }

    public void agregar(K clave, V valor) {
        pares.add(new ParOrdenado<>(clave, valor));
    }

    public boolean eliminar(K clave) {
        Iterator<ParOrdenado<K, V>> iterator = pares.iterator();
        while (iterator.hasNext()) {
            ParOrdenado<K, V> par = iterator.next();
            if (par.getClave().equals(clave)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public V obtenerValor(K clave) {
        for (ParOrdenado<K, V> par : pares) {
            if (par.getClave().equals(clave)) {
                return par.getValor();
            }
        }
        throw new ObjectNoExist("Objeto con clave '" + clave + "' no existe");
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (ParOrdenado<K, V> par : pares) {
            resultado.append(par).append("\n");
        }
        return resultado.toString();
    }
}
