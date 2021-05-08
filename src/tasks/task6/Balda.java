package tasks.task6;

import java.util.*;

public class Balda {
    static Scanner in;
    static String[] playerWords = new String[2];
    static boolean condition = true;
    static boolean startFromSecond = false;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        String word = in.nextLine();
        Map<String,Integer> allWords = new HashMap<>();
        while (condition){
            if(!(startFromSecond)) {
                if (!(playerTurn(word, allWords, 1))) {
                    continue;
                }
            }
            if(!(playerTurn(word,allWords,2))){
                startFromSecond=true;
                continue;
            }
            if(playerWords[0].isEmpty()& playerWords[1].isEmpty()){
                printResults(allWords,1);
                printResults(allWords,2);
                condition=false;
            }
        }
    }
    public static boolean checkLetters(String playerWord, String globalWord){
        for (int i = 0; i <playerWord.length(); i++) {
            if(!(globalWord.contains(String.valueOf(playerWord.charAt(i))))){
                System.out.println("Буквы "+playerWord.charAt(i)+" нет в слове "+ globalWord);
                return false;
            }
        }
        return true;
    }
    public static boolean playerTurn(String globalWord,Map<String,Integer>allWords,int playerNumber){
        System.out.println("Ход "+playerNumber+" игрока");
        String playerWord = in.nextLine().trim();
        if(!(playerWord.isEmpty())){
            if(!(checkLetters(playerWord,globalWord))){
                return false;
            }
            if(allWords.containsKey(playerWord)){
                System.out.println("Такое слово уже есть");
                return false;
            }
            allWords.put(playerWord,playerNumber);
        }
        if(playerNumber==2){
            startFromSecond=false;
        }
        playerWords[playerNumber-1]=playerWord;
        return true;
    }
    public static void printResults(Map<String,Integer>allWords,int playerNumber){
        System.out.println("Результат игрока "+playerNumber+" следующие слова =>");
        int currentPlayerResult=0;
        for (Map.Entry<String,Integer> turns:allWords.entrySet()) {
            if(turns.getValue()==playerNumber){
                currentPlayerResult++;
                System.out.print(turns.getKey()+" ");
            }
        }
        System.out.println("количество очков игрока "+ playerNumber+"="+currentPlayerResult);
    }
}