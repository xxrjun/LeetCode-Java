public class E232_ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());

    }
    static class MyQueue{
        int[] q;
        int start, end;
        public MyQueue() {
            q = new int[100];
            start = 0;
            end = 0;
        }

        public void push(int x) {
            q[end++] = x;
        }

        public int pop() {
            return q[start++];
        }

        public int peek() {
            return q[start];
        }

        public boolean empty() {
            return start == end;
        }
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
