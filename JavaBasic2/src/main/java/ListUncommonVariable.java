import java.util.ArrayList;
import java.util.List;

/**
 * Created by onkar.mhantati on 4/25/2018.
 */
public class ListUncommonVariable {
    public static void main(String[] args) {
        int flag = 0;
        int flag2 = 0;
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(7);

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(2);
        list1.add(1);
        list1.add(4);
        list1.add(5);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int k = 0; k < list1.size(); k++) {
                    if (list.get(i) == list1.get(k)) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                list2.add(list.get(i));
            }
            flag = 0;
        }
        for (int p = 0; p < list1.size(); p++) {
            for (int q = p + 1; q < list1.size(); q++) {
                if (list1.get(p) == list1.get(q)) {
                    flag2 = 1;
                    break;
                }
            }
            if (flag2 == 0) {
                list2.add(list1.get(p));
            }
            flag2 = 0;
        }
        for (int i = 0; i < list2.size(); i++)
            System.out.println(list2.get(i));
    }
}
