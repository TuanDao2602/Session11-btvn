package bai2;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bạn hãy nhập vào 1 chuỗi kí tự");
        String[] arrStr = scanner.nextLine().split(" ");
        TreeMap<String,Integer> myMap = new TreeMap<>();
        for (int i = 0; i < arrStr.length; i++) {
            if (myMap.containsKey(arrStr[i])){
                myMap.put(arrStr[i],myMap.get(arrStr[i])+1);
            }else {
                myMap.put(arrStr[i],1);
            }

        }
        for (String key: myMap.keySet()) {
            System.out.printf(" %s  %d \n",key,myMap.get(key));

        }
    }
}
