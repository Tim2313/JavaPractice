package linkedList;

import utils.TestUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//TODO test for the rest of methods
public class LinkedListTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        LinkedListTest link = new LinkedListTest();
        Method[] methods = LinkedListTest.class.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            String name = m.getName();
            if (name.equals("getIdxOfElemTest")){
                m.invoke(link, null);
            }
            System.out.println(name);
        }

    }

    public static void getIdxOfElemTest() {
        LinkedList<String> l = new LinkedList<>();

        l.addLast("B");
        l.addLast("A");
        l.addLast("E");

        int actual = l.get("E");
        int expected = 2;
        TestUtils.assertEquals(actual, expected);

        System.out.println("'GetIdxOfElemTest' is passed!");

    }
}