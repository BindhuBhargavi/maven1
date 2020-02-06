import java.util.Arrays;
public class Candies {

    public void sort1(float[] a)
    {
        Arrays.sort(a);

        System.out.printf("Modified arr[] : %s/n",
                Arrays.toString(a));


    }

}
class jellys extends Candies
{
    public void printfun()
    {
        System.out.println("jellys");
    }
}

