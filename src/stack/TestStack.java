package stack;
import static utils.TestUtils.*;

public class TestStack {

    public static void main(String[] args) {

        testInitialcapacity();

        testCapacityWithoutInitial();

        testPushElemToTheStack();

        testPopElemFromTheStack();

        testPeekTopElemOfTheStack();

        testIsStackIsFilled();

        testIsStackIsEmpty();

        testAddTwentyElemToTheStack();

        testPopTwentyElemToTheStack();
    }

    /*
    #1
    Scenario: Initial size of the stack
        Given Timmy wants to create the stack
        When Timmy creates the stack
            And size of the stack is '10'
        Then stack is created
            And size of the stack is '10'
     */
    private static void testInitialcapacity() {
        Stack stack = new Stack(10);

        int actualCap = stack.getCapacity();
        int expectedCap = 10;
        assertEquals(actualCap, expectedCap);

        System.out.println("'testInitialcapacity' is passed");
    }

    /*
    #2
    Scenario: Size of the stack without initialisation
        Given Timmy wants to create the stack
        When Timmy creates the stack
        Then the stack is created
            And size of the stack is '5'
     */
    private static void testCapacityWithoutInitial() {
        Stack stack = new Stack();

        int actualCap = stack.getCapacity();
        int expectedCap = 5;
        assertEquals(actualCap, expectedCap);

        System.out.println("'testCapacityWithoutInitial' is passed");
    }

    /*
    #3
    Scenario: Push elem to the stack
        Given an empty stack
        When Tim pushes '5' to the stack
        Then the '5' is pushed
            And '5' is top element
     */
    private static void testPushElemToTheStack() {
        Stack stack = new Stack();

        stack.push(5);

        int actualTopElem = stack.peek();
        int expectedTopElem = 5;
        assertEquals(actualTopElem, expectedTopElem);

        System.out.println("'testPushElemToTheStack' is passed");
    }

    /*
    #4
    Scenario: Pop elem from the stack
        Given the stack with content (4, 5)
        When Tim pops element '5' from the stack
        Then the element '5' is popped
            And the new top elem is '4'
     */
    private static void testPopElemFromTheStack() {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);

        int actualPoppedElem = stack.pop();
        int expectedPoppedElem = 5;
        assertEquals(actualPoppedElem, expectedPoppedElem);

        int actualTopElem = stack.peek();
        int expectedTopElem = 4;
        assertEquals(actualTopElem, expectedTopElem);

        System.out.println("'testPopElemFromTheStack' is passed");
    }

    /*
    #5
    Scenario: Peek top element from the stack
        Given the stack with top elem '5'
        When Tim peeks top elem from the stack
        Then elem '5' is showed
     */
    private static void testPeekTopElemOfTheStack() {
        Stack stack = new Stack();
        stack.push(5);

        int actualTopEl = stack.peek();
        int expectedTopEl = 5;
        assertEquals(actualTopEl, expectedTopEl);

        System.out.println("'testPeekTopElemOfTheStack' is passed");
    }

    /*
    #6
    Scenario: Is the stack is filled
        Given the stack with content (5)
        When Tim checks is the stack filled
        Then the stack state is 'Filled'
     */
    private static void testIsStackIsFilled() {
        Stack stack = new Stack();
        stack.push(5);

        boolean actual = stack.isEmpty();
        boolean expected = false;
        assertEquals(actual, expected);

        System.out.println("'testIsStackIsFilled' is passed");
    }

    /*
    #7
    Scenario: Is the stack is empty
        Given the stack without top elem
        When Tim checks is the stack empty
        Then the stack state is 'Empty'
     */
    private static void testIsStackIsEmpty() {
        Stack stack = new Stack();

        boolean actual = stack.isEmpty();
        boolean expected = true;
        assertEquals(actual, expected);

        System.out.println("'testIsStackIsEmpty' is passed");
    }

    /*
    #8
    Scenario: add 20 elements to the stack
        Given the stack without top element
        When Tim adds 20 elements to the stack
        Then the elements is added
            And the top element is '20'
     */
    private static void testAddTwentyElemToTheStack() {
        Stack stack = new Stack(20);

        for (int i = 1; i < 21; i++) {
            stack.push(i);
        }

        int actualTopNum = stack.peek();
        int expectedTopNum = 20;
        assertEquals(actualTopNum, expectedTopNum);

        System.out.println("'testAddTwentyElemToTheStack' is passed!");
    }

    /*
   #8
   Scenario: pop 20 elements from the stack
       Given the stack with top element '20'
       When Tim pops 20 elements from the stack
       Then the elements is popped
           And the top element is '_'
    */
    private static void testPopTwentyElemToTheStack() {
        Stack stack = new Stack(20);

        for (int i = 1; i < 21; i++) {
            stack.push(i);
        }

        for (int i = 1; i < 21; i++) {
            stack.pop();
        }

        boolean actual = stack.isEmpty();
        boolean expected = true;
        assertEquals(actual, expected);

        System.out.println("'testPopTwentyElemToTheStack' is passed!");
    }

}
