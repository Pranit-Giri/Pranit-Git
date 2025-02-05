/**
 * SortingAlgo
 */
class SortingAlgo {

    public static void printarr(int N[]) {
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }
        System.out.println();

    }

    /*
     * public static void selectionsort(int N[]) {
     * for (int i = 0; i < N.length; i++) {
     * int x = i;
     * for (int j = i + 1; j < N.length; j++) {
     * if (N[j] < N[x]) {
     * x = j;
     * 
     * }
     * int temp = N[x];
     * N[x] = N[i];
     * N[i] = temp;
     * }
     * 
     * }
     * }
     */

    public static void bubblesort(int N[]) {
        for (int turn = 0; turn < N.length - 1; turn++) {
            boolean swappe = false;
            for (int j = 0; j < N.length - 1 - turn; j++) {
                if (N[j] > N[j + 1]) {
                    int temp = N[j];
                    N[j] = N[j + 1];
                    N[j + 1] = temp;
                    swappe = true;
                }

            }
            if (swappe == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int N[] = { 13, 46, 24, 52, 20, 9 };
        // selectionsort(N);
        printarr(N);
        bubblesort(N);
        printarr(N);

    }
}