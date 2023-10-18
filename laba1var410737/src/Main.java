import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 18; i>=2; i = i-1){
            if (i%2 == 0){
                c.add(i);
            }
        }

        float[] x = new float[11];
        for (int i = 0; i < 11; i++) {
            x[i] = (-4 * (float) Math.random()) + (4 * (float) Math.random());
        }

        ArrayList<Integer> checkin = new ArrayList<>();
        checkin.add(4);
        checkin.add(6);
        checkin.add(8);
        checkin.add(12);


        double[][] list3 = new double[9][11];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 11; j++) {
                if (c.get(i) == 18) {
                    list3[i][j] = Math.asin(Math.sin(Math.log(5 / (Math.abs(x[j])))));
                } else if (checkin.contains(c.get(i))) {
                    list3[i][j] = Math.atan((1 / (Math.pow(Math.pow(Math.E, Math.pow(Math.abs(x[j]), 0.5) / (3 + Math.pow(Math.cos(x[j]), 2))), Math.log(Math.acos(x[j] / 8))))));
                } else {
                    list3[i][j] = Math.pow(Math.sin(Math.pow((1 / 3.0) / (Math.pow((x[j] / 2), 2) - 1), 2)), (1 / 3.0));
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %2.4f ", list3[i][j]);
            }
            System.out.print("\n");
        }
    }
}