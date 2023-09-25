package org.example.nums.myanswer;

public class NumsRunner {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(2);
        boolean res = myNumber.isPrime();
        System.out.println(res);



    }
}

class MyNumber{
    int num;

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isPrime(){
        if (num < 2){
            return false;
        }

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
