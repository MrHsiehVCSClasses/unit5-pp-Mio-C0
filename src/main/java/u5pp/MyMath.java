package u5pp;

public class MyMath
{
    static int abs(int x)
    {
        if (x < 0) 
        {
            return 0-x;
        }
        return x;
    }
    static double abs(double x) 
    {
        if (x < 0.0) 
        {
            return 0.0-x;
        }
        return x;
    }

    static double pow(double base, int exponent) 
    {
        double total = 1.0;

        for(int i = 0; i < exponent; i++) 
        {
            total *= base;
        }
        return total;
    }
    static int perfectSqrt(int x) 
    {
        if(x == 0) 
        {
            return 0;
        }
        if (x < 0) 
        {
            return -1;
        }
        for(int i = 0; i < x; i++) 
        {
            if (i * i > x) 
            {
                return -1;
            }
            if (i * i == x) 
            {
                return i;
            }
        }
        return -1;
    }
}