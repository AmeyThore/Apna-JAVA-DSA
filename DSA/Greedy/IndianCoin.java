package DSA.Greedy;

import java.util.*;

public class JobSequencing {
    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d; // Corrected this line
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // Sort jobs by profit in descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        // Find the maximum deadline to determine the size of the time slots array
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Initialize an array to keep track of free time slots
        int[] slots = new int[maxDeadline];
        Arrays.fill(slots, -1); // -1 indicates the slot is free

        int totalProfit = 0;
        int jobCount = 0;
        for (Job job : jobs) {
            // Try to find a free slot for this job, starting from the last possible slot
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = job.id; // Assign job id to this slot
                    totalProfit += job.profit;
                    jobCount++;
                    break;
                }
            }
        }

        // Output the result
        System.out.println("Max jobs = " + jobCount);
        System.out.println("Total Profit = " + totalProfit);
        System.out.println("Job sequence:");
        for (int i = 0; i < maxDeadline; i++) {
            if (slots[i] != -1) {
                System.out.print(slots[i] + " ");
            }
        }
        System.out.println();
    }
}
