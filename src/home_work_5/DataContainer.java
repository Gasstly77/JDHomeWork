package home_work_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer <T> implements Iterable<T>{
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод для добавления нового элемента в хранилище.
     * @param item элемент который необходимо добавить.
     * @return Возвращает номер позиции в которую были вставлены данные.
     */
    public int add (T item) {
        int index = 0;
        boolean emptySpace = false;

        if (item == null) {
            return -1;
        } else {

            T[] currentArray = this.data;
            for (T el : currentArray) {
                if (el == null) {
                    emptySpace = true;
                }
            }

            if (currentArray.length == 0) {
                index = 0;
                currentArray = Arrays.copyOf(currentArray, currentArray.length + 1);
                currentArray[index] = item;
                this.data = currentArray;
            } else if (!emptySpace) {
                currentArray = Arrays.copyOf(currentArray, currentArray.length + 1);
                currentArray[currentArray.length - 1] = item;
                this.data = currentArray;
                index = currentArray.length - 1;
            } else {
                boolean placed = false;
                for (int i = 0; i < currentArray.length; i++) {
                    index = i;
                    if (currentArray[i] == null) {
                        currentArray[i] = item;
                        placed = true;
                    }
                    if (placed)
                        break;
                }
            }
            return index;
        }
    }

    /**
     * Метод для получение значения элемента из хранилища по индексу.
     * @param index идекс элемента который необходимо получить.
     * @return возвращает элемент который хранится под указанным индексом.
     */
    public T get (int index) {
        if (index >= this.data.length || index < 0) {
            return null;
        } else {
            T element = (T) this.data[index];
            return element;
        }
    }

    /**
     * Метод возвращает содержимое хранилища.
     * @return массив элементов содержащихся в хранилище.
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Метод удаляет элемент из поля data по индексу.
     * @param index индекс элемента который необходимо удалить.
     * @return возвращает true в случае успешного удаления, в других случаях возвращает false.
     */
    public boolean delete(int index) {
        T[] currentArray = this.data;
        if (index >= this.data.length || index < 0) {
            return false;
        } else {
            currentArray[index] = null;
            T nextElem;
            for (int i = 0; i < currentArray.length-1; i++) {
                if (currentArray[i] == null) {
                    nextElem = currentArray[i+1];
                    currentArray[i+1] = currentArray[i];
                    currentArray[i] = nextElem;
                }
                if (currentArray[currentArray.length-1] == null)
                    break;
            }
            this.data = Arrays.copyOf(currentArray,currentArray.length-1);
            return true;
        }
    }

    /**
     * Метод удаляет переданный элемент из поля data.
     * @param item значение элемента который необходимо удалить.
     * @return возвращает true в случае успешного удаления, в других случаях возвращает false.
     */
    public boolean delete(T item) {
        int replaceIndex = 0;
        T[] currentArray = this.data;
        boolean deletElem = false;
        if (item == null) {
            return false;
        } else {
            for (int j = 0; j <= currentArray.length; j++) {
                if (item.equals(currentArray[j])) {
                    replaceIndex = j;
                    deletElem = true;
                }
                if (deletElem)
                    break;
            }
            if (!deletElem) {
                return false;
            } else {
                currentArray[replaceIndex] = null;
                T nextElem;
                for (int i = 0; i < currentArray.length - 1; i++) {
                    if (currentArray[i] == null) {
                        nextElem = currentArray[i + 1];
                        currentArray[i + 1] = currentArray[i];
                        currentArray[i] = nextElem;
                    }
                    if (currentArray[currentArray.length - 1] == null)
                        break;
                }
                this.data = Arrays.copyOf(currentArray, currentArray.length - 1);
                return true;
            }
        }
    }

    /**
     * НЕ СТАТИЧЕСКИЙ метод сортировки данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
     * @param comparator объекта comparator который указывает метод сортировки данных.
     */
    public void sort(Comparator<T> comparator) {
        T[] arr = this.data;
        int right = arr.length-1;
        T currVal;
        int haveChanges;

        do {
            haveChanges = 0;
            for (int i = 0; i<right;i++) {
                if (comparator.compare(arr[i],arr[i+1]) > 0) {
                    currVal = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=currVal;
                    haveChanges=1;
                }
            }
            right--;
        } while (haveChanges == 1);
        this.data=arr;
    }

    /**
     * Метод сортировки данных. Данный метод сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.
     * @param container контейнер конкретного типа.
     */
    public void sort (DataContainer < ? extends Comparable > container){
        boolean haveChanges;
        do {
            haveChanges = false;
            for (int i = 0; i < container.data.length-1; i++) {
                if (container.data[i].compareTo(container.data[i + 1]) > 0) {
                    swap(container.data, i, i + 1);
                    haveChanges = true;
                }
            }
        } while (haveChanges);
    }

    /**
     * Метод сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
     * @param container объект контейнера.
     * @param comparator метод используемый для сравнения.
     * @param <C> тип элемента контейнера.
     */
    public <C> void sort(DataContainer<C> container, Comparator<C> comparator) {
        boolean haveChanges;
        do {
            haveChanges = false;
            for (int i = 0; i < container.data.length-1; i++) {
                if (comparator.compare(container.data[i],container.data[i + 1]) > 0) {
                    swap(container.data, i, i + 1);
                    haveChanges = true;
                }
            }
        } while (haveChanges);
    }

    /**
     * Переопределение метода toString() в классе.
     * @return возвращает строку с содержимым data без ячеек в которых хранится null.
     */
    @Override
    public String toString(){
        String newString = "[";
        T[] arr = this.data;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && newString.length() == 1) {
                newString = newString + arr[i];
            } else if (arr[i] != null){
                newString = newString + ", " + arr[i];
            }
        }
        newString = newString + "]";
        return newString;
    }

    /**
     * Вспомогательный метод для замены местами элементов контейнера.
     * @param swapArray массив элементов в котором производится смена позиций элемента.
     * @param index1 индекс первого элемента который нужно поменять.
     * @param index2 индейс второго элемента который нежно поменять.
     * @param <T> тип элементов контейнера.
     */
    private static <T> void swap (T[] swapArray, int index1, int index2) {
        T swappingElem = swapArray [index1];
        swapArray[index1] = swapArray[index2];
        swapArray[index2] = swappingElem;
    }

    @Override
    public Iterator<T> iterator() {
        return new DataIterator<>(this.data);
    }

    /**
     * Реализация интерфейса Iterator в DataContainer.
     * @param <T> тип элементов хранилища.
     */
    private class DataIterator<T> implements Iterator<T> {
        private T[] data;
        private int index;

        public DataIterator(T[] data) {
            this.data = data;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < this.data.length && this.data[index] != null;
        }

        @Override
        public T next() {
            return this.data[index++];
        }
    }
}

