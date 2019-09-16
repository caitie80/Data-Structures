package Lab2;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void addFirst() {
        CP3LinkedList<String> myList = new CP3LinkedList();
        String expected = "Sam";

        myList.addFirst(expected);

        String actual = myList.getFirst();
        assertEquals(expected,actual);
    }

    @Test
    void addLast() {
        CP3LinkedList<String> myList = new CP3LinkedList();
        String expected = "Sam";

        myList.addLast(expected);

        String actual = myList.getLast();
        assertEquals(expected,actual);
    }

    @Test
    void getFirst() {
        CP3LinkedList<String> myList = new CP3LinkedList();
        assertThrows(NoSuchElementException.class,
                ()->{
                    myList.getFirst();
                });

        String expected = "Jane";
        myList.addFirst(expected);
        String actual = myList.getFirst();
        assertEquals(expected, actual);
    }

    @Test
    void getLast() {
        CP3LinkedList<String> myList = new CP3LinkedList();
        assertThrows(NoSuchElementException.class,
                ()->{
                    myList.getLast();
                });

        String expected = "Jane";
        myList.addLast(expected);
        String actual = myList.getLast();
        assertEquals(expected, actual);
    }

    @Test
    void removeFirst() {
        CP3LinkedList<String> myList = new CP3LinkedList();
        assertThrows(NoSuchElementException.class,
                ()->{
                    myList.removeFirst();
                });

        String expected = "Jane";
        myList.addFirst(expected);
        String actual = myList.removeFirst();
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        boolean actual = myList.isEmpty();
        assertTrue(actual);

        myList.addFirst("Jane");
        myList.addFirst("Sam");
        myList.addFirst("Bob");
        actual = myList.isEmpty();

        assertFalse(actual);
    }

    @Test
    void size() {
        CP3LinkedList<Integer> myList = new CP3LinkedList();
        int expected = 0;
        int actual = myList.size();
        assertEquals(expected, actual);

        expected = 3;
        myList.addFirst(10);
        myList.addFirst(5);
        myList.addFirst(8);

        actual = myList.size();

        assertEquals(expected, actual);
    }
}