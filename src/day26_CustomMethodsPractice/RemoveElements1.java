package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {


    }











    //removes the index from the array,new array
    public static int[] removeElement(int[] array,int index){

      if (index < 0|| index > array.length-1){
          System.err.println("Invalid Index: "+index);
          System.exit(0);
      }

        int[] result = new int[array.length -1];

        int j = 0;
        for (int i=0; i< array.length; i++){
            if (i == index){// if the index of array is matcing with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }




    //removes the index from the array,new array
    public static double[] removeElement(double[] array,int index){

        if (index < 0|| index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1];

        int j = 0;
        for (int i=0; i< array.length; i++){
            if (i == index){// if the index of array is matcing with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }




    //removes the index from the array,new array
    public static char[] removeElement(char[] array,int index){

        if (index < 0|| index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1];

        int j = 0;
        for (int i=0; i< array.length; i++){
            if (i == index){// if the index of array is matcing with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }




    //removes the index from the array,new array
    public static String[] removeElement(String[] array,int index){

        if (index < 0|| index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1];

        int j = 0;
        for (int i=0; i< array.length; i++){
            if (i == index){// if the index of array is matcing with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;
    }
}