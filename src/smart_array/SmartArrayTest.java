package smart_array;

import static utils.TestUtils.*;

public class SmartArrayTest {
    public static void main(String[] args) {

        testCreation();

        testThrownExceptionOnRetrevingNonExistingElement();

        testAddEll();

        testDelLastElByIdx();

        testDelFirstElByIdx();

        testDelMiddleElByIdx();

        testDelElByNotValidIdx();

        testDelFirstEl();

        testInsertElOnFirstPlace();

        testSetElToIndex();

        testDelLastElement();

        testSetElementByIdx();

    }

    /*
        #1
        Scenario: Create an empty Smart Array with capacity 10
           Given Tim want to create Smart Array
              When Timmy create Smart Array
              Then new Smart Array is created
                  And Smart Array capacity is 10
                  And Smart Array element count is 0
    */
    private static void testCreation() {
        SmartArrayInt sma = new SmartArrayInt(10);

        int actualSize = sma.getCapacity();
        int expectedSize = 10;
        assertEquals(actualSize, expectedSize);

        int actualElls = sma.getElCount();
        int expectedElls = 0;
        assertEquals(actualElls, expectedElls);

        System.out.println("'testCreation' is passed!");

    }

    /*
        #2
        Scenario: Get element on idx 22 from empty Smart Array
            Given an empty Smart Array
            When Timmy tries to retreve element on idx 22 from Smart Array
            Then the exception is thown
                And exception has massage: "You are gay, Invalid idx 22, elements count: 0"
    */
    private static void testThrownExceptionOnRetrevingNonExistingElement() {
        SmartArrayInt sm = new SmartArrayInt();

        try {
            int number = sm.getElemByIdx(22);
            String massage = "IndexOutOfBoundsException should be thrown if you want to get element from empty smart array";
            testFailed(massage);
        } catch (IndexOutOfBoundsException ex) {
            String actualMessage = ex.getMessage();
            String expectedMassage = "You are gay, Invalid idx 22, elements count: 0";
            assertEquals(actualMessage, expectedMassage);
        }

        System.out.println("'testThrownExceptionOnRetrevingNonExistingElement' is passed!");
    }

    /*
        #3
        Scenario: Add 5 elements from 1 to 5 into empty Smart Array
            Given a Smart Array
                And contest of the array is (1,2,3,4,5)
            When Timmy add 5 elem to Smart Array
            Then Smart Arrays capacity is 10
                And elements count is 5
                And Smart Array contains all input numbers
    */
    private static void testAddEll() {
        SmartArrayInt sm = new SmartArrayInt(10);
        int[] inputNums = {1, 2, 3, 4, 5};
        copyNumsToArray(sm, inputNums);

        int actualCapacity = sm.getCapacity();
        int expectedCapacity = 10;
        assertEquals(actualCapacity, expectedCapacity);

        int actualEllCount = sm.getElCount();
        int expectedEllCount = 5;
        assertEquals(actualEllCount, expectedEllCount);

        int[] expectedNums = {1, 2, 3, 4, 5};
        compareArrays(sm, expectedNums);

        System.out.println("'testAddEll' is passed!");
    }

    /*
        #4
        Scenario: Delete last element by place
            Given a Smart Array
                And content of the smart array is (1, 2, 3)
            When Timmy deletes element on place '3'
            Then the elem is deleted
                 And the elem count of smart array is '2'
                 And content of smart array is (1, 2)
        */
    private static void testDelLastElByIdx() {
        SmartArrayInt sm = new SmartArrayInt(10);
        int[] inputNums = {1, 2, 3};
        copyNumsToArray(sm, inputNums);

        sm.delElemByIdx(2);

        int actualElCount = sm.getElCount();
        int expectedElCount = 2;
        assertEquals(actualElCount, expectedElCount);

        int[] expectedNums = {1, 2};
        compareArrays(sm, expectedNums);

        System.out.println("'testDelLastElByIdx' is passed!");
    }

    /*
        #5
        Scenario: Delete first element by place
            Given a Smart Array
                And content of the smart array is (1, 2, 3)
            When Timmy delete first element by place
            Then the elem is deleted
                And the element count of smart array is '2'
                And content of smart array is (2, 3)
    */
    private static void testDelFirstElByIdx() {
        SmartArrayInt sm = new SmartArrayInt(10);
        int[] inputNums = {1, 2, 3};
        copyNumsToArray(sm, inputNums);

        sm.delElemByIdx(0);

        int actualElCount = sm.getElCount();
        int expectedElCount = 2;
        assertEquals(actualElCount, expectedElCount);

        int[] expectedNums = {2, 3};
        compareArrays(sm, expectedNums);

        System.out.println("'testDelFirstElByIdx' is passed!");
    }

    /*
        #6
        Scenario: Delete middle element by place
            Given a Smart Array
                And content of the smart array is (1, 2, 3, 4)
            When Timmy delete middle element by place
            Then elem on place '2' is deleted
                And element count is 3
                And Smart Array content is (1, 3, 4)
    */
    private static void testDelMiddleElByIdx() {
        SmartArrayInt sm = new SmartArrayInt(4);
        int[] inputNums = {1, 2, 3, 4};
        copyNumsToArray(sm, inputNums);

        sm.delElemByIdx(1);

        int actualElCount = sm.getElCount();
        int expectedElCount = 3;
        assertEquals(actualElCount, expectedElCount);

        int[] expectedNums = {1, 3, 4};
        compareArrays(sm, expectedNums);

        System.out.println("'testDelMiddleElByIdx' is passed!");
    }

