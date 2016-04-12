#include<stdio.h>
#define max 100
//Depth First Search in Tree
int a[max][max];
int reach[max];
int n,k=1;
int print[max];



int dfs(int v)
{
    int i;
    reach[v]=1;
    for(i=0;i<n;i++)
    {
        if(a[v][i]==1 && reach[i]==0)
        {
            printf("%d -> %d\n",v+1,i+1);
            print[k++]=i+1;
            dfs(i);
        }
    }
}

void printer()
{
    int i;
    printf("The dfs search results are:- \n");
    for(i=k-1;i>=0;i--)
        printf("%d\n",print[i]);
}
int main()
{
    int i,j;
    printf("Enter the number of vertices\n");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        reach[i]=0;
        for(j=0;j<n;j++)
            a[i][j]=0;
    }

    printf("Enter the adjacency matrix\n");
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            scanf("%d",&a[i][j]);
    //print[0]=1;
    dfs(0);
    print[0]=1;
    printer();

return 0;
}
