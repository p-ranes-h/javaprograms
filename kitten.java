import java.util.Scanner;
public class kitten {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int c=0,i;
String a= s.nextLine();
String b=s.nextLine();

int len=(a.length()>b.length())?a.length():b.length();
int len1=(a.length()<b.length())?a.length():b.length();

for(i=0;i<len1;i++) {
if(a.charAt(i)==(b.charAt(i))) {
c++;
}
}
System.out.print(""+(len-c));
}
}