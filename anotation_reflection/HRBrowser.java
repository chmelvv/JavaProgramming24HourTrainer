import java.util.*;

class HRBrowser{
	 
	  @MyJDBCExecutor (sqlStatement="Select * from Employee")
	  public List<String> getEmployees(){
		  // Generate the code to get the the data from DBMS,
		  // place them in ArrayList and return them to the 
		  // caller of my getEmployees
		  		  return new ArrayList<String>();
		  }

	  @MyJDBCExecutor (sqlStatement="Update Employee set bonus=1000", 
			            transactionRequired=true, 
			            notifyOnUpdates=true)
	  
	  public void updateData(){
		  // JDBC code to perform transactional updates  and
		  // notifications goes here
		  }
	}
