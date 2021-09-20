import java.util.Scanner;
public class {

public static void main(String[] args){
  Scanner str = new Scanner(System.in);
  
  System.out.println("Enter string : ");
  String name = str.nextLine();
  
  System.out.println("Enter string is : "+name);
  count(name);
   }
   public static void count(String x){
   char ch = x.tocharArray();
   int letter = 0;
   int space = 0;
   int num = 0;
   int other =0;
   
   for(int i=0;i<x.length();i++){
   if(Charcter.isLetter(ch[i])){
   letter++;
   }
   else if(Charcter.isSpaceChar(ch[i])){
   space++;
   }
   else if(Charcter.isDigit(ch[i])){
   num++;
   }
   
   else {
   other++;
   }
   
   }
 //  System.out.println("Letter : "+letter);
 //  System.out.println("Number : "+num);
 //  System.out.println("Space : "+space);
 //  System.out.println("Other : "+other);
   
   
  }   
}