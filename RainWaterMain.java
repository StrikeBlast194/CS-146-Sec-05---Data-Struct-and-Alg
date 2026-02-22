/**
 * Solves the Trapped Rainwater problem
 */
public class RainWaterMain {

    public static void main(String[] args) {

        int[] elevationMap =
                {1, 2, 1, 4, 1, 2, 1, 5, 0, 0, 2, 1, 5};

        System.out.println("Trapped Water: " +
                trapRainWater(elevationMap) + " units");
    }

    public static int trapRainWater(int[] height) {

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

}
