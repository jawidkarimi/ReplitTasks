package StringMethods;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        word=word.trim();
        int len=word.length();

        boolean Start=word.startsWith(""+'x')||word.startsWith(""+'X');
        boolean End=word.endsWith(""+'x')||word.endsWith(""+'X');
        String result=word;
        if(Start||End){
            if (Start&&End){
                result=result.substring(1,(len-1));
            }

            else if(Start){
                result=result.substring(1);
            }else {
                result=result.substring(0,result.length()-1);
            }


            System.out.println(result);

        }else{
            System.out.println(word);
        }


    }
}