import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String input=s.nextLine();
        int vowels=0,consonants=0,digits=0,spch=0;
        String vowelSet="aeiouAEIOU";

        for(char c:input.toCharArray()){
            if(Character.isLetter(c)){
                if(vowelSet.indexOf(c)!=-1){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else if(Character.isDigit(c)){
                digits++;
            }
            else{
                spch++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
        System.out.println("Digits:"+digits);
        System.out.println("SpecialCharacter:"+spch);

        s.close();
    }
}
