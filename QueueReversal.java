import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class QueueReversal {

    // Problem statement - 
    /*
     Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.
     */
    
   public Queue<Integer> rev(Queue<Integer> q){
        List<Integer> list = new ArrayList<>();
        
        int size = q.size();

        // Removing element from the queue
        for(int i = 0; i < size; i++){
            list.add(q.remove());
        }

        // Reverse of the queue
        for(int i = list.size() - 1; i >= 0; i--){
            q.add(list.get(i));
        }

        return q;
    }


}
