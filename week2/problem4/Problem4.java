import java.util.Scanner;

public class Problem4 {
	
    Scanner sc = new Scanner(System.in);

    public void main4() {
        System.out.print("배열 크기를 입력해주세요: ");
        int size = sc.nextInt();
        
        int a[] = new int[size];
        int b[] = new int[size];
        int c[] = new int[size*2];
        System.out.print("배열 A:");
        
        for(int i = 0; i < a.length; i++) {
        	a[i] = (i+1)*2-1;
        	System.out.print(a[i] + " ");
        }
        
        System.out.println();
        System.out.print("배열 B:");
        
        for(int i = 0; i < b.length; i++) {
        	b[i] = (i+1)*2;
        	System.out.print(b[i] + " ");
        }
        
        System.out.println();
        System.out.print("배열 C:");
        
        for(int i = 0; i < size; i++) {
        	c[a[i]-1] = a[i];
        	c[b[i]-1] = b[i];
        }
        
        for(int i = 0; i < c.length; i++) {
        	System.out.print(c[i] + " ");
        }
       
        
    }    
    
}