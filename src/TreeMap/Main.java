package TreeMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        khời tạo 1 đối tượng từ Map interface và lớp HastMap;
        Map<Integer,String> mapStudent = new HashMap<>();
        //boolean isEmpty(): kiểm tra xem map co phan tu hay ko?
        System.out.println("mảng có phẩn tử hay ko");
        //V put (key,value) : thêm 1 entry vào trong Map
        mapStudent.put(1,"nguyễn văn a");
        mapStudent.put(2,"nguyễn văn c");
        mapStudent.put(3,"nguyễn văn d");
        String v1 = mapStudent.put(1,"nguyễn văn b");
        System.out.println("giá trị trả ra của phường thức put : " +v1);
        System.out.println(" giá trị các entry trong mapStudent là ");
        //voi clear() xóa các entry trong map
//        mapStudent.clear();

//        boolean containsKey(K key)
        System.out.print("kiểm tra key =1 có trong mapStudent ko"+ mapStudent.containsKey(1));
//        boolean containsValue(V value)
        //Set<K> keySet() : lấy ra sét các ki trong map
        for (Integer key: mapStudent.keySet()) {
            System.out.printf("%d-%s\n",key,mapStudent.get(key));

        }

    }
}
