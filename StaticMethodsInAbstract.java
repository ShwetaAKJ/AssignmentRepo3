public class StaticMethodsInAbstract {
    public static void main(String[] args) {

        AA.put();
        BB.put();
    }
}
abstract class AA
{
    public static void put()
    {
        System.out.println("Hi");
    }
}
class BB extends AA
{

}