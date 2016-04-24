package Collections_40_42;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestForLab40{
    public static void main(String[] args) {

        //empty list
        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = simpleArrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }

        if (iterator == null)
            throw new AssertionError("Iterator must be no equals null");

        if (iterator.hasNext())
            throw new AssertionError("hasNext() must be returned false if no element");

        boolean isExceptionMethodNext = false;
        try {
            iterator.next();
        } catch (NoSuchElementException e) {
            isExceptionMethodNext = true;
        }
        if (!isExceptionMethodNext)
            throw new AssertionError("next() must be throw NoSuchElementException if no element");

        System.out.print("OK");
    }
}