import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        List<Integer> intersection = new ArrayList<>();

        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(nums1[i]==nums2[j]){
                      intersection.add(nums1[i]);
                      nums2[j] = Integer.MIN_VALUE;
                      break;
                }
            }
        }
        int[] result = new int[intersection.size()];
        for(int i=0; i< intersection.size();i++){
            result[i] = intersection.get(i);
        }
        return result;
    }
}