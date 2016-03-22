// bubble sort
#include <stdio.h>
void main()
{
int arr[10],n,i;
printf("Enter the no of elements");
scanf("%d",n);
printf("Enter %d numbers",n);
for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
bubble_sort(arr,n);


}
void bubble_sort(int b[],int n)
{
    int temp,i,j;
    for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            if(b[i]>b[j])
            {
              temp=b[i];
              b[i]= b[j];
              b[j]=temp;
            }
        }
    }
}
