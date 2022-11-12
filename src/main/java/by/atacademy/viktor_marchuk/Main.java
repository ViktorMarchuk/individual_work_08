package by.atacademy.viktor_marchuk;

public class Main{
    public static void main(String[] args){
        String text = "Prepared by experienced English teachers, the texts," +
                " articles and conversations are brief and appropriate to your level of proficiency. ";
        System.out.println("The word(s) with max length");
        findMaxWord(text);
        System.out.println();
        System.out.println("The word(s) with min length");
        findMinWord(text);
    }

    public static void findMaxWord(String text){
        String[] words = text.split(" ");
        String wordMaxLength = words[0];
        for(String s: words){
            if(wordMaxLength.length() < s.length()){
                wordMaxLength = s;
            }
        }
        for(String s: words){
            if(wordMaxLength.length() == s.length()){
                System.out.print(s + " ");
            }
        }
    }

    public static void findMinWord(String text){
        String[] words = text.split(" ");
        String wordMinLength = words[0];
        for(String s: words){
            if(wordMinLength.length() > s.length()){
                wordMinLength = s;
            }
        }
        for(String s: words){
            if(wordMinLength.length() == s.length()){
                System.out.print(s + " ");
            }
        }
    }
}
/*
The word(s) with max length
conversations
The word(s) with min length
by to of
 */