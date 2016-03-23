/*
Write a program to implement Activity selection problem using Greedy approach.
{choose suitable inputs for your program}
*/
#include <stdio.h>
void GREEDY_ACTIVITY_SELECTOR(int s[],int f[],int len,int a[])
{
  int n=1,i=1,m;
  for(m=1;m<n;m++)
  {
      if(s[m]>=f[i])
      {
          a[m]=1;
          i=m;
      }
  }
  if(m<=n)
    return a;
}
void main()
{
int s[100],f[100],len,i,n;
int a2[]={1,0,0,0,0,0,0,0,0,0,0,0,0,0};
printf("Enter no of elements");
scanf("%d",&n);
printf("Enter elements");
for(i=0;i<n;i++)
{
    scanf("%d",s[i]);
}
printf("Enter no of elements");
scanf("%d",&n);
GREEDY_ACTIVITY_SELECTOR(s,f,len,a2);
printf("Solution:");
for(i=0;i<len;i++)
{
    if(a2[i]==1)
        printf("%d",i+1);
}

}
