public class FindNum {
    void Find(int[][]x,int row,int col,int num){
    	int i=0;int j=col-1;
    	int flag=0;
    	while(i<row&&j>=0){
    		if(num<x[i][j]){
    			j--;
    		}
    		else if(num>x[i][j]){
    			i++;
    		}
    		else {
    			System.out.println("找到");
    			flag=1;
    			break;
    		}
    	}
    	if(flag == 0){
    		System.out.println("没找到");
    	}
    	
    }
    	
    
}
