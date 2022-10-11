package bai7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String name;
    private boolean sex;
    private Date date;

    public Student() {
    }

    public Student(String studentName, boolean sex, Date date) {
        this.name = studentName;
        this.sex = sex;
        this.date = date;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String studentName) {
        this.name = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void inputData(Scanner sc) throws ParseException{
        System.out.println("nhập vào tên sinh viên");
        this.name =sc.nextLine();
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("nhập vào năm sinh");
        this.date=date.parse(sc.nextLine());
        System.out.println("nhập giới tính");
        this.sex=Boolean.parseBoolean(sc.nextLine());
    }
    public void displaydata(){
        System.out.printf("Tên :%-20s giới tính:%-10b Năm Sinh %tc\n",this.name,this.sex,this.date);
    }
    @Override
    public int compareTo(Student o) {
        return this.getDate().compareTo(o.getDate());
    }
}
