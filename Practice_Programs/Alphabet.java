//Write a JAVA program to check whether a character is alphabet or not.

import java.util.*;

class Alphabet
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character");
      char ch=sc.next().charAt(0);
      if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
        System.out.println(ch+" is an alphabet");
      else
        System.out.println(ch+" is not an alphabet");
    }
  }