package DSA.Greedy;

import java.util.*;

public class JobSequencing {
    static class job{
        int profit;
        int deadline;
        int id;

        public job(int i, int d, int p) {
            id = i;
            deadline = i;
            profit = p;
        }

    }
    public static void main(String[] args) {
        int Jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();
        for(int i = 0 ;i < Jobinfo.length;i++){
            jobs.add(new job(i, Jobinfo[i][0], Jobinfo[i][1]));
        }

        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i =0 ;i < jobs.size(); i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max jobs = "+ seq.size());
        for(int i=0; i < seq.size(); i++){
            System.out.println(seq.get(i)+ " ");
        }
        System.out.println();
    }
}
