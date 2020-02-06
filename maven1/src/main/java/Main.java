public class Main {
    public static void main(String args[]) {


        Sweets s = new Sweets();
        Candies c = new Candies();
        Chocolates ch = new Chocolates();
        float arr[] = {(float) 0.1, (float) 0.1, (float) 0.0, (float) 0.0, (float) 0.5, (float) 0.1, (float) 0.1, (float) 0.0, (float) 0.5, (float) 0.1, (float) 0.5, (float) 0.0, (float) 0.0};
        float q[] = {(float) 2.52, (float) 1.58, (float) 4.36, (float) 9.12, (float) 3.15, (float) 0.25};
        s.tot1(20, 15);
        c.sort1(q);
        float m= (float) 0.0;
        float x= (float) 0.1;
        float u= (float) 0.5;
        ch.finds(arr,m);
        ch.finds(arr,x);
        ch.finds(arr,u);

    }
}