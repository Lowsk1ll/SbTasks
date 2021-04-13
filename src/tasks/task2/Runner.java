package tasks.task2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int width = in.nextInt();
        String word = in.next();
        System.out.println(createFrame(length,width,word));


    }
    public static String createFrame(int length,int width,String word){
        if(length<3){
            return "Ошибка";
        }
        if(width-2<word.length()){
            return "Ошибка";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <=length; i++) {
            for (int j = 0; j <width; j++) {
                if(i==1 | i==length | j==0 | j==(width-1)){
                    result.append("*");
                    if(j==(width-1)){
                        result.append("\n");
                    }
                    continue;
                }
                if(i==((length+1)/2) & j==(width-word.length())/2){
                    result.append(word);
                    j+=(word.length()-1);
                }
                else {
                    result.append(" ");
                }

            }
        }
        return new String(result);
    }
}
