package insertionsortion1;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] num= {3,7,1,8,98};
           
           //x=1  key=2
           int key;
           
           for(int x=0;x<num.length-1;x++) {
        	   key=num[x+1];
        	   
        	   for(int y=x;y>=0;y--) {
        		   if(num[y]>key) {
        			   int tmp=num[y];
        			   num[y]=key;
        			   num[y+1]=tmp;
        		   }
        	   }
           }
           
        for(int c=0;c<num.length;c++) {
        	System.out.println(num[c]);
        }
	}

}
