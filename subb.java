import java.util.Scanner;
public class subb {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String[] s1={"dog", "deer", "dealdog"};
String s2=s.nextLine();
for(int i=0;i<s1.length;i++) {
if(s1[i].substring(0,s2.length()).equals(s2)) {
System.out.println(s1[i]);
}
}
}
}