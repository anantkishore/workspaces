public class HRACalculator {


    public static void main(String[] args) {


        int x =100000;

        double second = 0.0;
        double third = 0.0;

        double max = -1;

        int maxBasic = x;

        for(int i  = 100000; i < 500000; i++)
        {
            second = 216000-(0.1*i);
            third = 0.4*i;

            double tempMax = getMin(second, third);

            if(tempMax > max) {
                max = tempMax;
                maxBasic = i;
            }
        }

        System.out.println(maxBasic);
        System.out.print("Max HRA: " + max);

    }

    public static double  getMin(double a, double b)
    {
        return a < b ? a : b;
    }
}
