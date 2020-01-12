/*
Problem

Complete the function solveMeFirst to compute the sum of two integers.

Function prototype:

int solveMeFirst(int a, int b);

where,

a is the first integer input.
b is the second integer input
Return values

sum of the above two integers
Sample Input

a = 2
b = 3
Sample Output

5
Explanation

The sum of the two integers  and  is computed as: .*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
      	return a+b;

   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
