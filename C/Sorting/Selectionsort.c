// Program to implement Selection sort Algorithm
#include<stdio.h>
void selection_sort(int *a, int n)
{
    int i,j,pos,t;
    for(i=0;i<n-1;i++)
    {
        pos=i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<a[pos])
                pos=j;
        }
        t=a[pos];
        a[pos]=a[i];
        a[i]=t;
    }

}
int main()
{
    int a[10];
    int i,n;
    printf("Enter no of elements");
    scanf("%d",&n);
    printf("Enter elements:");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    selection_sort(a,n);
    for(i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
    return 0;
}
