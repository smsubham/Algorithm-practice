//  program to implement Insertion Sort Algorithm.
#include<stdio.h>
void insertion_sort(int* a, int n)
{
    int i,j,key;
    for(i=1;i<n;i++)
    {
        key=a[i];
        for(j=i-1;j>=0;j--)
        {
            if(a[j]>key)
                a[j+1]=a[j];
            else break;
        }
        a[j+1]=key;
    }

}
int main()
{
    int a[10];
    int i,n;
    scanf("%d",&n);
    printf("Enter elements:");

    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    insertion_sort(a,n);

    for(i=0;i<n;i++)
        printf("%d",a[i]);
    return 0;
}
