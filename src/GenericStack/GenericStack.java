package GenericStack;
public class GenericStack<T> {

    Node<T> head = null;
    Integer totalPushedElements;
    Integer sizeForStack;

    GenericStack(Integer sizeForStack) {
        this.sizeForStack = sizeForStack;
        this.totalPushedElements = 0;
    }

    public void push(T element) {
        if (totalPushedElements < sizeForStack) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            totalPushedElements++;
            return;
        }
        throw new StackOverflowError("Stack overFlows the size the of " + sizeForStack);
    }

    public boolean isEmpty() {
        return totalPushedElements == 0;
    }

    public T pop(){
        T data= head.data;
        head=head.next;
        totalPushedElements--;
        return data;
    }

    public int size(){
        return totalPushedElements;
    }

    public T top(){
        return (T)head.data;
    }
}
class Node<D> {
    D data;
    Node<D> next = null;

    Node(D data) {
        this.data = data;
    }

    public D getData() {
        return data;
    }
}
