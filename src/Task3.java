import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("请输入要查找的数字");
        int target=Integer.parseInt(s.next());
        System.out.println("请输入行数");
        int x=Integer.parseInt(s.next());
        System.out.println("请输入列数");
        int y=Integer.parseInt(s.next());
        System.out.println(x+" "+y);
        int [][]temp=new int [x][y];
        
        for(int i=0;i<x;i++){
        	for(int j=0;j<y;j++){
        		temp[i][j]=Integer.parseInt(s.next());
        	}
        }
        for(int i = 0;i < x;i++){
        	for(int j = 0;j < y;j++){
        		System.out.print(temp[i][j]);
        	}
        	System.out.println();
        }
        FindNum a=new FindNum();
        a.Find(temp, x, y, target);
	}

}
