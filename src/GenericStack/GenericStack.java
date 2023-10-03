package GenericStack;

import java.util.EmptyStackException;

public class GenericStack<T> {
    private T[] elements;
    private int sizeOfElements;
    private int topElement;
    GenericStack(int size){
        this.sizeOfElements=size;
        this.topElement=-1;
        elements= (T[]) new Object[size];
    }
    public void push(T element){
        if(topElement!=sizeOfElements-1){
            this.elements[++topElement]=element;
            System.out.println("Pushed "+element+" into Stack");
            return;
        }
      throw new StackOverflowError();
    }
    public boolean isEmpty(){
       return topElement==-1?true:false;
    }
    public T pop(){
        if(topElement!=-1){
            return elements[topElement--];
        }
        throw new EmptyStackException();
    }
    public T top(){
        if (topElement!=-1){
            return elements[topElement];
        }
        throw new EmptyStackException();
    }
    public int size(){
        return topElement+1;
    }
}
