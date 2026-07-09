package Queue;

class QueueArray {
    int first = -1;
    int last = -1;
    int[] arr;
    int capacity;

    QueueArray(int size) {
        arr = new int[size];
        capacity = size;
    }

    void enqueue(int val) {
        if ((last + 1) % capacity == first) {
            System.out.println("Queue Full");
            return;
        }

        if (first == -1)
            first = 0;

        last = (last + 1) % capacity;
        arr[last] = val;
    }

    int dequeue() {
        if (first == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int val = arr[first];

        if (first == last)
            first = last = -1;
        else
            first = (first + 1) % capacity;

        return val;
    }
}