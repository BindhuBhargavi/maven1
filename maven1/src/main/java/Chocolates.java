
public class Chocolates {
    int count;

    public void finds(float[] st, float m) {
        count = 0;
        for (int i = 0; i < st.length; i++) {
            if (st[i] == m) {
                count++;
            }
        }
        System.out.println("\nNumber of Occurrence of the Element:" + count);

    }
}
class fuze extends Chocolates
{
    public void printfun()
    {
        System.out.println("fuze");
    }
}
