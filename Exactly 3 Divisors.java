//Exactly 3 Divisors 
//Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

//Naive Solution - count no. of divisors of each and every no. less than N. Those nos. whose divisors = 3, print them

class Divisors
{
    
    public int exactly3Divisors(int N)
    {
                int count=0;
                for(int i=1;i<=N;i++)
                {
                    int j=i;
                    int c=0;
                    for(int k=1;k*k<=j;k++)
                    {
                        if(j%k==0)
                        {
                            c++;
                            if(k!=j/k)
                                c++;
                        }
                    }
                    if(c==3)
                        count++;
                }
                return count;
                }
}

//Efficient Sol. - Only perfect squares will have divisors = 3.
class Divisors
{
    
    public int exactly3Divisors(int N)
    {
        //Your code here
        int count=0;
        for(int i=2;i*i<=N;i++)
        {
            if(isPrime(i))
                count++;
        }
        return count;
    }
    
    public static boolean isPrime(int n)
    {
        for(int j=2;j*j<=n;j++)
        {
            if(n%j == 0)
                return false;
        }
        return true;
    }
}
