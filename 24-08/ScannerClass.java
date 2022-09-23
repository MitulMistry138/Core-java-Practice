import java.util.Scanner;

class ScannerClass
{
public static void main(String ...args)
{
 String str="I MMitul,afa,kliafa,kk";
 Scanner sc = new Scanner(str);
 
 while(sc.hasNext())
 {
 System.out.println(sc.next());
 }
 }
 }