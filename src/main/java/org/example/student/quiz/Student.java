package org.example.student.quiz;

import java.math.BigDecimal;

public class Student {

    private String name;
    private int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public int getLengthOfScores(){
      return scores.length;
    }

    public int getTotalSumOfScores(){
        int result = 0;
        for (int i = 0; i < scores.length; i++) {
            result += scores[i];
        }
        return result;
    }

    public int getMaxScore(){
        int max = Integer.MIN_VALUE;
        for (int score: scores) {
            if (max < score){
                max = score;
            }
        }
        return max;
    }

    public int getMinScore(){
        int min = Integer.MAX_VALUE;
        for (int score: scores) {
            if (min > score){
                min = score;
            }
        }
        return min;
    }

    public BigDecimal getAverageScores(){
        int sum = getTotalSumOfScores();
        int length = getLengthOfScores();
        return new BigDecimal(sum/length);
    }

}
