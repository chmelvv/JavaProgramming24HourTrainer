package com.practicaljava.lesson22;
// Class EmployeeList displays Employees from the table EMP 
// using JDBC drivers of type 4

import org.apache.derby.jdbc.ClientConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.*;

class EmployeeListViaDataSource {

  public static void main(String argv[]) {
   Connection conn=null;
   Statement stmt=null;
   ResultSet rs=null;
   ClientConnectionPoolDataSource cpds = new ClientConnectionPoolDataSource();
   cpds.setMaxStatements(5);

      // Set other DataSource properties
      cpds.setDatabaseName("derby");
      cpds.setCreateDatabase("Lesson22");
      cpds.setServerName("localhost");
      cpds.setPortNumber(1527);
// http://db.apache.org/derby/docs/10.7/adminguide/radminnsdatasourcexmp.html
      // http://db.apache.org/derby/docs/10.7/adminguide/cadminnsdatasources.html
   try {
      PooledConnection pc = cpds.getPooledConnection();
       conn = pc.getConnection();
       PreparedStatement ps = conn.prepareStatement(
               "select * from myTable where id = ?");
       ps.close(); // Inserts or returns statement to the cache
       conn.close();

// The next logical connection can gain from using the cache.
       conn = pc.getConnection();

// This prepare causes a statement to be fetched from the local cache.
       PreparedStatement ps = con.prepareStatement(
               "select * from myTable where id = ?");
     //  ...

// To dispose of the cache, close the connection.
       pc.close();

   } catch (SQLException e) {
     e.printStackTrace();
   }
//========================================================================
//      try {
//    // Load the JDBC driver
//	// This can be skipped for Derby, but derbyclient.jar has to be in the CLASSPATH
//    // Class.forName("org.apache.derby.jdbc.ClientDriver");
//
//    conn = DriverManager.getConnection( "jdbc:derby://localhost:1527/Lesson22");
//
//    // Build an SQL String
//    String sqlQuery = "SELECT * from Employee";
//
//    // Create a Statement object
//    stmt = conn.createStatement();
//
//    // Execute SQL and get obtain the ResultSet object
//    rs = stmt.executeQuery(sqlQuery);
//
//    // Process the result set - print Employees
//    while (rs.next()){
//    	 int empNo = rs.getInt("EMPNO");
//       	 String eName = rs.getString("ENAME");
//         String job = rs.getString("JOB_TITLE");
//	     System.out.println(""+ empNo + ", " + eName + ", " + job );
//    }
//
//   } catch( SQLException se ) {
//      System.out.println ("SQLError: " + se.getMessage ()
//           + " code: " + se.getErrorCode ());
//
//   } catch( Exception e ) {
//      System.out.println(e.getMessage());
//      e.printStackTrace();
//   } finally{
//       // clean up the system resources
//       try{
//	   rs.close();
//	   stmt.close();
//	   conn.close();
//       } catch(Exception e){
//           e.printStackTrace();
//       }
//   }
}
}
