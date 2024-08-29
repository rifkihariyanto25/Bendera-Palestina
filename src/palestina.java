public class palestina {
    public static void main(String[] args) {

        System.out.println("\033[32m-------------------------PALESTINA-------------------------");

        for (int i = 1; i <= 10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("\u001B[31;1m* ");
            }

            if (i <= 6) {
                for (int l = 30; l > i; l--) {
                    System.out.print("\u001B[30m* ");
                }
            } else {
                for (int m = 30; m > i; m--) {
                    System.out.print("\u001B[37;1m* ");
                }
            }
            System.out.println();
        }

        for (int z = 1; z < 10; z++) {
            for (int j = z; j < 10; j++) {
                System.out.print("\u001B[31;1m* ");
            }

            if (z <= 3) {
                for (int t = 0; t < z + 20; t++) {
                    System.out.print("\u001B[37;1m* ");
                }
            } else {
                for (int t = 0; t < z + 20; t++) {
                    System.out.print("\u001B[32m* ");
                }
            }
            System.out.println();
        }
    }
}
