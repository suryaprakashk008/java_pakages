package sortings;

public class sort{

     public static void printarray(int arr[])
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubblesort(int arr[])
    {
      int len = arr.length;
      boolean swapped;
        for(int i =0;i<len-1;i++)
        {
            swapped = false;
            for(int j = 0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if(!swapped)
            {
                break;
            }
        }
    }
    public static void qsort(int[] nums,int low,int high)
    {
        if(low<high)
        {
            int pi = partition(nums,low,high);
            qsort(nums,low,pi-1);
            qsort(nums,pi+1,high);

        }
    }
    private static int partition(int[] nums,int low,int high)
    {
       int pivot = nums[high];
       int i = low-1;

       for(int j=low;j<high;j++)
       {
        if(nums[j]<pivot)
        {
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

       }
       int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }
    public static void quicksort(int arr[])
    {
        qsort(arr, 0, arr.length-1);
    }
    public static void insertionsort(int arr[])
    {
      int len = arr.length;
      for(int i =1;i<len;i++)
        {
          int key = arr[i];
          int j = i -1;
          while(j>=0 && arr[j]>key)
          {
            arr[j+1] = arr[j];
            j = j-1;
          }
          arr[j+1] = key;
        }
    }
    public static void selectionsort(int arr[])
    {
        int len = arr.length;
        int minimalIndex = -1;
        for(int i =0;i<len-1;i++)
        {
            minimalIndex = i;
            for(int j = i+1;j<len;j++)
            {
                
                if(arr[j]<arr[ minimalIndex])
                {
                    minimalIndex = j;

                }
            }
             int temp1 = arr[ minimalIndex];
             arr[ minimalIndex] = arr[i];
             arr[i] = temp1;
            
        }
    }
    public static void msort(int[] arr, int l, int r) 
    {
        
        if(l<r){
            int mid = (l+r)/2;
            msort(arr, l, mid);
            msort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int[] arr, int l, int mid, int r) {
        
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x=0;x<n1;x++)
        {
            lArr[x] = arr[l+x];
        }
         for(int x=0;x<n2;x++)
        {
           rArr[x] = arr[mid+1+x];
        }
        int i =0;
        int j =0;
        int k =l;

        while(i<n1 && j<n2)
        {
            if(lArr[i]<=rArr[j])
            {
                arr[k]= lArr[i];
                i++;
            }
            else{
                arr[k]= rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]= lArr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }
    public static void mergesort(int arr[])
    {
        msort(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        
    }
}