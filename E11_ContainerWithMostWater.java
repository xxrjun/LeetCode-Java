public class E11_ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = Math.min(height[left], height[right]) * height.length - 1;

        for(int i = 0 ; i < height.length / 2; i++){
            if(height[left] < height[right]) left++;
            else right--;

            int tmp = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, tmp);
        }

        return max;
    }
}
