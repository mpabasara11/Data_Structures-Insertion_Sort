package insertionsortion1;

public class Aa {

	public static void main(String[] args) {
		int[] num= {12,43,21,56,98,1};
		int key;
		
		for(int x=0;x<num.length-1;x++) {
			
			key=num[x+1];
			for(int y=x;y>=0;y--) {
				if(num[y]>key) {
					int temp=num[y];
					num[y]=key;
					num[y+1]=temp;
				}
				
				
			}
			
		}
		for(int c=0;c<num.length;c++) {
			System.out.println(num[c]);
		}

	}

}
