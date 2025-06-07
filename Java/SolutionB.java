package Java;

public class SolutionB {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long smallestUncovered = 1;
        int cursor = 0;

        while (smallestUncovered <= n) {
            if (cursor < nums.length && nums[cursor] <= smallestUncovered) {
                smallestUncovered += nums[cursor];
                cursor++;
            } else {
                patches++;
                smallestUncovered *= 2;
            }
        }

        return patches;
    }
}