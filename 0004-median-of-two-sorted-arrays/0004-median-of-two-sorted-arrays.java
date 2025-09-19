class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2){
int i=0;
int j=0;
int k=0;

int n =a1.length;
int m=a2.length;
int[] arr=new int[n+m];

while(i<a1.length && j<a2.length){

if(a1[i]<a2[j]){
    arr[k]=a1[i];
    k++;
    i++;
}
else{
    arr[k]=a2[j];
    j++;
    k++;
}
}

while(i<n){
    arr[k]=a1[i];
    i++;
    k++;


}
while(j<m){
    arr[k]=a2[j];
    j++;
    k++;
}

int size= arr.length;

if(size%2==0){
    int mid= size/2;

    return (double)((arr[mid]+arr[mid-1])/2.00);


}
if(size%2!=0){
    int mid= size/2;

    return (double)(arr[mid]);


}




return -1;
    
        
    }
}