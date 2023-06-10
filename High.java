import java.util.*;
class High {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0, i = 0, temp = 0, j = 0;
        int a[] = new int[x];
        for (i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.High(a);
        System.out.println(a[0] + "\n" + a[x - 1]);
        for (int y : a) {
            sum += y;
        }
        float avg = (float) sum / x;
        System.out.println(sum + "\n" + avg);
    }
}

