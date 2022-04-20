package com.tns.enum1;

public class Example5
{
  public enum Margin
  {
    TOP, RIGHT, BOTTOM, LEFT
  }

  public static void main(String[] args)
  {
    int count = 1;

    // loop through our enum
    for (Margin m: Margin.values())
    {
      System.out.printf("Margin %d = %s\n", count++, m);
    }
  }
}