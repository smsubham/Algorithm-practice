/*
Write a program to implement Activity selection problem using Greedy approach.
{choose suitable inputs for your program}
*/
#include<stdio.h>
struct activity
{ int st;
  int end;
} act[20];
void ACTIVITY_SELECTOR(int,int);
int ans[10];
static count=1;
void main()
{
  int i,j,n;
  printf("Enter the number of activities");
  scanf("%d",&n);
  printf("Enter the start point and end points of the activities\n");
  printf("\t START \t END");
  for(i=0;i<n;i++)
  scanf("%d %d",&act[i].st,&act[i].end);
  ACTIVITY_SELECTOR(0,n);
   printf("\n The set of activity selected are");
   ans[0]=0;
   count--;
   for(j=0;j<=count;j++)
   printf("  A%d",ans[j]+1);
 }
 void ACTIVITY_SELECTOR(int i,int j)
 {
   int m;
   m=i+1;
   while(m<=j && act[m].st<act[i].end)
   m++;
   if(m<j)
   {
         ans[count++]=m;
         ACTIVITY_SELECTOR(m,j);
   }
 }
