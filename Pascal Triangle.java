//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        
        if(numRows==0)  //if number of rows required is 0, then return empty list
            return li;
        
        li.add(new ArrayList<>());
        li.get(0).add(1);  //since first row is always 1
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevrow = li.get(i-1);
            
            row.add(1); //since first element of each row is 1
            
            for(int j=1;j<i;j++)
            {
                row.add(prevrow.get(j-1)+prevrow.get(j));
            }
            
            row.add(1); //since last element of each row is 1
            
            li.add(row);
        }
        
        return li;
        
    }
}


/* Combinatorics method to find pascal's triangle
This method only prints the pattern - does not uses any array or list to store the values of each row as the first method does.

class Main
{
    static int fact(int n)
    {
        if(n==0)
            return 1;
        return fact(n) * fact(n-1);    
    }
    static int ncr (int n,int r)
    {
        return fact(n)/fact(r) * fact(n-r);
    }

    for(int i=0;i<numRows;i++)
    {
        for(int j=0;j<(numRows-i);j++)
        {
            System.out.print(" ");
        }
    
    for(int j=0;j<=i;j++)
    {
        System.out.print(" "+ncr(i,j));
    }
}
    System.out.println();
}
*/