import java.lang.reflect.Array;
import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 0},
                {0, 0, 1},
                {0, 1, 1}
        };

        int[][] images2 = {
                {1,1,0},{1,0,1},{0,0,0}
        };
        for(int[] nums: flipAndInvertImage(images2)){
            System.out.println(Arrays.toString(nums));
        }
        System.out.println();
        System.out.println();
        for(int[] nums: flipAndInvertImageOptimized(images2)){
            System.out.println(Arrays.toString(nums));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length/2; j++){
                int temp =  image[i][j];
                image[i][j] = image[i][image[i].length-1-j];
                image[i][image[i].length-1-j] = temp;
            }
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 1) image[i][j] = 0;
                else image[i][j] = 1;
            }
        }

        return image;
    }
    public static int[][] flipAndInvertImageOptimized(int[][] image) {
        for(int[] nums: image){
            for(int j = 0; j < (image[0].length+1)/2; j++){
                int temp =( nums[j] ^ 1);
                nums[j] = (nums[image[0].length - j -1] ^ 1);
                nums[nums.length - j -1] = temp;
            }
        }
        return image;
    }
}
