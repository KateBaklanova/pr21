import java.util.List;
import java.util.*;

public class n2 {

    public List<?> lst;

    n2(List<?> lst) {
        this.lst = lst;
    }


    public void printList() {
        for (Object o : lst) System.out.println(o);
    }

    public Object printIndex(int i) {
        return lst.get(i);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, -1);
        n2 lst = new n2(integers);
        lst.printList();

        List<String> strings = Arrays.asList("Java", "Scala", "Groovy");
        lst = new n2(strings);
        lst.printList();

        List<Number> doubles = Arrays.asList(1.1, 0, 2.31);
        lst = new n2(doubles);
        lst.printList();

        System.out.println(lst.printIndex(1));
    }
}
