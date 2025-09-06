class Solution {
    public void swap(int[] arr, int a , int b){
        int temp = arr[a];   // swap elements, not indices
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void reverse(int[] arr, int a , int b){
        while(a < b){
            swap(arr, a, b);
            a++;
            b--;
        }
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // 1. find the first decreasing element from right
        while(i >= 0 && arr[i] >= arr[i + 1]){
            i--;
        }

        // 2. if found, find the element just larger than arr[i] from right
        if(i >= 0){
            int j = n - 1;
            while(arr[j] <= arr[i]){
                j--;
            }
            swap(arr, i, j);
        }

        // 3. reverse the suffix
        reverse(arr, i + 1, n - 1);
    }
}