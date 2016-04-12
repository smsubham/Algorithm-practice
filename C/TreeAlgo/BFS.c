
#include<stdio.h>
#define max 100

int a[max][max],n,reach[max];
int queue[max],top=0;

void bfs()
{
    if(top==0)
        exit(0);
    int p=deque();
    int i,j;
    printf("%d\n",p+1);
    for(i=0;i<n;i++)
    {
        if(a[p][i]==1)
            {
                enque(i);
                for(j=0;j<n;j++)
                    a[j][i]=0;
            }
    }
    bfs();
}

int deque()
{
    return queue[top--];

}

void enque(int e)
{
    queue[++top]=e;
}

int main()
{
   int i,j;
    printf("Enter the number of elements\n");
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

    printf("Enter the root of the graph\n");
    int root;
    scanf("%d",&root);
    queue[top++]=root;
    for(i=0;i<n;i++)
        a[i][root]=0;

    printf("The BFS results are\n");
    bfs();

    return 0;

}
