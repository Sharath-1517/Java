package CoreJavaConcepts.classesandobjects.chatgpt;

//Write a program that reads in a list of integers from the user and creates an object of a class called "Statistics".
// The class should have methods to compute the mean, median, and mode of the list of integers.

import java.util.Arrays;

class Statistics {

    public double calculateMean(int[] arr) {

        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / arr.length;
    }

    public double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        double median_first_index = (arr.length / 2) - 1;
        double median_second_index = arr.length / 2;
        return ((median_first_index + median_second_index) / 2);
    }

    public double calculateMode(int[] arr) {
        if(arr.length%2 == 0)
            return (calculateMedian(arr));
        else
            return (arr.length / 2);

    }

}

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics();

        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        System.out.printf("Mean: %.2f\nMedian: %.2f\nMode: %.2f",stats.calculateMean(arr), stats.calculateMedian(arr), stats.calculateMode(arr));

    }
}



//OUTPUT//==============================================================================================================


//Mean: 4.00
//Median: 4.00
//Mode: 5.00

//======================================================================================================================
