package Collections_40_42;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList <E> implements SimpleList<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(E newElement) {
        ensureCapacity(size + 1);
        data[size] = newElement;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }

    @Override
    public Iterator<E> iterator()  {
        return new Iter();
    }

    class Iter <E> implements Iterator<E> {

        int cursor;
        int lastRet;

        private Iter() {
            this.cursor = 0;
            this.lastRet = -1;
        }

        @Override
        public boolean hasNext() {
            return this.cursor != SimpleArrayList.this.size;
        }

        @Override
        public E next() {
            try {
                int e = this.cursor;
                E next = (E) SimpleArrayList.this.get(e);
                this.lastRet = e;
                this.cursor = e + 1 ;
                return next;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException();
            }

        }

        @Override
        public void remove() {

        }
    }

    @Override
    public String toString() {
        String listString = "[";
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                if (i == data.length) {
                    listString += data[i];
                } else {
                    listString += data[i] + ", ";
                }
            }
        }
        listString += "]";
        return listString;
    }

    @Override
    public boolean equals(Object o) {
        boolean sameSame = false;
        if (o != null && o instanceof SimpleArrayList)
        {
            sameSame = this.data == ((SimpleArrayList) o).data;     //может надо пройтись по каждому элементу массива
        }
        return sameSame;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result;
//
//        if (data == null) {
//            result += 0;
//        } else {
//            result += ;
//        }
//
//        return result;
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }

    /*BODY*/

}

interface SimpleList<E> {
    public boolean add(E newElement);
    public E get(int index);
    public Iterator<E> iterator();
    public int size();
    public boolean isEmpty();
    public E remove(int index);
} 