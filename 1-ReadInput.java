package com.hackercode.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadInput {
		private int n,N,c,R;
		private int [][]location;
		private Car []car;
		private Request []req;
		public int getN() {
			return n;
		}
		public int getC() {
			return c;
		}
		public int getR() {
			return R;
		}
		public int[][] getLocation() {
			return location;
		}
		public Car[] getCar() {
			return car;
		}
		public Request[] getReq() {
			return req;
		}
		////////////////////////////////////////////
		public void setN(int n) {
			this.n = n;
		}
		public void setC(int c) {
			this.c = c;
		}
		public void setR(int r) {
			R = r;
		}
		public void setLocation(int[][] location) {
			this.location = location;
		}
		public void setCar(Car[] car) {
			this.car = car;
		}
		public void setReq(Request[] req) {
			this.req = req;
		}
/////////////////////////////////////////////////////////////////////////////////////
		public void reading() throws IOException{
				Scanner sr=new Scanner(new File("D:/softwares/input.txt"));
				n=sr.nextInt(); // No of city
				N=sr.nextInt(); // No of cars
				c=sr.nextInt(); // capacity of each car
				R=sr.nextInt(); // No of requests
/////////////////////////////////////////////////////////////////////////////////////
				//System.out.println(n);
				//System.out.println(N);
				location=new int[n][n];
				for(int i=0;i<n;i++){
					for(int j=0;j<n;j++){
					location[i][j]=sr.nextInt();
					if(location[i][j]==-1){
						location[i][j]=999;
					}
					System.out.print(location[i][j] +" ");
					}
					System.out.println();
				}

/////////////////////////////////////////////////////////////////////////////////////
				car=new Car[N];
				for(int i=0;i<N;i++){
					car[i]=new Car();
				}
				
				for(int i=0;i<N;i++){
					//System.out.println(sr.nextInt());
					car[i].setLocation(sr.nextInt());
					
				}
/////////////////////////////////////////////////////////////////////////////////////
				req=new Request[R];
				for(int i=0;i<R;i++){
					req[i]=new Request();
				}
				for(int i=0;i<R;i++){
					//System.out.println(sr.nextInt());
					req[i].setSrc(sr.nextInt());
					req[i].setDest(sr.nextInt());
					req[i].setSrtTime(sr.nextInt());
					req[i].setEndTime(sr.nextInt());
				}

/////////////////////////////////////////////////////////////////////////////////////			

		}
}

/*     Input file
5 10 5 20

# 5->No of city
# 10 -> No of cars
# 5 -> capacity of each car
# 20-> no fo requests
#################################################

-1 10 -1 -1 -1
10 -1 25 10 -1
-1 25 -1 20 30
-1 10 20 -1 -1
-1 -1 28 -1 -1

# Matrix to show distance between two city 
#################################################

1 1 2 3 4 4 5 5 2 1

# No of cars with their position
#################################################

1 4 600 645 
5 1 610 623
2 5 639 672
1 2 619 623
1 5 640 720
2 5 647 723
4 2 625 739
1 4 700 745
4 1 239 839
2 4 739 752
1 3 719 923
2 5 654 729
4 5 704 723
4 2 625 739
2 5 645 725
2 1 647 723
4 3 655 739
1 4 720 745
4 2 239 539
2 4 390 752

# 1-> src # 4-> dest # 600-booking time  # 645->max waiting time
##########################################################
*/