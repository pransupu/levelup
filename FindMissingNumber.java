public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println("Starting...");
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        int actualSum = 0;
        int n = nums.length + 1;
        int expectedSum = (n*(n+1))/2;
        for (int i=0; i<n-1; i++) {
            actualSum += nums[i];
        }
        System.out.println("Missing number ("+expectedSum+"-"+actualSum+"): "+(expectedSum-actualSum));
        System.out.println("Done");
    }
}
