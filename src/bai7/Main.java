package bai7;

import java.text.ParseException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws ParseException {
        Stack<Student> listStudentMale = new Stack<>();
        Stack<Student> listPersonFemale =new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số sinh viên muốn thêm");
        int inputNumber = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("nhập vào thông tin sinh viên " +(i+1));
            Student student=new Student();
            student.inputData(sc);
            if (student.isSex()==true){
                listStudentMale.push(student);

            }else {
                listPersonFemale.push(student);
            }

        }
        Collections.sort(listStudentMale);
        Collections.sort(listPersonFemale);
        System.out.println("danh sách học sinh nam");
        for (Student male:listStudentMale) {
            male.displaydata();
        }
        System.out.println("danh sách học sinh nữ");
        for (Student female:listPersonFemale) {
            female.displaydata();

        }



    }
}
