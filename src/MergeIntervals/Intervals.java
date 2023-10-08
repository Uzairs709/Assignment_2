package MergeIntervals;

import java.util.ArrayList;
import java.util.Scanner;

public class Intervals {
    ArrayList<int[]> intervalList;
    Intervals(){
        intervalList=new ArrayList<>();
    }
    public void input(){
        System.out.print("How many intervals you wat to enter? :");
        Scanner scanner=new Scanner(System.in);
        int numberOfIntervals=scanner.nextInt();
        for(int i=0;i<numberOfIntervals;i++){
            System.out.println("Enter interval number " +(i+1)+": ");
            int start,end;
            System.out.print("Enter start: ");
            start=scanner.nextInt();
            System.out.print("Enter End: ");
            end=scanner.nextInt();
            int [] arr=new int[]{start,end};
            intervalList.add(arr);
        }
    }

    public void mergeInterval(){
        for(int i=1;i<=intervalList.size()-1;i++){


           if(intervalList.get(i-1)[0]<intervalList.get(i)[0]){
               if(intervalList.get(i-1)[1]>intervalList.get(i)[0]){
                   int change =Math.max(intervalList.get(i-1)[1],intervalList.get(i)[1]);
                   intervalList.get(i-1)[1]=change;
                   intervalList.remove(i);
                   i--;
               }
            }
        }
    }

    public void displayIntervals(){
        System.out.println("[");
        for(int[] arr:intervalList){
            System.out.println("{"+arr[0]+","+arr[1]+"},");
        }
        System.out.println("]");
    }
}
