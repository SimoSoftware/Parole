import java.util.*;

public class Parole{

	public static void lettere(String a, int n){
		StringBuffer str = new StringBuffer(a);
		int b = a.length();
		if(a.length()<3 && n<26 && n!=0){
			str = new StringBuffer(a);
			str.setCharAt(b-1, (char)(str.charAt(b-1)+n));
			System.out.println(str);
			lettere(str.toString(), n+1);
		}else if(n == 0){
			str.append("a");
			System.out.println(str.toString());
			lettere(str.toString(), n+1);
		}else if(n==26){
			lettere(a.toString(), 0);
		}
	}
	public static void main(String[] args){
		lettere("a", 0);
	}
}
