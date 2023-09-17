package org.example.studentapp;

public class StudentRunner {
    public static void main(String[] args) {
        int[] scores = {97, 98, 100};
        Student student = new Student("Andhika", scores);
        System.out.println("length: "+student.getLengthOfScores());
        System.out.println("max: "+student.getMaxScore());
        System.out.println("min: "+student.getMinScore());
        System.out.println("avg: "+student.getAverageScores());
    }
}
