import java.util.*;
public class stackoperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Kiran");
        stack.push("Teja");
        stack.push("Mani");
        // System.out.println(stack.pop());

                for (int i=0;i<1;i++){
                    stack.push("Lord Rohith");
                }

        System.out.println(stack.peek());
        
        System.out.println(stack.search("Teja"));   // if we search any object which is not available in stack it will return -1 and same happens when we pop a item and try to search it.

        System.out.println(stack);
    }
}