import java.util.*;
public class Matrix7 {
public static void main (String [] args ) {
Scanner s = new Scanner (System.in);
int n = 6;
int count=0;
int arr[][] = new int [n][n];

for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
   {
     arr[i][j]=(i+1)*(j+1);
    }
}

int a = 8;

for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
   {
    if(a==arr[i][j])
     count++;
    }
}
System.out.println(count+" "+a+"'s in the table");
}
}