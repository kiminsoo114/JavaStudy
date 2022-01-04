package com.sist.main;

import java.util.Collections;
import java.util.Arrays;

public class MainClass5 {

      public static void main(String[] args) {
         Integer arr[] = {4,23,33,15,17,19};
         Arrays.sort(arr,Collections.reverseOrder(null));
         
         for(int i:arr) {
            System.out.print("["+i+"]");
         }
      }
}