import java.util.ArrayList;

import java.util.Collections;

import java.lang.Math;

public class Puzzling{
    public ArrayList<Integer> q1(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(2);
        list1.add(7);
        list1.add(9);
        list1.add(8);
        list1.add(13);
        list1.add(25);
        list1.add(32);

        int sum =0;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i =0; i <list1.size(); i++){
            sum+=list1.get(i);
            if(list1.get(i)> 10){
                list2.add(list1.get(i));
            }
        }
        System.out.println("SUM "+sum);
        return list2;
    }

    public ArrayList<String> q2(){
        ArrayList<String> list1 = new ArrayList<String>();
            list1.add("Nancy");
            list1.add("Jinichi");
            list1.add("Fujibayashi");
            list1.add("Momochi");
            list1.add("Ishikawa");

        Collections.shuffle(list1);
        
        ArrayList<String> list2 = new ArrayList<String>();
            for(int i = 0; i < list1.size(); i++){
                System.out.println(list1.get(i));
                if(list1.get(i).length()>5){
                    list2.add(list1.get(i));
                }
            }
        return list2;
    }

    public void q3(){
     ArrayList<Character> list1 = new ArrayList<Character>();
     list1.add('a');
     list1.add('b');
     list1.add('c');
     list1.add('d');
     list1.add('e');
     list1.add('f');
     list1.add('g');
     list1.add('h');
     list1.add('i');
     list1.add('j');
     list1.add('k');
     list1.add('l');
     list1.add('m');
     list1.add('n');
     list1.add('o');
     list1.add('p');
     list1.add('q');
     list1.add('r');
     list1.add('s');
     list1.add('t');
     list1.add('u');
     list1.add('v');
     list1.add('w');
     list1.add('x');
     list1.add('y');
     list1.add('z');

     Collections.shuffle(list1);
     System.out.println("LAST "+list1.get(list1.size()-1));
     System.out.println("FIRST "+list1.get(0));
     if(list1.get(0) == 'a' || list1.get(0) == 'e' || list1.get(0) == 'i' || list1.get(0) == 'o' ||list1.get(0) == 'u' || list1.get(0) == 'y'){
         System.out.println("Vowel");
     }
    }

    public ArrayList<Integer> q4(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list1.add((int)Math.floor(Math.random()*(46)+55));
        }
        return list1;
    }

    public ArrayList<Integer> q5(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list1.add((int)Math.floor(Math.random()*(46)+55));
        }
        Collections.sort(list1);
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.print("MIN "+list1.get(0));
        System.out.print("MAX "+list1.get(9));
        return list1;
    }

    public String q6(){
            ArrayList<Character> list1 = new ArrayList<Character>();
            list1.add('a');
            list1.add('b');
            list1.add('c');
            list1.add('d');
            list1.add('e');
            list1.add('f');
            list1.add('g');
            list1.add('h');
            list1.add('i');
            list1.add('j');
            list1.add('k');
            list1.add('l');
            list1.add('m');
            list1.add('n');
            list1.add('o');
            list1.add('p');
            list1.add('q');
            list1.add('r');
            list1.add('s');
            list1.add('t');
            list1.add('u');
            list1.add('v');
            list1.add('w');
            list1.add('x');
            list1.add('y');
            list1.add('z');

            String output = "";
           for(int i = 0; i < 5; i++){
               int random = (int)Math.floor(Math.random()*(25)+1);
               System.out.println(random);
               char x = list1.get(random);
                output+=x;
           } 
        return output;
    }

    public ArrayList<String> q7(){
        ArrayList<Character> list1 = new ArrayList<Character>();
        list1.add('a');
        list1.add('b');
        list1.add('c');
        list1.add('d');
        list1.add('e');
        list1.add('f');
        list1.add('g');
        list1.add('h');
        list1.add('i');
        list1.add('j');
        list1.add('k');
        list1.add('l');
        list1.add('m');
        list1.add('n');
        list1.add('o');
        list1.add('p');
        list1.add('q');
        list1.add('r');
        list1.add('s');
        list1.add('t');
        list1.add('u');
        list1.add('v');
        list1.add('w');
        list1.add('x');
        list1.add('y');
        list1.add('z');

        ArrayList<String> list2 = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            String output = "";
            for(int j = 0; j < 5; j++){
                int random = (int)Math.floor(Math.random()*(25)+1);
                char x = list1.get(random);
                output+=x;
            }
            list2.add(output);
        }
        return list2;
    }
}