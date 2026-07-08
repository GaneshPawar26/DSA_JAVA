// package M2;

public class One {
    // jagged array

    public static void main(String args[]) {
        int a[][] = new int[3][];

        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[2];


        for (int n[] : a) {
            for (int k : n) {
                System.out.print(k);
            }
            System.out.println();
        }

    }

}
