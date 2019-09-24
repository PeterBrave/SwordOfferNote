package QueueWithTwoStacks;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kavin
 * @date 2019-09-24 10:23
 */
public class TwoQueue2Stack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int node) {
        if (queue1.isEmpty()) {
            queue2.offer(node);
        } else {
            queue1.offer(node);
        }
    }

    public int pop() {
        if (!queue1.isEmpty()||!queue2.isEmpty()){
            if (queue1.isEmpty()) {
                for (int i=0; i<queue2.size()-1; i++) {
                    queue1.offer(queue2.poll());
                }
                return queue2.poll();
            } else {
                for (int i=0; i<queue1.size()-1; i++) {
                    queue2.offer(queue1.poll());
                }
                return queue1.poll();
            }
        } else {
            return -1;
        }
    }
}
