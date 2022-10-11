package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
        String[] inputStr = scanner.nextLine().split("");
        int check = 0;
        for (int i = 0; i < (inputStr.length/2); i++) { // sô sánh 2 nửa của chuỗi với nhau xem có giống nhau ko
            if (inputStr[i].equals(inputStr[inputStr.length-1 - i])){
                check +=1;
            }else{
                check=0;
            }

        }
        if (check !=0){
            System.out.println("chuỗi bạn nhập là 1 chuỗi đối xứng");
        }else {
            System.out.println("chuỗi bạn nhập không phải là đối  xứng");
        }


    }

}
