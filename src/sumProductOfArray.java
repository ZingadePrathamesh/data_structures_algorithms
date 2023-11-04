public class sumProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        sumProductOfArray(nums);

//        printPairOfArray(nums);
        for(int element: nums){
            System.out.print(element +" ");
        }
        reverseArray(nums);
        System.out.println();
        for(int element: nums){
            System.out.print(element +" ");
        }

        reverseArrayRec(nums, 0, nums.length-1);
        System.out.println();
        for(int element: nums){
            System.out.print(element +" ");
        }
    }
    public static void sumProductOfArray(int[] arr){
        int sum = 0;        //---------------------------O(1)
        long product = 1;                   //-----------O(1)
        for(int i = 0; i< arr.length; i++){      //------O(n)
            sum += arr[i];                  //-----------O(1)
            product *= arr[i];              //-----------O(1)
        }
        System.out.println("Sum: " + sum);  //-----------O(1)
        System.out.println("Product: "+ product);  //----O(1)

        //Total TimeComplexity: O(n)
    }

    public static void printPairOfArray(int[] nums){
        for(int i = 0; i<nums.length; i++){     //------------------------O(n)
            for (int j = 0; j<nums.length; j++){    //--------------------O(n)
                System.out.print(nums[i]+ "" + nums[j]+ "\t");   //-------O(1)
            }
            System.out.println();               //------------------------O(1)
        }
        //Total TimeComplexity: O( n * n )
    }

    public static void reverseArray(int[] nums){
        int start = 0;              //------------------------O(1)
        int end = nums.length-1;    //------------------------O(1)
        while(start<end){           //------------------------O(n)
            int temp = nums[start]; //------------------------O(1)
            nums[start] = nums[end];//------------------------O(1)
            nums[end]= temp;        //------------------------O(1)
            start++;                //------------------------O(1)
            end--;                  //------------------------O(1)
        }
    }

    public static void reverseArrayRec(int[] nums, int start, int end){
        int s = start;
        int e = end;
        if(start>=end) return;
        else{
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            reverseArrayRec(nums, s+1, e-1);
        }
    }
}
