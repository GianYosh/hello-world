//I created this program to practice with a couple of the math methods already present in java.
//I forgot all the math though :)

public class Mathemat {

    public static void main(String[] args) {
        double root = Math.sqrt(17.0);
        //double angle = 1.5;
        double degree = 90;
        double angle = degree / 180.0 * Math.PI;
        double height = Math.sin(angle);
        
        System.out.printf("%.2f\n", root);
        System.out.println(angle);
        System.out.printf("%.4f\n",height);
        
        long x = Math.round(24.0 / 5.0);
        System.out.println(x);
        
        double y = Math.pow(2.0, 10.0);
        System.out.println(y);
    }
}