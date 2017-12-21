// Frank Chen
// APCS1 pd1
// HW57 -- How Deep Does the Rabbit Hole Go?
// 2017-12-19

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
  //constant for default matrix size
  private final static int DEFAULT_SIZE = 2;

  private Object[][] matrix;

  //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
  public Matrix( ) 
  {
	  matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
  }


  //constructor intializes an a*a matrix
  public Matrix( int a ) 
  {
	  matrix = new Object[a][a];
  }


  //return size of this matrix, where size is 1 dimension
  private int size() 
  {
	  return matrix.length;
  }


  //return the item at the specified row & column   
  private Object get( int r, int c ) 
  {
	  return matrix[r][c];
  }


  //return true if this matrix is empty, false otherwise
  private boolean isEmpty() 
  {
	  if (get(1,1) == null) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }


  //overwrite item at specified row and column with newVal
  //return old value
  private Object set( int r, int c, Object newVal ) 
  {
	  Object value = get(r,c);
	  matrix[r][c] = newVal;
	  return value;
  }


  //return String representation of this matrix
  // (make it look like a matrix)
  public String toString() 
  {
	  String str = "";
	  for (int i = 0; i < size(); i++){
		  for (int x = 0; x < size(); x++) {
			  str += get(i,x) + " ";
		  }
		  str += "\n";
	  }
	  return str;
  }


  //override inherited equals method
  //criteria for equality: matrices have identical dimensions,
  // and identical values in each slot
  public boolean equals( Object rightSide ) 
  {
	  for (int i = 0; i < size(); i++) {
		  for (int x = 0; x < size(); x++) {
			  if (this.get(i,x).equals( ((Matrix)rightSide).get(i,x)) ) {
				  return true;
			  }
		  }
	  }
	  return false;
  }


  //swap two columns of this matrix 
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapColumns( int c1, int c2  ) 
  {
	  for (int i = 0; i < size(); i++) {
		  set(i, c1, set(i, c2, get(i, c1)));
	  }
  }


  //swap two rows of this matrix 
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapRows( int r1, int r2  ) 
  {
	  for (int i = 0; i < size(); i++) {
		  set(r1, i, set(r2, i, get(r1, i)));
	  }
  }
  
  
  //returns copy of row r
  public Object[] getRow( int r ) 
  {
	  return matrix[r];
  }//O(1)
  
  //returns copy of column r
  public Object[] getCol( int r )
  {
	  Object[] col = new Object[size()];
	  for (int i = 0; i < size(); i++)  {
		  col[i] = get(i,r);
	  }
	  return col;
  }


  //replaces row r with 1D array newRow
  //returns old row
  public Object [] setRow( int r, Object[] newRow ) 
  {
	  Object[] temp = getRow(r);
	  matrix[r] = newRow;
	  return temp;
  }//O(1)


  public Object [] setCol( int c, Object[] newCol ) 
  {
	  Object[] temp = getCol(c);
	  for (int i = 0; i < size(); i++) {
		  matrix[i][c] = newCol[i];
	  }
	  return temp;
  }//O(1)


  public void transpose() 
  {
	  for (int i = 0; i < size(); i++) {
		  for (int x = i + 1; x < size(); x++) {
			  Object temp = matrix[i][x];
			  matrix[i][x] = matrix[x][i];
			  matrix[x][i] = temp;
		  }
	  }
  }//O(?)


  //main method for testing
  public static void main( String[] args ) 
  {
	  System.out.println();
	  
	  Matrix mat = new Matrix();
	  mat.set(0,0,1);
	  mat.set(0,1,2);
	  mat.set(1,0,3);
	  mat.set(1,1,4);
	  System.out.println(mat);
	  
	  Matrix rix = new Matrix();
	  rix.set(0,0,5);
	  rix.set(0,1,6);
	  rix.set(1,0,7);
	  rix.set(1,1,8);
	  System.out.println(rix);
	  
	  System.out.println("Equilvalent?: " + (mat.equals(rix)) + "\n");
	  
	  System.out.println("Swapped Columns: 0 and 1");
	  mat.swapColumns(0,1);
	  System.out.println(mat);
	  
	  System.out.println("Swapped Rows: 0 and 1");
	  rix.swapRows(0,1);
	  System.out.println(rix);
  }

}//end class Matrix
