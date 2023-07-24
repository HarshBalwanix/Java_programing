public class sorting {
    void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length-1;j++)
          {
            if(arr[i]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp; 
            }
          }  
        }
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
    public  static void main(String[] args)
    {
        int arr1[]={35,40,23,67,49};
        // sort(arr1);
    }
}
