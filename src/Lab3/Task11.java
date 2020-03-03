package Lab3;

public class Task11 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print("   ");
            for(int j = 0; j < i + 1; j++)
                System.out.print(" * ");
            System.out.println("");
        }
    }
}
