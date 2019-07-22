/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int i,j,count=1;
		String str="aaabbccd";
		String b="";
		char[] a=str.toCharArray();
		for(i=0;i<a.length;i++) {
		    for(j=i+1;j<a.length;j++) {
		      if((a[i]==a[j]) && (a[j]!='1')) {
		          count++;
		          a[j]='1';
		       }
		    }
		    if(count>1) {
		    b=b+a[i]+count;
		    //count=1;
		}
		if(count==1 && a[i]!='1') {
		    b=b+a[i];
		}
		count=1;
		}
		System.out.print(b);
	}
}
