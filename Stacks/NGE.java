// http://www.geeksforgeeks.org/next-greater-element/
// NExt Greater Element

import java.util.*;

public class NGE {

    static class stack {
        int top;
        int items[] = new int[100];

        void push(int x) {
            if (top == 99) {
                System.out.println("OVERFLOW");
            } else {
                items[++top] = x;
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("UNDERFLOW");
                return -1;
            } else {
                int element = items[top];
                top = top - 1;
                return element;
            }
        }

        boolean isEmpty() {
            return (top == -1) ? true : false;
        }
    }

    static void printNGE(int arr[], int n) {
        int i = 0;
        stack s = new stack();
        s.top = -1;
        int element, next;
        s.push(arr[0]);
        for (i = 1; i < n; i++) {
            next = arr[i];
            if (s.isEmpty() == false) {
                element = s.pop();
                while (element < next) {
                    System.out.println(element + "->" + next);
                    if (s.isEmpty()) {
                        break;
                    }
                    element = s.pop();
                }
                if (element > next)
                    s.push(element);

            }
            s.push(next);
        }
        while (!s.isEmpty()) {
            element = s.pop();
            next = -1;
            System.out.println(element + "->" + next);
        }
    }

    public static void main(String args[]) {

        
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i_t = 0;i_t<t;i_t++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = scn.nextInt();
            }
            printNGE(arr, n);
        }
    }

}