package queue;
//TODO extend interface with methods 
public interface QueueInterface {

    void add(int value);
    int delete();
    int peak();
    boolean isEmpty();
    boolean isFull();
    int getElementCount();
    int getCapacity();


}
