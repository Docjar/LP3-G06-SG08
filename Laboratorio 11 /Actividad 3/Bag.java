public class Bag<T> {
    private T[] list;
    private int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count < list.length) {
            list[count] = obj;
            count++;
        } else {
            throw new IsFull("La bolsa está llena. No se puede agregar elementos.");
        }
    }

    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return list;
        } else {
            throw new IsEmpty("La bolsa está vacía. No hay elementos para devolver.");
        }
    }

    public T remove(T obj) throws ObjectNotExist {
        int index = getIndex(obj);

        if (index != -1) {
            T removedObject = list[index];

            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }

            list[count - 1] = null;
            count--;

            return removedObject;
        } else {
            throw new ObjectNotExist("El objeto no existe en la bolsa.");
        }
    }

    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Contenido de la bolsa:\n");
        for (int i = 0; i < count; i++) {
            result.append("[").append(i).append("] ").append(list[i]).append("\n");
        }
        return result.toString();
    }
}

