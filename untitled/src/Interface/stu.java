package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class stu {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        studetns studetns = new studetns();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" 1:增加學生資料 ");
            System.out.println(" 2:刪除學生資料 ");
            System.out.println(" 3:修改學生資料 ");
            System.out.println(" 4:獲得學生資料 ");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("!!!!!!!增加學生資料!!!!!!!");
                    studetns.add(arrayList);
                    break;
                case "2":
                    System.out.println("!!!!!!!刪除學生資料!!!!!!!");
                    studetns.remove(arrayList);
                    break;
                case "3":
                    System.out.println("!!!!!!!修改學生資料!!!!!!!");
                    studetns.set(arrayList);
                    break;
                case "4":
                    System.out.println("!!!!!!!查詢學生資料!!!!!!!");
                    studetns.get(arrayList);
                    break;
            }
        }
    }
}
