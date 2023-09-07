public class LuhnAlgorithm {
    public static void main(String[] args) {
       long num= 79927398713L;
        LuhnAlgorithm l1=new LuhnAlgorithm();
        l1.checkNumber(num);
    }
    public void checkNumber(long num)
    {
       long rem,rev=0,sum=0;
       int cnt=0;

        while(num!=0)
        {
            rem=num%10;
            if(cnt%2!=0)
            {
                    long sqcheck=rem*2;
                    if(sqcheck>9){
                        sqcheck=sqcheck-9;
                    }
                    sum=sum+sqcheck;

            }
            if(cnt%2==0)
            {
                    sum=sum+rem;
            }
            rev=rev*10+rem;
            num=num/10;
            cnt++;
        }
        System.out.println(sum);
        if(sum%10==0)
        {
            System.out.println("it is valid as per Luhn Algorithm");
        }
        else {
            System.out.println("it is not valid as per Luhn Algorithm");
        }
    }
}
