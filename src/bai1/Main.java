package bai1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      Stack<Integer> myStack =new Stack<>();
      int[] arrInt = {5,6,7,8,9};
        for (int i = 0; i < arrInt.length; i++) {
            myStack.push(arrInt[i]);
        }
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]=myStack.pop();

        }
        System.out.println("mảng sau khi đảo ngược là: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d ",arrInt[i]);

        }

















//        Stack<Integer> myStack = new Stack<>();
//        int[] arrInt = {5,6,7,8,9};
//        for (int i = 0; i < arrInt.length; i++) {
//            myStack.push(arrInt[i]);
//        }
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i]=myStack.pop();
//
//        }
//        System.out.println("mảng sau khi đảo ngược là");
//        for (int i = 0; i < arrInt.length; i++) {
//            System.out.printf("%d ",arrInt[i]);
//
//        }
    }
}
