package com.tns.exception;

import java.io.IOException;

public class Example5 
{
	void myMethod(int num)throws IOException, ClassNotFoundException
	{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
	} 


  public static void main(String args[])
  { 
   try
   { 
	   Example5  obj=new Example5 (); 
        obj.myMethod(1); 
    }
    catch(Exception ex){
     System.out.println(ex);
    } 
  }
}
