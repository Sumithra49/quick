//Implement a function to perform quicksort on an array. Describe your approach and the average and worst-case time complexities.
class Main{
    public static void main(String[] args){
        int[] arr={10,7,8,9,1,5};
        int n=arr.length;
        quick(arr,0,n-1);
        System.out.print("sorted array:"+java.util.Arrays.toString(arr));

    }


    public static void quick(int[] arr,int low,int high){
        if(low<high){

            int p=partition(arr,low,high);
            quick(arr,low,p-1);
            quick(arr,p+1,high);
        }
        public static int partition(int[] arr,int low,int high){
            int pi=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<=pi){
                    i++;
                    //swap
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            int t=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=t;
            return i+1;
        }
    }
}


//Implement a binary search algorithm for a sorted array. Explain your method and the time complexity of your solution.

class Main{
    public static void main(String[] args){
        int[] a={1,2,3,5,6,7,8,9,10};
        int target=7;
        int result=binarySearch(a,target);
        if(result!=-1){
            System.out.println(result);
        }else{
            System.out.println("element not found");
        }

    }
    public static int binarySearch(int[] a,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}