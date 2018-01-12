package mobileappscompany.w6test;

/**
 * Created by fallaye on 1/12/18.
 */

public class StackOfChars {

    int top = -1;
    int size = 100;
    char chars[] = new char[size];

    public StackOfChars(){

    }

    void push(char x) {
        if (top != size - 1 ) {
            chars[++top] = x;
        }else {
            System.out.println("Stack is full");
        }

    }

    char pop()
    {
        if (top == -1)
        {
            System.out.println("Underflow error");
            return '\0';
        }
        else
        {
            char ch = chars[top];
            top--;
            return ch;
        }
    }

    boolean isEmpty()
    {
        return (top == -1) ? true : false;
    }

}
