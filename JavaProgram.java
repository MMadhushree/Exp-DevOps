 public class JavaProgram
 {
 public static void main(String args[])
  {
    int i, j, num;
    for(i=1; i<=5; i++)
    {
        num=1;
        for(j=1; j<=i; j++)
        {
            System.out.print(num+ " ");
            num++;
        }
        System.out.println();
    }
}}
