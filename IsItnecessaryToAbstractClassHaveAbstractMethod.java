public class IsItnecessaryToAbstractClassHaveAbstractMethod {
    public static void main(String[] args) {

        AAA.put();
        BBB.put();
    }
}
abstract class AAA
{
    //non abstract methods...
    public static void put()
    {
        System.out.println("Hi");
    }
}
class BBB extends AAA
{

}