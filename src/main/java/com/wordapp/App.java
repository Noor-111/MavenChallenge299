package com.wordapp;
import com.google.common.base.Strings;//com.google.common.base.Strings;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      String word = args[0];
      if (!Strings.isNullOrEmpty(word)) {
        System.out.println("Welcome to Maven with Shade plugin," + word);
    }
    }
}
