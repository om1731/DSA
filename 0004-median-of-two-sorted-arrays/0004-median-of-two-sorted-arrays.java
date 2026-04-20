class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
   int m=nums1.length,n=nums2.length;
   int i=0,j=0;
   int k=m+n;
   int ind2=k/2;
   int ind1=ind2-1;
   int count =0;
   int ind1el=-1,ind2el=-1;
   while(i<m && j<n){
    if(nums1[i]<nums2[j]){
        if(count==ind1)ind1el=nums1[i];
        if(count==ind2)ind2el=nums1[i];
        count++;
        i++;
    }
    else{
        if(count==ind1)ind1el=nums2[j];
        if(count==ind2)ind2el=nums2[j];
        count++;
        j++;

    }
    }
while(i<m){
       if(count==ind1)ind1el=nums1[i];
        if(count==ind2)ind2el=nums1[i];
        count++;
        i++;

}
while(j<n){
       if(count==ind1)ind1el=nums2[j];
        if(count==ind2)ind2el=nums2[j];
        count++;
        j++;
}
if(k%2==1){
    return ind2el;
}
return (double)((double)(ind1el+ind2el)/2.0);
   }}