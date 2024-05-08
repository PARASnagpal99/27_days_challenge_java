import java.util.* ;
import java.io.*; 
public class Solution {
   
    public long merge(long[] arr, int l, int mid, int r, int n) {
        long[] temp = new long[r - l + 1];
        long ans = 0;

        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                ans += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        k = 0 ;
        for (i = l ; i <= r ; i++) {
            arr[i] = temp[k++];
        }

        return ans;
    }

    public long func(long[] arr, int l, int r) {
        if (l >= r) return 0;
        long ans = 0;
        int mid = l + (r - l) / 2;
        ans += func(arr, l, mid);
        ans += func(arr, mid + 1, r);
        ans += merge(arr, l, mid, r, arr.length);
        return ans;
    }

    public static long getInversions(long[] arr, int n) {
        Solution solution = new Solution();
        long ans = solution.func(arr, 0, n - 1);
        return ans;
    }
}
