import java.util.*;
class strings{
public static void main(String args[]){
char[] helloArray={'h','e','l','l','o',','};
String helloString=new String(helloArray);
System.out.println(helloString);
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name: ");
String s=sc.nextLine();
String s1=sc.nextLine();
if(s.compareTo(s1)==0){
System.out.println(helloString.concat(s));
String hs=helloString.intern();
System.out.println(hs);
};


}
}