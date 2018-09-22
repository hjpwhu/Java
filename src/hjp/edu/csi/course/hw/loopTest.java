package hjp.edu.csi.course.hw;

public class loopTest {
	
	
	public static void main(String args[]) {
	      // 一个九九乘法表的实现
        int count = 0;
        int k = 10;
        System.out.println(k);
        System.out.println(k--);
        System.out.println(--k);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                count = i * j;
                System.out.printf("%d*%d=%d\t", j, i, i*j);
            }
            System.out.println();
        }


//		
//		
//		
//		
//	      int count = 1;
//	        do
//	        {
//	            System.out.println(count);
//	            count += 1;
//	        } while(count <= 9);
//
//        //一个九九乘法表的实现
//        int c = 0;
//        for (int a = 1; a <= 9; a++) {
//            for (int b = 1; b <= a; b++) {
//                c = a * b;
//                System.out.printf("%d*%d=%d  ",b,a,c);
//            }
//            System.out.println();
//        }
//        System.out.println("-------------------我是华丽的分割线--------------------------");
//
//        // 遍历数组的方法
//        // 方法1：
//        int arr[] = {1, 2, 3, 4};
//        for (int a = 0; a < arr.length; a++) {
//            System.out.println(arr[a]);
//        }
//
//        System.out.println("-------------------我是华丽的分割线--------------------------");
//        //方法2：
//        for (int a : arr) {
//            System.out.println(a);
//        }
//        
//        System.out.println("-------------------我是华丽的分割线--------------------------");
//        //二维数组的遍历
//        
//        int arr2[][]=new int[][]{
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//            
//        };
//        
//        for(int i=0;i<arr2.length;i++){
//            for(int j=0;j<arr2[0].length;j++){
//                System.out.print(arr2[i][j]+" ");               
//            }
//            System.out.println();
//        }
        
    }


}
