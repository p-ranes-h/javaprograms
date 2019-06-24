import java.util.Scanner;
public class name {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String str=s.nextLine();
 int i,count=1;
 for( i=0;i<str.length()-1;i++) {
	
	if(str.charAt(i)==str.charAt(i+1)) {
		count++;
	
	}
	else 
	{
	System.out.print(""+count+""+str.charAt(i)+" ");
	count=1;
	}
	
 }
System.out.print(""+count+""+str.charAt(i)+" ");


}
} 