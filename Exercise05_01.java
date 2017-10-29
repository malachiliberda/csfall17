import java.util.Scanner;

public class Exercise05_01{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please be prepared to input select integers. Input 0 to end the process. ");
    System.out.print("Please input the first integer: ");
    int n = input.nextInt();
    int pcount = 0;
    int ncount = 0;
    double psum = 0;
    double nsum = 0;
    //System takes users first input before entering loops. 
    if(n > 0){
      psum += n;
      pcount++;
    }else{  
      nsum += n;
      ncount++;
    }
    //Loop begins
    while(n != 0){
      System.out.print("Please input next number: ");
      n = input.nextInt();
      if(n > 0){
        psum += n;
        pcount++;
      }else if(n < 0){
        nsum += n;
        ncount++;
      }else{
      break;
      }
    }
    double z = psum + nsum;
    double count = pcount + ncount;
    double average = z / count; 
    //System checks whether or not the user just inputed 0, or whether other integers exist.
    if(psum == 0 && nsum == 0){
      System.out.println("No numbers are entered except 0.");
    }else{
      System.out.println("The number of positives is " + pcount);
      System.out.println("The number of negatives is " + ncount);
      System.out.println("The total is " + z);
      System.out.println("The average is " + average);
    }
  }
}
