package smart_array;

public class SmartArrayInt extends Object{
    private int[] numbers;
    private int capacity;
    private int elementsCount = 0;

    public SmartArrayInt(int initialCapacity) {
        capacity = initialCapacity;
        numbers = new int[capacity];
    }

    public SmartArrayInt() {
        capacity = 10;
        numbers = new int[capacity];
    }

    public void addElement(int number) {
        if (capacity == elementsCount) {
            System.out.println("Extension: old Array capacity was too small.");
            System.out.printf("old capacity -> %d, new capacity -> %d\n", capacity, capacity * 2);
            int[] extendedArray = new int[capacity * 2];
            for (int i = 0; i < elementsCount; i++) {
                extendedArray[i] = numbers[i];
            }
            numbers = extendedArray;
            capacity *= 2;
        }
        numbers[elementsCount] = number;
        elementsCount++;
    }

    public void printArray() {
        for (int i = 0; i < elementsCount; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public int getElemByIdx(int idxNumber) {
        if (capacity < idxNumber) {
            String massagePattern = "You are gay, Invalid idx %d, elements count: %d";
            String massage = String.format(massagePattern, idxNumber, elementsCount);
            throw new IndexOutOfBoundsException(massage);
        }
        return numbers[idxNumber];
    }

    public int getCapacity() {
        return capacity;
    }

    public void delElemByIdx(int idxOfNumber) {
        if (elementsCount < idxOfNumber) {
            String massagePattern = "You are gay, Invalid idx %d, elements count: %d";
            String massage = String.format(massagePattern, idxOfNumber, elementsCount);
            throw new IndexOutOfBoundsException(massage);
        }

        for (int i = idxOfNumber; i < elementsCount - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        elementsCount--;
    }

    public void insertEllOnFirstPl(int number) {

        for (int i = capacity - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = number;
        elementsCount++;

    }

    public void setEllToIdx(int idx, int number) {
        if (numbers.length < idx) {
            System.out.println("Our mass have only: " + numbers.length + "length");
        } else {
            numbers[idx] = number;
        }
    }

    public void delFirstEl() {
        delElemByIdx(0);
    }

    public void delLastEll() {
        delElemByIdx(elementsCount - 1);
    }

    public void setElByIdx(int idx, int newNumber) {
        if (idx > capacity) {
            System.out.printf("Our mass has only %d places.", capacity);
        } else {
            numbers[idx] = newNumber;
        }
    }

    public int getElCount() {
        return elementsCount;
    }
}



