package bài4;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
     Stack<Integer> myStack =new Stack<>();
        System.out.println("nhập vào 1 số thập phân");
        int number = Integer.parseInt(scanner.nextLine());
        int numSave = number;
        while (number/2!=0){
            int soDu = number % 2;
            myStack.push(soDu);
            number=number/2;
        }myStack.push(number);
        System.out.printf("Số %d bạn nhập chuyển qua nhị phân là : ",numSave);
       while (!myStack.isEmpty()){
           System.out.printf("%d\t",myStack.pop());
       }//lấy ngược lại từ giá trị cối lên giá trị đầu;

    }
}
