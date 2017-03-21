import java.util.*;

/**
 * Задание
 * 1. Реализовать удаление дубликатов в списке.
 */
public class Sol {
    public List<Object> getList() {
        return list;
    }

    private List<Object> list = new ArrayList<>();

    public void initialize(Object ... data) {
        List<Object> objects = Arrays.asList(data);
        for(Object o : objects){
            list.add(o);
        }
    }

    public void printList(){
        this.list.forEach(System.out::println);
    }

    public static void main(String[] args) {
    Sol sol = new Sol();
        sol.initialize("q", "w", 2, 3, 4, 2, 3, 4, 1, "q", "x", "q", 6, 4, 1, "w");
        Set<Object> set = new HashSet<>(sol.getList());
        sol.getList().clear();
        sol.getList().addAll(set);
        sol.printList();
    }
}

