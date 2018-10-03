import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] x = new int[10];
        int max = 10;
        int min = 1;
        //Random random = new Random();
        for (int i = 0;i < x.length;i++){
//            x[i] = (int) (Math.random() * (max - min + 1) + min);
//            System.out.println(x[i]);
            int t = 0;
            pick:
            while (t == 0){
                t = (int)(Math.random()*max + min);

                for (int j = 0;j < i;j++){
                    if (x[j] == t){
                        t = 0;
                        continue pick;
                    }
                }
                x[i] = t;
                System.out.println(x[i]-1);
            }
        }
    }
}
