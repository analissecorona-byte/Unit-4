public class TimesTables {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int timesTable = (i * j);
                if (timesTable < 10) {
                    System.out.print(timesTable + "  ");
                } else {
                    System.out.print(timesTable + " ");

                }
            }
            System.out.println();
        }
    }
}
