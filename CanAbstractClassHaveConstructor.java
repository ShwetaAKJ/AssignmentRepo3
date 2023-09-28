public class CanAbstractClassHaveConstructor {
    public static void main(String[] args) {
        BBBB b=new BBBB();
    }
}
abstract class AAAA
{
    AAAA()
    {
        System.out.println("Constructor AAAA");

    }
}
class BBBB extends AAAA
{
    BBBB()
    {
        System.out.println("Constructor BBBB");
    }
}