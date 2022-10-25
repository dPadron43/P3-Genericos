import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Stack.add(list, "Hola");
        Stack.add(list, "Mundo");
        Stack.add(list, "!");
        System.out.println(Stack.toString(list));

        if(Stack.isEmpty(list)) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }

        System.out.println(Stack.getFirst(list));
        System.out.println(Stack.removeFirst(list));
        System.out.println(Stack.toString(list));


    }


}