public class tabularr {

    public void maTh() {
        double a = 1.0;
        double b = 2.0;

        double c = 1.0;
        double d = 3.0;

        double e = 1.0;
        double f = 4.0;
        for(int i=1; i<=5; i++){
            System.out.print(i);
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print(" ");
                }
                double data = Math.pow(a, b);
                int value = (int)data;
                System.out.print(value);
                a++;
            }
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print(" ");
                }
                double data = Math.pow(c, d);
                int value = (int)data;
                System.out.print(value);
                c++;
            }
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print(" ");
                }
                double data = Math.pow(e, f);
                int value = (int)data;
                System.out.print(value);
                e++;
            }
            System.out.println(" ");
        }
    }
}
