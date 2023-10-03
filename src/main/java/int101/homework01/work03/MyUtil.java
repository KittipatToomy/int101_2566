package int101.homework01.work03;

/**
 * MyUtil
 */
public class MyUtil {
    double height;
    double weight;

    public static double calculateBMI(double weight, double height) {
        return weight / (height*height);
    }

    public static double average(int v1, int v2, int v3) {
        return (v1 + v2 + v3)/3;
    }

}