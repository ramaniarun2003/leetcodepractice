package org.example;

public class Solution {

    public int climbStairs(int n) {
        return dfs(n, 0);
    }

    public int dfs(int totalSteps, int currentStep) {
        if (currentStep > totalSteps) {
            return 0;
        }

        if (currentStep == totalSteps) {
            return 1;
        }

        int oneStep = dfs(totalSteps, currentStep + 1);
        int twoSteps = dfs(totalSteps, currentStep + 2);

        int totalWays = oneStep + twoSteps;

        return totalWays;
    }
}
