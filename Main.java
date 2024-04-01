
public class Main {
	 public static void main(String[] args) {
	        final int N = 1000; // Kích thước của ma trận là 32x32
	        int[][] A = new int[N][N];
	        int[][] B = new int[N][N];
	        int[][] C = new int[N][N];
	        
	        // Khởi tạo ma trận A và B với giá trị tăng dần từ 1 đến N*N
	        int value = 1;
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                A[i][j] = value;
	                B[i][j] = value;
	                value=i+1;
	            }
	        }
	        
	        System.out.println("Số phần tử của ma trận A: " + (N * N));
	        System.out.println("Số phần tử của ma trận B: " + (N * N));
	        
	        // Ghi lại thời gian bắt đầu
	        long startTime = System.currentTimeMillis();
	        
	        // Thực hiện phép nhân ma trận tuần tự
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                C[i][j] = 0;
	                for (int k = 0; k < N; k++) {
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
	        
	        // Ghi lại thời gian kết thúc
	        long endTime = System.currentTimeMillis();
	        
	        // Tính toán thời gian thực thi
	        long totalTime = endTime - startTime;
	        
	        System.out.println("Thời gian bắt đầu: " + startTime + " ms");
	        System.out.println("Thời gian kết thúc: " + endTime + " ms");
	        System.out.println("Thời gian thực thi: " + totalTime + " ms");
	        System.out.println("Số phần tử của ma trận C: " + (N * N));
	        
	        // Tính tổng giá trị của tất cả phần tử trong ma trận C
	        long sum = 0;
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                sum += C[i][j];
	            }
	        }
	        
	        System.out.println("Tổng giá trị của tất cả phần tử trong ma trận C: " + sum);
	    }
	}

