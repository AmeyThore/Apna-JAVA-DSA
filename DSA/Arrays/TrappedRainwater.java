package DSA.Array;

public class TrappedRainwater {

    public static int trap(int[] height) {

        int leftmax[] = new int[height.length]; // to store the maximum element on the left side of the current element from index 
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        int trapWater = 0;

        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapWater += waterlevel - height[i];
        }

        return trapWater;
    }

    public static void main(String[] args) {
        int heights[] = {4, 2, 0, 6, 2, 3, 5};
        System.out.println(trap(heights));
    }
}
