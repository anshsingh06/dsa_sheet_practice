import java.util.Scanner;

class stack {

    int arr[];
    int minArr[];
    int size = -1;

    stack(int n) {
        arr = new int[n];
        minArr = new int[n];
    }

    void insert(int x) {

        if (size + 1 > arr.length - 1) {
            System.out.println("overflow");
            return;
        }

        size++;
        arr[size] = x;

        if (size == 0) {
            minArr[size] = x;
        } else {
            minArr[size] = Math.min(x, minArr[size - 1]);
        }
    }

    void peek() {

        if (size < 0) {
            return;
        }

        System.out.println(arr[size]);
    }

    void pop() {

        if (size < 0) {
            return;
        }

        size--;
    }

    void getMin() {

        if (size < 0) {
            return;
        }

        System.out.println(minArr[size]);
    }

    int size() {
        return size + 1;
    }
}

class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        stack A = new stack(n);

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("PUSH")) {

                int x = sc.nextInt();
                A.insert(x);
            }

            else if (operation.equals("POP")) {

                A.pop();
            }

            else if (operation.equals("TOP")) {

                A.peek();
            }

            else if (operation.equals("GETMIN")) {

                A.getMin();
            }
        }
    }
}
