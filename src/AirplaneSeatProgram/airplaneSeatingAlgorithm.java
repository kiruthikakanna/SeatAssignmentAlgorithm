package AirplaneSeatProgram;

import java.util.ArrayList;
import java.util.List;

public class airplaneSeatingAlgorithm {
	static List<int[][]> fullList= new ArrayList<>();
	static int[][] userInput = {{2,3},{3,4},{3,2},{4,3}};
	 static 
	    {
		 
		  
           int[][] matrixCreator = null;
		   
		   for (int i = 0; i < userInput.length; i++)
	        {
			   int rowVal=0,colVal=0;
		             for (int j = 0; j < 2; j++)
		              {
		            	 if(j>0)
		            		 colVal  =userInput[i][j];
		            	 else
		            	 rowVal  =userInput[i][j];
		              }
		             //System.out.println(rowVal + ""+colVal);
		             matrixCreator = new int[rowVal][colVal];
		             enterMatrixData(matrixCreator, rowVal, colVal);
		             printMatrix(matrixCreator, rowVal, colVal);
		             fullList.add(matrixCreator);
	        }
		  
	      
	    }
	 public static void enterMatrixData(int[][] matrix, int matrixRow, int matrixCol){
	          
	          for (int i = 0; i < matrixRow; i++)
	          {
	              for (int j = 0; j < matrixCol; j++)
	              {
	                  matrix[i][j] = 0;
	              }
	          }
	  }
	  
	  public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol){
	    System.out.println("");
	        
	        for (int i = 0; i < matrixRow; i++)
	        {
	            for (int j = 0; j < matrixCol; j++)
	            {
	                //System.out.print(matrix[i][j]+"\t");
	            	System.out.print(0+"\t");
	            }
	             
	            System.out.println();
	        }
	  }
	public static void main(String[] args) {
		 int seater=1;
		fullList= aisieSeatGenerator(fullList,seater);
		
		   int eliminatorWindow=0;
		   
		   for(int[][] eachRow: fullList)
		   {
			   for (int countOne = 0; countOne < eachRow.length; countOne++) {
				      for (int countTwo = 0; countTwo < eachRow[countOne].length; countTwo++) {
				       
				        if(eliminatorWindow==0 || eliminatorWindow==fullList.size()-1)
				        {
						     if(eliminatorWindow==0 && ((countOne==0 && countOne==countTwo) || countTwo<countOne))
						     {
						    	 System.out.print("Index [" + countOne + "][" + countTwo + "]: ");
						    	 seater++;
							     System.out.println(eachRow[countOne][countTwo]=0); 
						     }else if (eliminatorWindow==fullList.size()-1 && (eachRow[countOne].length-1==countTwo ))
                             {
						    	 seater++;
						    	 System.out.print("Index [" + countOne + "][" + countTwo + "]: ");
							     System.out.println(eachRow[countOne][countTwo]=0); 
                             }else if( countTwo>0  && eachRow[countOne].length-1 != countTwo)
                            		 {
                            	 System.out.print("Index [" + countOne + "][" + countTwo + "]: ");
        					     System.out.println(eachRow[countOne][countTwo]=99); 
                            		 }
						        
				        }else if (countTwo>0  && eachRow[countOne].length-1 != countTwo ){
				        	
				        System.out.print("Index [" + countOne + "][" + countTwo + "]: ");
					     System.out.println(eachRow[countOne][countTwo]=99); 
				        }
				       
				      }
				    }
			   eliminatorWindow++;
			   System.out.println();
		   }
		
		
	       /* System.out.println("2D LinkedHashSet :");
	   
	   Scanner scanner = new Scanner(System.in);
       int n=scanner.nextInt();*/
	        /* for (int i=0;i<2;i++)
	         {*/
	        	  
	      //  Scanner scan = new Scanner(System.in);
	       
	      //  System.out.println("Enter The Number Of Matrix Rows");
	         
	   /*     int matrixRow = scan.nextInt();
	         
	        System.out.println("Enter The Number Of Matrix Columns");
	         
	        int matrixCol = scan.nextInt();
	         
	        int[][] matrixCreator = new int[matrixRow][matrixCol];
	        
	        enterMatrixData(scan, matrixCreator, matrixRow, matrixCol);
	        
	        // Print Matrix Data
	        printMatrix(matrixCreator, matrixRow, matrixCol);
	        fullList.add(matrixCreator);*/
	     //    }
	    }


	private static List<int[][]> aisieSeatGenerator(List<int[][]> fullList2, int seater) {
		// TODO Auto-generated method stub
		
		for(int[][] eachRow: fullList)
		   {
			   for (int countOne = 0; countOne < eachRow.length; countOne++) {
				      for (int countTwo = 0; countTwo < eachRow[countOne].length; countTwo++) {
				    	  
				      }
				      }
		   }
		return fullList;
	}
	
		
		
		
		
	

}