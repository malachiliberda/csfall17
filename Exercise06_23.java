import java.util.Scanner;

public class Exercise06_23{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a String: ");
    String word = input.next();
    System.out.print("Please input a character from the String: ");
    char letter = input.next().charAt(0);
    int answer = count(word, letter);
    System.out.println(answer);
  }
  public static int count(String str, char a){
    int charCount = 0;
    char b; 
    for (int i = 0; i < str.length(); i++){
      b = str.charAt(i);
      if(b == a){
        charCount ++;
      } 
    }
    return charCount;
  }
}
  