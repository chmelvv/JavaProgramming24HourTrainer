package com.practicaljava.lesson22;
// http://db.apache.org/derby/docs/10.7/adminguide/radminnsdatasourcexmp.html
// http://db.apache.org/derby/docs/10.7/adminguide/cadminnsdatasources.html

import org.apache.derby.jdbc.ClientConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.*;

class EmployeeListViaDataSource {

  public static void main(String argv[]) {
   Connection con=null;
   ResultSet rs=null;
   ClientConnectionPoolDataSource cpds = new ClientConnectionPoolDataSource();
   cpds.setMaxStatements(5);

      // Set other DataSource properties
      cpds.setDatabaseName("Lesson22");
      cpds.setServerName("localhost");
      cpds.setPortNumber(1527);

   try {
      PooledConnection pc = cpds.getPooledConnection();
       con = pc.getConnection();

       PreparedStatement ps = con.prepareStatement(
               "select * from Employee where empno = ?");
       int[] employees = {7369, 7499, 7521};

       for (int i=0;i<employees.length; i++) {
            // pass the array’s value that substitutes the ?
           ps.setInt(1, employees[i]);
           rs = ps.executeQuery();
           while (rs.next()){
               int empNo = rs.getInt("EMPNO");
               String eName = rs.getString("ENAME");
               String job = rs.getString("JOB_TITLE");
               System.out.println(""+ empNo + ", " + eName + ", " + job );
           }
       }

       ps.close(); // Inserts or returns statement to the cache
       con.close();

   } catch (SQLException e) {
     e.printStackTrace();
   }
}
}
