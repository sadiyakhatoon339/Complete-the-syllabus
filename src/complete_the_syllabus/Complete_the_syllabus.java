/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complete_the_syllabus;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author DELL
 */
public class Complete_the_syllabus {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
        int s=0,d=0;
         int a[]=new int[100];
         for(int i=0;i<t;i++)
         {
         int n=Integer.parseInt(br.readLine());
          StringTokenizer tk=new StringTokenizer(br.readLine());      
         for(int j=0;j<7;j++)
         {
         a[j]=Integer.parseInt(tk.nextToken());
         }
    for(int k=0;k<n;k++)
    {
    for(int j=0;j<7;j++)
    {
    s=s+a[j];
    if(s==n)
        d=j;
    }}
         if(d==0)
            System.out.println("monday");
          else if(d==1)
            System.out.println("tuesday");
          else if(d==2)
            System.out.println("wednesday");
          else if(d==3)
            System.out.println("thursday");
          else if(d==4)
            System.out.println("friday");
          else if(d==5)
            System.out.println("Saturday");
         else
           System.out.println("Sunday");   
         }
        
   
        // TODO code application logic here
    }
    
}
