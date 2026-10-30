public class Equations {
    public static void main(String[] args) {
        int solutions = 0;
        int x = 0;
        while (solutions < 2) {
            if (((x - 3) * (x - 8) / (x - 6.0)) == 2) {
                System.out.println(x);
                solutions++;
                x++;
            } else
                x++;
        }

    }
}