    /*
        #7
        Scenario: Delete elem by not valid place
            Given an empty Smart array
            When Timmy delete elem by not valid place
            Then exception 'IndexOutOfBoundsException' is thrown
                And print 'You are gay, Invalid idx 7, elements count: '0'
    */
    private static void testDelElByNotValidIdx() {
        SmartArrayInt sma = new SmartArrayInt(10);

        try {
            sma.delElemByIdx(7);
            String massage = "IndexOutOfBoundsException should be throw if you try to remove element from empty smart array";
            testFailed(massage);
        } catch (IndexOutOfBoundsException ex) {
            String actualMassage = ex.getMessage();
            String expectedMassage = "You are gay, Invalid idx 7, elements count: 0";
            assertEquals(actualMassage, expectedMassage);
        }

        System.out.println("'testDelElByNotValidIdx' is passed!");
    }

    /*
        #8
        Scenario: delete elem on the first place
            Given a Smart Array
                And content of the smart array is (1, 2, 3, 4, 5)
            When Timmy delete first element
            Then first element is deleted
                And element count is 4
                And the smart array content is (2, 3, 4, 5)
     */
    private static void testDelFirstEl() {

        SmartArrayInt sm = new SmartArrayInt(5);
        int[] inputNums = {1, 2, 3, 4, 5};
        copyNumsToArray(sm, inputNums);

        sm.delFirstEl();

        int actualFirstEl = sm.getElemByIdx(0);
        int expectedFirstEl = inputNums[1];
        assertEquals(actualFirstEl, expectedFirstEl);

        int actualElCount = sm.getElCount();
        int expectedElCount = 4;
        assertEquals(actualElCount, expectedElCount);

        int[] expectedNums = {2, 3, 4, 5};
        compareArrays(sm, expectedNums);

        System.out.println("'testDelFirstEl' is passed!");

    }

    /*
        #9
        Scenario: Insert element on first place
            Given a Smart Array
                And content of the smart array is (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            When Timmy insert '1' elem on first place
            Then the element on first place is changed
                And elem on first place is '9'
                And the smart array content is (9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    */
    private static void testInsertElOnFirstPlace() {
        SmartArrayInt sm = new SmartArrayInt(12);
        int[] inputNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        copyNumsToArray(sm, inputNums);

        sm.insertEllOnFirstPl(9);

        int actualNumOnFirstPlace = sm.getElemByIdx(0);
        int expectedNumOnFirstPlace = 9;
        assertEquals(actualNumOnFirstPlace, expectedNumOnFirstPlace);

        int[] expectedNums = {9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        compareArrays(sm, expectedNums);

        System.out.println("'testInsertElOnFirstPlace' is passed!");
    }

    /*
        #10
        Scenario: Set num '10' on place '5'
            Given: a Smart Array
                And content of the smart array is (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            When Timmy puts num '10' on place '5'
            Then num on place '5' is changed
                And num on the place '5' is '10'
                And content of array is (1, 2, 3, 4, 10, 6, 7, 8, 9, 10)
    */
    private static void testSetElToIndex() {
        SmartArrayInt sm = new SmartArrayInt(10);
        int[] inputNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        copyNumsToArray(sm, inputNums);

        sm.setElByIdx(4, 10);
        int actualNumOnIdx = sm.getElemByIdx(4);
        int expectedNumOnIdx = 10;
        assertEquals(actualNumOnIdx, expectedNumOnIdx);

        int[] expectedNums = {1, 2, 3, 4, 10, 6, 7, 8, 9, 10};
        compareArrays(sm, expectedNums);

        System.out.println("'testSetElToIndex' is passed!");
    }

    /*
        #11
        Scenario: delete last element from the smart array
            Given a Smart Array
                And content of the Smart Array is (1, 2, 3, 4, 5)
            When Timmy deletes last element from the Smart Array
            Then the last element is deleted
                And content of array is (1, 2, 3, 4)
     */
    private static void testDelLastElement() {
        SmartArrayInt sm = new SmartArrayInt();
        int[] inputNums = {0, 1, 2, 3, 4, 5};
        copyNumsToArray(sm, inputNums);

        sm.delLastEll();

        int actualLastElem = sm.getElemByIdx(4);
        int expectedLastElem = 4;
        assertEquals(actualLastElem, expectedLastElem);

        System.out.println("'testDelLastElement' is passed!");
    }

    /*
    #12
    Scenario: set element by idx
        Given a Smart Array
            And content of array is (0, 1, 2, 3, 4, 5, 6, 7)
        When Timmy sets number '5' on idx '3'
        Then the element on idx '3'
            And content of array is (0, 1, 2, 5, 4, 5, 6, 7)
     */
    private static void testSetElementByIdx() {
        SmartArrayInt sm = new SmartArrayInt();
        int[] inputNums = {0, 1, 2, 3, 4, 5, 6, 7};
        copyNumsToArray(sm, inputNums);

        sm.setElByIdx(3, 5);

        int actualNum = sm.getElemByIdx(3);
        int expectedNum = 5;
        assertEquals(actualNum, expectedNum);

        System.out.println("'testSetElementByIdx' is passed!");
    }

    private static void copyNumsToArray(SmartArrayInt sm, int[] inputNums) {
        for (int i = 0; i < inputNums.length; i++) {
            sm.addElement(inputNums[i]);
        }
    }

    private static void compareArrays(SmartArrayInt actualNums, int[] expectedNums) {
        for (int idx = 0; idx < expectedNums.length; idx++) {
            int actualNum = actualNums.getElemByIdx(idx);
            int expectedNum = expectedNums[idx];
            assertEquals(actualNum, expectedNum);
        }
    }

}





