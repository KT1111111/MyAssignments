
public class Karma {

    public static void main(String []arg){

       k karo = new k();
       int outcome = karo.CompareNum();
        System.out.println(" greater value " + outcome);

        Laundromat Karma = new Laundromat();
        Karma.pantPrice ();
        Karma.shirtPrice();
    }
}
class Laundromat {
    void pantPrice ()
    {
        System.out.println(" 10 dollars to clean pant");
    }
    void shirtPrice ()
    {
        System.out.println("15 dollars to clean shirt");
}
}
class k{
    public int CompareNum()
    {
        int x = 3;
        int y = 8;
       int sum = x+y;
       return sum;

    }
}