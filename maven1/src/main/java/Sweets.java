public class Sweets
{
    int nos;
    float weight;
    public void tot1(int nos,float weight)
    {
        float tot=(nos*weight);
        System.out.println(tot);
    }
}
class Laddu extends Sweets {
    public void printfun() {


        System.out.println("Laddu");
    }
}
class Halwa extends Sweets
{
    public void printfun()
    {
        System.out.println("Halwa");
    }
}