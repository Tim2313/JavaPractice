
package queue;

import static utils.TestUtils.*;

public class QueueTest {
    public static void main(String[] args) {

        testCreationQueueArray();

        testAddElemToArray();

        testDeleteHeadElement();
    }

    /*
    #1
    Scenario: create array with size (10)
        Given: Timmy wants to create an empty array with size (10)
            When Timmy creates an empty array
            Then array is created
                And size of it is (10)
     */
    public static void testCreationQueueArray() {
        Queue q = new Queue(10);

        int actual = q.getCapacity();
        int expected = 10;

        assertEquals(actual, expected);

        System.out.println("'testCreationQueueArray' is passed!");
    }

    /*
    #2
    Scenario: add elements to the array
        Given: an empty array with size (10)
            When Timmy adds '1'and '2' to the array
            Then elements are added
                And elementCount is 2
                And head elem is 1
     */
    public static void testAddElemToArray() {
        Queue q = new Queue(10);

        q.add(1);
        q.add(2);

        int actualElemCount = q.getElementCount();
        int expectedElemCount = 2;
        assertEquals(actualElemCount, expectedElemCount);

        int actualHeadElem = q.peak();
        int expectedHeadElem = 1;
        assertEquals(actualHeadElem, expectedHeadElem);

        System.out.println("'testAddElemToArray' is passed!");
    }

    /*
    #3
    Scenario: delete head element from array
        Given: an empty array with size (10)
            And add to it '1', '2'
            When Timmy deletes head element
            Then head element is deleted
                And head element is '2'
                Adn element count is '1'
     */
    public static void testDeleteHeadElement() {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);

        q.delete();
        int actualElemCount = q.getElementCount();
        int exepctedElemCount = 2;
        assertEquals(actualElemCount, exepctedElemCount);

        int actualHead = q.peak();
        int expectedHead = 2;
        assertEquals(actualHead, expectedHead);

        System.out.println("'testDeleteHeadElement' is passed!");
    }
}
