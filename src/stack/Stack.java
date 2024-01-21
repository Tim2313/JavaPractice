package stack;
public class Stack {
    private int[] numbers;
    private int topIdx = -1;
    private int capacity;

    public Stack(int initialCapacity) {
        capacity = initialCapacity;
        numbers = new int[capacity];
    }

    public Stack() {
        capacity = 5;
        numbers = new int[capacity];
    }

    // instance - сущность (обьект чаще всего)
    // instantiate - інстанциірованіє
    // implicit - неявное
    // explicit - явное
    // implicit behavior - неявное поведение (плохо)
    // explicit behavior - явное поведение

    public void push(int number) {
        numbers[topIdx + 1] = number;
        topIdx++;
    }

    public int pop() {
        int elementToPop = numbers[topIdx];
        numbers[topIdx] = 0;
        topIdx--;
        return elementToPop;
    }

    public int peek() {
        return numbers[topIdx];
    }

    public boolean isEmpty() {
        return topIdx < 0;
    }

    public int getCapacity() {
        return capacity;
    }

}

