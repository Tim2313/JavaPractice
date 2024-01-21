package queue;
//TODO extends class with methods from java Queue
public class Queue extends Object implements QueueInterface {
    private int[] numbers;
    private int head;
    private int tail;
    private int elementCount;

    public Queue(int size) {
        numbers = new int[size];
        head = -1;
        tail = -1;
        elementCount = 0;

    }

    @Override
    public void add(int value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (isEmpty()) {
            head = 0;
        }
        tail++;
        elementCount++;
        numbers[tail] = value;
    }

    public int delete() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = numbers[head];
        if (head == tail) {
            head = -1;
            tail = -1;
            elementCount--;
        } else {
            head++;
        }
        return value;
    }

    public int peak() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return numbers[head];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return tail == numbers.length - 1;
    }

    public int getElementCount() {
        return elementCount;
    }

    public int getCapacity() {
        return numbers.length;
    }
}