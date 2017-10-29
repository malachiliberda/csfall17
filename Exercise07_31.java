import java.util.Scanner;

public class Exercise07_31{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int temp;
    int size1;
    int size2;
    System.out.print("Enter list1 size: ");
    size1 = input.nextInt();
    System.out.print("Enter list2 size: ");
    size2 = input.nextInt();
    int[] list1 = new int[size1];
    int[] list2 = new int[size2];
    int z = list1.length + list2.length;
    int[] result = new int[z];
    System.out.println("Enter list1 contents: ");
    for(int i = 0; i < list1.length; i++){
      list1[i] = input.nextInt();
    }
    System.out.println("Enter list2 contents: ");
    for(int w = 0; w < list2.length; w++){
      list2[w] = input.nextInt();
    }
    result = merge(list1, list2);
    for(int p = 0; p < list1.length - 1; p++){
      if(list1[p] > list1[p+1]){
        temp = list1[p];
        list1[p] = list1[p+1];
        list1[p+1] = temp;
        p = -1;
      }
    }
    for(int t = 0; t < list2.length - 1; t++){
      if(list2[t] > list2[t+1]){
        temp = list1[t];
        list1[t] = list1[t+1];
        list1[t+1] = temp;
        t = -1;
      }
    }
    System.out.print("list1 is ");
    for(int f = 0; f < list1.length; f++){
      System.out.print(list1[f] + " ");
    }
    System.out.println();
    System.out.print("list2 is ");
    for(int d = 0; d < list2.length; d++){
      System.out.print(list2[d] + " ");
    }
    System.out.println();
    System.out.print("The merged list is ");
    for(int g = 0; g < result.length; g++){
      System.out.print(result[g] + " ");
    }
    System.out.println();
  }
  
  public static int[] merge(int[] list1, int[] list2){
    int temp;
    int[] merge;
    int a = list1.length + list2.length;
    merge = new int[a];
    System.arraycopy(list1, 0, merge, 0, list1.length);
    System.arraycopy(list2, 0, merge, list1.length, list2.length);
    for(int i = 0; i < merge.length - 1; i++){
      if(merge[i] > merge[i+1]){
        temp = merge[i];
        merge[i] = merge[i+1];
        merge[i+1] = temp;
        i = -1;
      }
    }
    return merge;
  }
}