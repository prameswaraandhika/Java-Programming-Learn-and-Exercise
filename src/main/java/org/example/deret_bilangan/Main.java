package org.example.deret_bilangan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        printNumber(15);
    }

    public static void printNumber(int n) {
        int secondStar = 1;
        int fifthStar = 4;
        List<String> listNums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            listNums.add(" " + i + " ");
            if (i % 5 == 0){
                listNums.set(secondStar, " * ");
                listNums.set(fifthStar, " * ");
                fifthStar += 5;
                secondStar += 5;
            }
        }
        String result = String.join("", listNums);

        System.out.println(result);

    }


//    private static String printNumber(int num) {
////        1,2,3,4,5,6,7,8,9,10,11,12,13,14
//        int secondStar = 1;
//        int fifthStar = 4;
//        for (int i = 1; i <= num; i++) {
//            builder.append(i);
//            if (i % 5 == 0){
//                builder.replace(secondStar, secondStar + 1, "*");
//                builder.replace(fifthStar, fifthStar + 1, "*");
//                System.out.println(builder.toString());
//                secondStar+=5;
//                fifthStar+=5;
//            } else {
//                if (i % 2 == 0){
//                    builder.replace(secondStar, secondStar + 1, "*");
//                }
//            }
//        }
//        return builder.toString();
//    }
}
