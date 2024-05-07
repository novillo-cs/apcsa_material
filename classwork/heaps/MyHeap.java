import java.util.Arrays;

public class MyHeap {
    private int[] heap;
    private int size;
    private int maxsize;
    private boolean isMaxHeap;

    public MyHeap(int numElements, boolean isMax) {
        maxsize = numElements;
        size = 0;
        heap = new int[maxsize];
        isMaxHeap = isMax;
    }

    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    private void swap(int idx1, int idx2) {
        int temp = heap[idx1];
        heap[idx1] = heap[idx2];
        heap[idx2] = temp;
    }

    private void downHeapify(int pos) {
        int left = leftChild(pos);
        int right = rightChild(pos);
        int largest = pos;

        if (left < size && compare(heap[left], heap[largest])) {
            largest = left;
        }

        if (right < size && compare(heap[right], heap[largest])) {
            largest = right;
        }
        if (largest != pos) {
            swap(pos, largest);
            downHeapify(largest);
        }
    }

    private void heapifyUp(int pos) {
        int current = pos;
        while (current > 0 && compare(heap[current], heap[parent(current)])) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private boolean compare(int a, int b) {
        if (isMaxHeap) {
            return a > b;
        } 
        else {
            return a < b;
        }

    }

    public void insert(int element) {
        if (size >= maxsize) {
            System.out.println("Heap is full. Can't insert more elements.");
            return;
        }
        heap[size] = element;
        size++;
        heapifyUp(size - 1);
    }

    public void print() {
        int[] output = Arrays.copyOf(heap, size);
        System.out.println(Arrays.toString(output));
    }

    public int deleteRoot() {
        if (size == 0) {
            System.out.println("Heap is empty. Can't delete root.");
            return -1;
        }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        downHeapify(0);
        return root;
    }
}
