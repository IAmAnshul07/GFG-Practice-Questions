class Solution
{
    int pivot(int A[], int l, int h){
        while(l<h){
            int mid = l+(h-l)/2;
             if(A[mid] >= A[0]){
                 l = mid+1;
             }else{
                 h = mid;
             }
        }
        return l;
    }
    int binarysearch(int A[], int l, int h, int key){
        while(l<=h){
            int mid = l+(h-l)/2;
            if(A[mid] == key){
                return mid;
            }else if(A[mid] < key){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return -1;
    }
    int search(int A[], int l, int h, int key)
    {
        int pvt = pivot(A,l,h);
        if(A[pvt] <= key && key <= A[h]){
            return binarysearch(A,pvt,h,key);
        }else{
             return binarysearch(A,l,pvt-1,key);
        }
}}