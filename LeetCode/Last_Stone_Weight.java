package kunalwstDSA.leetCode;
import java.util.PriorityQueue;
public class Last_Stone_Weight {
    public static void main(String[] args) {

        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));

    }
    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int stone : stones) {
            pq.offer(stone);
        }

        while(pq.size() > 1) {
            pq.offer(pq.poll() - pq.poll());
        }

        return pq.poll();
    }
}
