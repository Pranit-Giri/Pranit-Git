import java.util.*;

class Reverse {
    public static void reverses(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;

        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverses(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
    }
}
