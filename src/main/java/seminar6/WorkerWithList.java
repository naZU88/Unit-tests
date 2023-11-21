package seminar6;

import java.util.ArrayList;
import java.util.List;

public class WorkerWithList {

    public double averageValue(ArrayList<Integer> list){
        double sum = 0;
        double res = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        res = sum/list.size();
        return res;
    }

    public int compareTwoValues(ArrayList list1, ArrayList list2){
        double res1 = averageValue(list1);
        double res2 = averageValue(list2);
        if (res1 > res2) {
            System.out.println("Первый список имеет большее среднее значение");
            return 1;
        } else if (res1 < res2) {
            System.out.println("Второй список имеет большее среднее значение");
            return 2;
        }
        else {
            System.out.println("Средние значения равны");
            return 0;
        }
    }


}
