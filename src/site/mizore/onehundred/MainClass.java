package site.mizore.onehundred;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int[] num=new int[10];
        for(int i=0;i<100;i++) {
            int x=new Random().nextInt(10);
            for(int j=0;j<10;j++) {
                if(x==j)
                    num[j]++;
            }
        }
        System.out.println("0,1,2,3,4,5,6,7,8,9 出现的次数依次为：");
        System.out.println(Arrays.toString(num));
    }
}
