import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("red");
        list.add("green");
        list.add("black");
        list.add("white");
        list.add("pink");
        
        list.set(1, "yellow");
        
        System.out.println(list);
    }
}
