//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
              int a[]={90,2,3,5,7,2,4};

              meragesort(a,0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    static void meragesort(int a[],int Start,int end){
        if(Start<end){
            int mid=Start+(end-Start)/2;

            meragesort(a,Start,mid);//lefthalf
            meragesort(a,mid+1,end);//righthalf

            merge(a,Start,mid,end);
        }
    }

    static void merge(int a[],int Start,int mid,int end) {
        int temp[] = new int[end - Start + 1];
        int k=0;

        int i = Start, j = mid + 1;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i];
                i++;
            } else {
                temp[k++] = a[j];
                j++;
            }}

            while (i <= mid) {
                temp[k++] = a[i];
                i++;
            }
            while (j <= end) {
                temp[k++] = a[j];
                j++;
            }

            for (int idx = 0; idx < temp.length; idx++) {
                a[idx+Start]=temp[idx];

            }

    }
}