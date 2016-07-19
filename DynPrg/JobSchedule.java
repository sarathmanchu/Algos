package com.example.helloworld.producerconsumer.DynPr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sarath on 7/19/16.
 */
class Job{
    int start,end,profit;

    public Job(int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}
class FinishTimeCompare implements Comparator<Job>{

    @Override
    public int compare(Job lhs, Job rhs) {
        if(lhs.end<=rhs.end)
            return -1;
        else
            return 1;
    }
}
public class JobSchedule {

    static int maxProfit(Job[] jobs){
        int[] profArr=new int[jobs.length];
        FinishTimeCompare finishTimeCompare=new FinishTimeCompare();
        Arrays.sort(jobs,finishTimeCompare);
        int max=0;
        for (int i = 0; i <jobs.length ; i++) {
            profArr[i]=jobs[i].profit;
        }
        for (int i = 1; i <jobs.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(jobs[j].end<=jobs[i].start){
                    profArr[i]=Math.max(profArr[i],profArr[j]+jobs[i].profit);
                    if(max<profArr[i])
                        max=profArr[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Job jobs[]=new Job[6];
        jobs[0]=new Job(1,3,5);
        jobs[1] = new Job(2,5,6);
        jobs[2] = new Job(4,6,5);
        jobs[3] = new Job(6,7,4);
        jobs[4] = new Job(5,8,15);
        jobs[5] = new Job(7,9,2);
        System.out.println(maxProfit(jobs));

    }
}
