
public class Sum{
    public static void main(String[] args)
    {
        int x = 20;
        int y = 11;
        int sum = x+y;
        System.out.println(" The sum of " + x + " and " + y + " is :" + sum);

        int prd= x * y;
        System.out.println("the product of" + x + " and " + y + " is " + prd);

        float div= x / y;
        System.out.println("the Dividion of " + x + " and " + y + "is ;" + div);

        int  v2= y / x;
        System.out.println(v2);

        int v3 = x % y;
        System.out.println(v3);

        int exp= (x * y)/ (x+y) ;
        System.out.println(exp);

    }
}