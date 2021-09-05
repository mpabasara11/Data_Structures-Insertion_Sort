/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortion1;

/**
 *
 * @author Malindu
 */
public class Insertionsortion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int data[]={800,1,-5,2};
       int key;
       
       for(int x=0;x<3;x++)
       {
       key=data[x+1];
       for(int y=x;y>=0;y--){
       if(data[y]>key)
       {int temp;
        temp=data[y];
        data[y]=key;
        data[y+1]=temp;
       
       }
       }
       }
       
       for(int c=0;c<=3;c++)
       {System.out.println(data[c]);}
    }
    
}
