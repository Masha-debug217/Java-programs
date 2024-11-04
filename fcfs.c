/* First Come First Serve Scheduling
object (aim)
to write the program to implement CPU & schedulin algorithm for First serve scheduling
*/ 
#include <stdio.h>
int main()
{
    int i, n;
     i=0;
     double b;


    printf("Enter the number of processes you have:");
    scanf(" %d", n);

    /*while (n>i && n==i)
    {
        printf("Write the burst time for each process: P%d=", n);
        scanf("%d", b );
        i++;
    }*/
   for (i=0; i<=n; i++)
   {
    printf("Enter the burst time for your processes: P%d:/n", n);
    scanf(" %f", b);
   }
    
    

}