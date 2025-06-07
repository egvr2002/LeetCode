function minPatches(nums: number[], n: number): number {
    let min_num = 1;
    let patches = 0;
    let i = 0;

    while (min_num <= n) {
        if (i < nums.length && nums[i] <= min_num) {
            min_num += nums[i];
            i++;
        }else {
            patches++;
            min_num *= 2;
        }
    }
    return patches;
};