import java.lang.reflect.*;
//D:\workspace\JavaProgramming24HourTrainer\anotation_reflection>java -cp . MyJDBCAnnotationProcessor HRBrowser
//Method: getEmployees. Parameters of MyJDBCGenerator are: sqlStatement=Select * from Employee, notifyOnUpdates=false, transactionRequi
//		Method: updateData. Parameters of MyJDBCGenerator are: sqlStatement=Update Employee set bonus=1000, notifyOnUpdates=true, transaction

public class MyJDBCAnnotationProcessor {


	public static void main(String[] args) {
		// TODO add a check for the number of command line arguments 
		// has to be the name of the class to load.
		
		String classWithAnnotation = args[0];
		
		//Load the provided class
		try {
			Class loadedClass = Class.forName(classWithAnnotation);
			

			// Get references to class methods 
			Method[] methods = loadedClass.getMethods();
			
			// Check every method of the class.If the annotation is present,
			// print the values of its parameters
			for (Method m: methods){
				if (m.isAnnotationPresent(MyJDBCExecutor.class)){
					MyJDBCExecutor jdbcAnnotation = m.getAnnotation(MyJDBCExecutor.class);
					
					System.out.println("Method: " + m.getName() + 
							". Parameters of MyJDBCGenerator are: " + 
							"sqlStatement="+ jdbcAnnotation.sqlStatement() +
							", notifyOnUpdates="+ jdbcAnnotation.notifyOnUpdates() +
							", transactionRequired="+ jdbcAnnotation.transactionRequired());			
				}
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
