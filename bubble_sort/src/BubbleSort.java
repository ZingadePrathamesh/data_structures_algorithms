import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
         String str = "In the vast expanse of the universe, Earth exists as a pale blue dot, a speck of dust suspended in the cosmic sea. On this tiny orb, teeming with life, civilizations rise and fall, each leaving its mark on the tapestry of history. From the ancient civilizations of Mesopotamia and Egypt to the empires of Rome and China, humanity has journeyed through epochs of discovery, innovation, and upheaval. The annals of human history are replete with tales of triumph and tragedy, of conquests and collapses, of heroes and villains who have shaped the course of civilization. Across continents and centuries, cultures have flourished, languages have evolved, and ideologies have clashed in the relentless march of progress.\n" +
                 "\n" +
                 "At the heart of this grand saga lies the human spirit, an indomitable force that defies the odds, transcends boundaries, and reaches for the stars. From the earliest cave paintings to the latest space probes, creativity has been the hallmark of our species, driving us to explore the unknown, to unravel the mysteries of the universe, and to forge connections that span the cosmos. With each new discovery, we push the boundaries of knowledge, expanding our understanding of the cosmos and our place within it.\n" +
                 "\n" +
                 "Yet, for all our achievements, we are but stewards of a fragile planet, entrusted with the task of safeguarding its future for generations yet unborn. As we stand on the precipice of a new era, confronted by challenges both old and new, the need for unity, cooperation, and empathy has never been greater. Climate change, resource depletion, and global pandemics threaten the very fabric of our existence, demanding urgent action and collective resolve. In the face of adversity, humanity must rise above petty divisions and short-term interests, embracing our shared humanity and the interconnectedness of all life on Earth.\n" +
                 "\n" +
                 "At the dawn of the 21st century, the promise of a brighter future beckons, fueled by advances in science, technology, and social progress. From the eradication of disease to the exploration of distant worlds, humanity stands on the cusp of a new age of enlightenment, where the boundaries between imagination and reality blur, and the possibilities are limited only by the scope of our dreams. Yet, with great power comes great responsibility, and the choices we make today will shape the world of tomorrow.\n" +
                 "\n" +
                 "As we gaze upon the stars, let us remember the lessons of the past, honoring the sacrifices of those who came before us and striving to build a better world for future generations. Let us embrace diversity, celebrate our differences, and recognize the inherent worth and dignity of every individual. Let us harness the power of technology for the greater good, promoting innovation, sustainability, and social justice. And let us never lose sight of the inherent beauty and wonder of the cosmos, for in its vastness lies the promise of infinite possibilities and the hope of a brighter tomorrow.";

        System.out.println(str);

        String str2 = str.substring(0, 1250);

        System.out.println(str2);





        int[] nums = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void bubbleSort(int[] nums){
        int length = nums.length-1;
        int noCheck =0;
        boolean swapped = false;
        while(length>=0) {
            swapped = false;
            for (int i = 0; i < length; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
            length--;
        }
    }
}
