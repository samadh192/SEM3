import java.util.*;
import java.io.*;
class array{
  public static<T> void printarray(T[] arr)
  {
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i].toString()+" ");
  }
  public static void main(String args[]){
    String A[]={"Hustle","Loyalty","Respect"};
    Integer k[]={1,6,0,9};
    printarray(A);
    printarray(k);
  }
}
