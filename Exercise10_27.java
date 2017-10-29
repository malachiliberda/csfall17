public class Exercise10_27{
  public static void main(String[] args){
    //2 objects are created. string1 and string2
    MyStringBuilder1 string1 = new MyStringBuilder1("Hello 77 Java");
    MyStringBuilder1 string2 = new MyStringBuilder1("Java says Hello");
    //All methods are called to be demonstrated through output. Mainly for my testing.
    System.out.println(string1.toString());
    System.out.println(string2.toString());
    System.out.println(string1.length());
    System.out.println(string2.length());
    System.out.println(string1.charAt(0));
    System.out.println(string2.charAt(6));
    System.out.println(string1.toLowerCase().toString());
    System.out.println(string2.toLowerCase().toString()); 
    System.out.println(string1.substring(1, 3));
    System.out.println(string2.substring(1, 3));
    System.out.println(string1.toString() + string1.append(string2));
    System.out.println(string1.toString() + string1.append(44));
  }
}
class MyStringBuilder1{
  private int size = 0;
  private String s1;
  
  public MyStringBuilder1(String s){
    size = s.length();
    s1 = s;
  }
  public int length(){
    return size;
  }
  public char charAt(int index){
    return s1.charAt(index);
  }
  public String toString(){
    return s1;
  }
  public MyStringBuilder1 toLowerCase(){
    String sLower = "";
    for(int x = 0; x < size; x++){
      sLower += Character.toLowerCase(s1.charAt(x));
    }
    return new MyStringBuilder1(sLower);
  }
  public MyStringBuilder1 substring(int begin, int end){
    String sSub = "";
    for(int x = begin; x < end; x++){
      sSub += s1.charAt(x);
    }
    return new MyStringBuilder1(sSub);
  }
  public MyStringBuilder1 append(MyStringBuilder1 s){
    String sAppended = "";
    sAppended += s;
    return new MyStringBuilder1(sAppended);
  }
  public MyStringBuilder1 append(int i){
    String iAppended = Integer.toString(i);
    return new MyStringBuilder1(iAppended);
  }
}