import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> myAList = new ArrayList();
        LinkedList<String> myLList = new LinkedList();
        int size = 0;
        try
        {   // The name of the file which we will read from
            String filename = "words_alpha.txt";

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine())
            {
                // Read one string from the file
                String str = in.nextLine();
                // add str to ArrayList and LinkedList
                myAList.add(str);
                myLList.add(str);
                size++;

            }
            System.out.println("Words in file: " + size);

            //Get
            long timeBeforeGetA = System.currentTimeMillis();
            testGetForArrayList(myAList);
            long AGetTotal = System.currentTimeMillis() - timeBeforeGetA;
            System.out.println("Array list: " + AGetTotal + "ms");

            long timeBeforeGetL = System.currentTimeMillis();
            testGetForLinkedList(myLList);
            long LGetTotal = System.currentTimeMillis() - timeBeforeGetL;
            System.out.println("Linked list: " + LGetTotal + "ms");

            //Set
            long timeBeforeSetA = System.currentTimeMillis();
            testSetForArrayList(myAList);
            long ASetTotal = System.currentTimeMillis() - timeBeforeSetA;
            System.out.println("Array list: " + ASetTotal + "ms");

            long timeBeforeSetL = System.currentTimeMillis();
            testGetForLinkedList(myLList);
            long LSetTotal = System.currentTimeMillis() - timeBeforeSetL;
            System.out.println("Linked list: " + LSetTotal + "ms");
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found");

        }
    }

    //Methods for Get
    public static void testGetForArrayList(ArrayList a)
    {
        testGetForList(a);
    }

    public static void testGetForLinkedList(LinkedList l)
    {
        testGetForList(l);
    }

    public static void testGetForList(List list) {
        int listSize = list.size();
        Random random = new Random();
        int reps = 50000;
        for(int i = 0; i < reps; i++) {
            // reps is the number of repetitions
            // declare reps as something large e.g. 10000000
            list.get(random.nextInt(listSize)); // list is your list
            // (ArrayList or LinkedList)
        }
    }
    //Methods for set

    public static void testSetForArrayList(ArrayList a)
    {
        testSetForList(a);
    }

    public static void testSetForLinkedList(LinkedList l)
    {
        testSetForList(l);
    }
    public static void testSetForList(List list) {
        int listSize = list.size();
        Random random = new Random();
        int reps = 50000; //something very large
        for (int i = 0; i < reps; i++)
            list.set(random.nextInt(listSize),"test");
    }


}
