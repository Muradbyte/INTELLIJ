public class TCode {
    public static void main(String[] args) {
        int x = 7;
        int z = 8;
        for (int g = 1; g <= x; g++) {
            for (int h = 1; h <= z; h++) {
                if (g == 1 | h == z / 2) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}













