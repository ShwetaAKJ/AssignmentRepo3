

public class InterfaceVariableType {
    public static void main(String[] args) {
        System.out.println(Testing.a); //interface variables are public, static , final.
       // Testing.a=10; ......it gives an error final value can not change.
    }
}
interface varpractices
{
    int a = 0;
}
class Testing implements varpractices
{


}