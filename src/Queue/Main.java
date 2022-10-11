package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //khoi tao doi tuong myqueue tu interface quêu và class priorityqueue
        Queue<String> myQueue=new PriorityQueue<>();
        //offer (Element E): thêm 1 phan tu vao hang đợi; và sẽ được sắp xếp theo mã ưu tiên . theo thứ tự alphaB;
        myQueue.offer("Thanh Tuấn");
        myQueue.offer("THÀNH TRUNG");
        myQueue.offer("NGỌC MAI");
        myQueue.offer("CHÍ THANH");

        //poll lấy phần tử đầu tiên và xóa phẩn tử  của queue, nêu không có phần tử trả về null;
        System.out.println("lấy phần tử đầu tiên cua myQueue vơi poll");
        System.out.println(myQueue.poll());

        //remove() lấy phần tử đầu tiên và xóa phần tử của queue nếu ko có phần tử thì trả về exception
        System.out.println("thực hiên xóa phần tử của quêeue");
        System.out.println(myQueue.remove());

        //peek()
        System.out.println("lấy phần tửi với peek");

        //in ra các phần tử
        System.out.println("các phần tử của myQueue");
        for (String str:myQueue) {
            System.out.println(str);

        }
    }
}
