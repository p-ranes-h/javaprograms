import java.util.*;
public class microsoft {
public static void main (String [] args ) {

String [] arr = {"quick", "brown", "the", "fox"};
String str = "thequickbrownfox";
int a,b=0,count=0;
for(;count<arr.length;)
{
   for(int i=0;i<arr.length;i++)
   {
    a =b+arr[i].length();
    String temp = str.substring(b,a);
    if(arr[i].equals(temp))
    {
      b=a;
      System.out.print(arr[i]+" ");
      count++;
    }
   }
}

}
}