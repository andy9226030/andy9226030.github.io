package Interface;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class studetns implements stuinterface {
    Scanner sc = new Scanner(System.in);

    @Override
    public void add(ArrayList<stuobject> arrayList) {
        try {
            System.out.println("!!!!!!!請輸入名字!!!!!!!");
            String name = sc.next();
            System.out.println("!!!!!!!請輸入年紀!!!!!!!");
            int age = sc.nextInt();
            System.out.println("!!!!!!!請輸入性別!!!!!!!" + "(男生true,女生為false)");
            boolean sex = sc.nextBoolean();
            System.out.println("!!!!!!!請輸入班級!!!!!!!");
            String classs = sc.next();
            stuobject stuobject = new stuobject(name, age, sex, classs);
            arrayList.add(stuobject);
            if (!arrayList.isEmpty()) {
                System.out.println("!!!!!!!以存入!!!!!!!");
            } else {
                System.out.println("!!!!!!!空的!!!!!!!");
            }
        } catch (InputMismatchException e) {
            System.out.println("!!!!!!!輸入有誤!!!!!!!" + e.getLocalizedMessage());
            String romdin = sc.nextLine();
            add(arrayList);
        }
    }

    @Override
    public void remove(ArrayList<stuobject> arrayList) {

        if (arrayList.isEmpty()) {
            System.out.println("!!!!!!!跟你的腦袋一樣!!!!!!!");
        } else {
            try {
                Scanner scanner = new Scanner(System.in);
                get(arrayList);
                System.out.println("!!!!!!!請輸入!!!!!!!");
                int index = scanner.nextInt();
                arrayList.remove(index);
                System.out.println("!!!!!!!刪除成功!!!!!!!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("!!!!!!!角界月線!!!!!!!");
//                String index = sc.next();
                remove(arrayList);
            }
        }
    }

    @Override
    public void set(ArrayList<stuobject> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("!!!!!!!跟你的腦袋一樣!!!!!!!");
        } else {
            get(arrayList);
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("!!!!!!!請輸入index!!!!!!!");
                Integer ssc = sc.nextInt();
                System.out.println("!!!!!!!請輸入名稱!!!!!!!");
                String name = sc.next();
                System.out.println("!!!!!!!請輸入年紀!!!!!!!" + "\n");
                Integer age = sc.nextInt();
                System.out.println("!!!!!!!請輸入性別!!!!!!!" + "(男生true,女生為false)");
                boolean sex = sc.nextBoolean();
                System.out.println("!!!!!!!請輸入班級!!!!!!!");
                String classs = sc.next();
                stuobject stuobject = new stuobject(name, age, sex, classs);
                arrayList.set(ssc, stuobject);
                System.out.println("!!!!!!!修改成功!!!!!!!");
            } catch (InputMismatchException e) {
                System.out.println("!!!!!!!輸入有誤!!!!!!!" + e.getLocalizedMessage());
                set(arrayList);
            }
        }
    }

    @Override
    public void get(ArrayList<stuobject> arrayList) {
        System.out.println("!!!!!!!學生查詢!!!!!!!");
        if (arrayList.isEmpty()) {
            System.out.println("!!!!!!!跟你的腦袋一樣空!!!!!!!");
        } else {
            System.out.println("姓名" + "\t\t" + "年紀" + "\t\t" + "性別" + "\t\t" + "班級");
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}