package GenericStack;

import java.util.EmptyStackException;
import java.util.Scanner;

public class GenericStackExecution {
    private static void menu(){
        System.out.println("Stack Operations");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Top");
        System.out.println("4.Size");
        System.out.println("5.IsEmpty");
        System.out.println("6.Quit");
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size for Stack: ");
        int size = scanner.nextInt();
        GenericStack<Integer> genericStack = new GenericStack<Integer>(size);
        while (true) {
            menu();
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: //Push
                    try {
                        System.out.println("Enter Element: ");
                        Integer element=scanner.nextInt();
                        genericStack.push(element);

                    } catch (StackOverflowError e) {
                        e.printStackTrace();
                        System.out.println("Stack is full");
                    }
                    finally {
                        break;
                    }
                case 2://Pop
                    try {
                        System.out.println("Popped Element is "+genericStack.pop());

                    } catch (EmptyStackException e) {
                        e.printStackTrace();
                        System.out.println("Stack is Empty");
                    }
                    finally {
                        break;
                    }
                case 3://Pop
                    try {
                        System.out.println("Top Element is "+genericStack.top());

                    } catch (EmptyStackException e) {
                        e.printStackTrace();
                        System.out.println("Stack is Empty");
                    }
                    finally {
                        break;
                    }
                case 4:
                    System.out.println("Number of Elements in Stack: "+ genericStack.size());
                    break;
                case 5:
                    if(genericStack.isEmpty())
                    System.out.println("Stack is Empty");
                    else System.out.println("Stack is not Empty");
                    break;
                case 6:
                    System.out.println("Quit");
                    return;

                default:
                    System.out.println("Unexpected Choice "+choice);
                    break;
            }
        }
    }
}
