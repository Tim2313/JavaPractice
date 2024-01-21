package java_practice;

import smart_array.SmartArrayInt;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

//        Object ob = new Object();
//        ob.
//        SmartArray sm = new SmartArray();

        Object smObject = new SmartArrayInt();

        SmartArrayInt sm = (SmartArrayInt) smObject;

        for (int i = 0; i < 1; i++) {
            int randomNum = getRandomNum(0, 1);

            System.out.println(randomNum);
        }


    }
    // inheritance - наследование - extends
    // aggregation - агригация - implements
    //
    public static int getRandomNum(int start, int end) {
        Random random = new Random();

        int num = random.nextInt();

        int positiveNum = Math.abs(num);

        int delta = end - start + 1;

        return (positiveNum % delta) + start;
    }
}
