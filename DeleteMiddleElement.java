import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeleteMiddleElement {

  // Problem statement -
  /* Given a stack, delete the middle element of the stack without using any additional data structure.
Middle element:- ceil((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

Note: The output shown by the compiler is the stack from top to bottom.*/

  public static void deleteMid(Stack<Integer> s, int sizeOfStack) {
    
    double mid = Math.ceil((sizeOfStack + 1) / 2);
    int i = sizeOfStack;

    List<Integer> list = new ArrayList<>();

    while (i >= mid) {
      list.add(s.pop());
      i--;
    }
    
    // remove middle element
    list.remove(list.size() - 1);

    // push element to the stack
    for (int j = list.size() - 1; j >= 0; j--) {
      s.push(list.get(j));
    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);

    deleteMid(s, s.size());

    System.out.println(s);
  }
}
