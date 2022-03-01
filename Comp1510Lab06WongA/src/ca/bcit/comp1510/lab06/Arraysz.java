package ca.bcit.comp1510.lab06;

import java.util.ArrayList;

public class Arraysz {

    public static void main(String args[]){  
        ArrayList<String> alist=new ArrayList<String>();  
        alist.add("Steve");
        alist.add("Tim");
        alist.add(1 ,"Lucy");
        alist.add(1 ,"Pat");
        alist.add("Angela");
        alist.add("Tom");
    
        //displaying elements
        System.out.println(alist);
    
        //Adding "Steve" at the fourth position
        alist.add(3, "Steve");
    
        //displaying elements
        System.out.println(alist);
     }  
  }