public class TestFive {
    public static void main(String[] args) {
        int one = 100;
        int two = one;
        System.out.println("one="+one);
        System.out.println("two="+two);
        one = 200;
        System.out.println("one="+one);
        System.out.println("two="+two);
        two = 300;
        System.out.println("one="+one);
        System.out.println("two="+two);
        System.out.println("------------------------------------");

        int[] nums1 = new int[3];
        int[] nums2 = nums1;
        nums1[0] = 101;
        System.out.println(nums2[0]);
        nums2[0] = 202;
        System.out.println(nums1[0]);

        System.out.println(nums1);

        System.out.println("------------------------------------------");
        int[] nums3 = new int[3];
        nums3 = new int[5];
    }
}
