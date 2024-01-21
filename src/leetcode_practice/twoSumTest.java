package leetcode_practice;


import utils.TestUtils;

import static leetcode_practice.TwoSum.twoSum;

public class twoSumTest {
    public static void main(String[] args) {

        twoSumFirstTest();

        twoSumSecondTest();

        twoSumThirdTest();

        twoSumForthTest();

    }

    public static void twoSumFirstTest() {
        int numbers[] = {3,2,3};
        int target = 6;

        int actualArray[] = twoSum(numbers,target);
        int expectedArray[] = {0,2};
        TestUtils.assertEquals(actualArray, expectedArray);

        System.out.println("'twoSumFirstTest' is passed!");


    }

    public static void twoSumSecondTest() {
        int numbers[] = {2,11,34,7};
        int target = 9;

        int actualArray[] = twoSum(numbers,target);
        int expectedArray[] = {0,3};
        TestUtils.assertEquals(actualArray, expectedArray);

        System.out.println("'twoSumSecondTest' is passed!");


    }

    public static void twoSumThirdTest() {
        int numbers[] = {-1,-2,-3,-4,-5};
        int target = -8;

        int actualArray[] = twoSum(numbers,target);
        int expectedArray[] = {2,4};
        TestUtils.assertEquals(actualArray, expectedArray);

        System.out.println("'twoSumThirdTest' is passed!");


    }

    public static void twoSumForthTest() {
        int numbers[] = {2,7,34,11};
        int target = 9;

        int actualArray[] = twoSum(numbers,target);
        int expectedArray[] = {0,1};
        TestUtils.assertEquals(actualArray, expectedArray);

        System.out.println("'twoSumForthTest' is passed!");


    }
}
