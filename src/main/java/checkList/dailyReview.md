# Daily Report
## 3.9

- What have you reviewed today?
- Focus on the questions that missed in final evaluation.
    - Core Java
      - future vs CompletableFuture
       https://www.linkedin.com/pulse/java-8-future-vs-completablefuture-saral-saxena/
      - finalize keyword
      	- finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
      - serializatiion and deserialization
      	- Serialization is a mechanism of converting the state of an object into a byte stream. 
      	Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
				This mechanism is used to persist the object.
    - Database
      - CAP
      - ![image](https://user-images.githubusercontent.com/57826324/158730854-1fde9dbf-1be3-45dd-a495-5de29c64c742.png)
      - what is vertical scaling, what is horizontal scaling?
      - When new resources are added in the existing system to meet the expectation, it is known as vertical scaling. 
Consider a rack of servers and resources that comprises of the existing system. (as shown in the figure). Now when the existing system fails to meet the expected needs, and the expected needs can be met by just adding resources, this is considered as vertical scaling. 
Vertical scaling is based on the idea of adding more power(CPU, RAM) to existing systems, basically adding more resources.
Vertical scaling is not only easy but also cheaper than Horizontal Scaling. It also requires less time to be fixed. 
			When new server racks are added in the existing system to meet the higher expectation, it is known as horizontal scaling. 
Consider a rack of servers and resources that comprises of the existing system. (as shown in the figure). Now when the existing system fails to meet the expected needs, and the expected needs cannot be met by just adding resources, we need to add completely new servers. This is considered as horizontal scaling.
Horizontal scaling is based on the idea of adding more machines into our pool of resources
Horizontal scaling is difficult and also costlier than Vertical Scaling. It also requires more time to be fixed. 
- What new things you have learned today? 
  - Transaction
    - ACID principle
    	- ACID is an acronym that refers to the set of 4 key properties that define a transaction: 
    	Atomicity, Consistency, Reliability, and Durability. If a database operation has these ACID properties, 
    	it can be called an ACID transaction, and data storage systems that apply these operations are called transactional systems.
  - Concurrency
    - dirty read
    - non-repeatable read
    - phantom read
- What is your learning plan tomorrow?
  - dive into multi thread topic in core java
  - MongoDB
## 3.10

- What have you reviewed today?
	- Core Java
		![Picture1](https://user-images.githubusercontent.com/57826324/158722639-3f3bb223-6db6-44a9-b8b2-6cbf3788ff88.png)
		- assert keyword
		- instanceof keyword
	- Database
		- MongoDB
- What new things you have learned today?
	- thread creation
		- enxtends Thread
		- inplements Runnable and Callable
		- thread pool 
- What is your learning plan tomorrow?
	- keep learning multi thread
	- Redis
## 3.11

- What have you reviewed today? 
	- Core Java
		- JVM
			- JVM architecture
			- Class loader
			- Runtime data area
			- Excution engine
	- Database
		- Redis
- What new things you have learned today?
	- thread states
	- ![Picture2](https://user-images.githubusercontent.com/57826324/158724361-a26b570a-0cf8-4e49-ad63-f618d0324aa0.png)
		- new runnable blocked waiting timed_waiting terminated 
- What is your learning plan tomorrow?
	- OOP principle review
	- sql query related
	- new topic given in next week(JDBC)
## 3.14

- What have you reviewed today?
	- Core Java 
		- OOP principle
			- abstraction
			- Abstraction is the concept of object-oriented programming that “shows” only essential attributes and “hides” unnecessary information. 
			The main purpose of abstraction is hiding the unnecessary details from the users.
			- encapsulation
			- Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
			- inhertance
			- Inheritance is one of the key features of OOP that allows us to create a new class from an existing class. 
			The new class that is created is known as subclass (child or derived class) and the existing class from where the 
			child class is derived is known as superclass (parent or base class).
			- polymorphism
				- Overloading in Java is the ability to define more than one method with the same name in a class. 
				The compiler is able to distinguish between the methods because of their method signatures.
				- The ability of a subclass to override a method allows a class to inherit from a superclass whose behavior is "close enough" and then
				 to modify behavior as needed. The overriding method has the same name, number and type of parameters, and return type as the method 
				 that it overrides.
	- Database
		- sql different keys
			- primary key
			- A primary key is a combination of fields which uniquely specify a row. It’s a special kind of unique key.  cannot be NULL/duplicate.
			- foreign key
			- It is a/more columns in a table whose values correspond to the values of the primary key in another table, accept null/duplicate
			- unique key
			- A Unique key is used to prevent duplicate values in a column. A table can have only one primary key but it can have multiple unique keys
			- candidate key
			- It’s also a unique key to identify a record uniquely in a table but a table can have multiple candidate keys. Can null
			- composite key
			- A Composite key is a Candidate key or Primary key that consists of more than one attribute.
		- join
			- left join
			- LEFT JOIN includes all records from the left side and matched rows from the right table, combine column
			- inner join
			- returns rows when there is a match in both tables.(combine column)
		- union
		- It is used to combine the results of two tables, and it eliminates duplicate rows from the tables. (combine row
		- index
		- an index is a pointer to data in a table
- What new things you have learned today?
	- JDBC
		- JDBC stands for Java Database Connectivity, is a set of Java API for accessing the relational databases from Java program. 
		The Java API enables the programmers to execute the SQL statements against the JDBC complaint database
		- JDBC Driver is a software component that enables java applications to interact with the database.
		- connection
		- There are three types of statements in JDBC, Statement, Prepared Statement Callable Statement.
			- A statement object is used to send a simple SQL statement to the database with no parameters. If n rows need to be inserted, 
			 then the same statement gets compiled n number of times.
			- The Prepared Statement interface extends the Statement interfaces. It represents a precompiled SQL statement which can be executed multiple times.
			  This accepts parameterized SQL quires and you can pass 0 or more parameters to this query. Initially, this statement uses place holders “?” 
				instead of parameters, later on, we can pass arguments to these dynamically using the set methods of the PreparedStatement interface. 
			- The CallableStatement interface provides methods to execute stored procedures. Since the JDBC API provides a stored procedure SQL escape syntax, 
			we can call stored procedures of all RDBMS in a single standard way. It do provide a better performance due to pre-compilation.
		- sql query 
- What is your learning plan tomorrow?
	- reviewing checklist, planning to review exception, generics and IO stream.
	- learn hibernate
## 3.15

- What have you reviewed today? 
	- Core Java
		- volatile keyword
			- Visibility
			- Visibility is mean when multiple threads visit a same variable, if one thread modified that variable, 
			all the other threads can see the changed value of the variable immediately. By using volatile keyword, 
			the variable under the volatile will be immediately updated to the main memory once it been modified. 
			Every time before the volatile variable been used, it will always fresh and updated from main memory. 
			Thus, we can use volatile to make sure the visibility during the variable operation in multi-threading environment.
			- Atomicity
			- Atomicity means that an operation cannot be terminate with any reason. The operation must be all done, or not done. 
			Volatile cannot grantee the atomicity.
			- Instruction Ordering
			- Instruction Ordering means that the order of program execution follow the same order as the code. Volatile can 
			forbid the order of instructions be optimized by CPU which can grantee the exactly same expected order of instruction from our code.
			- volatile + CAS = thread safe
		-  generics
			- Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) 
			to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with 
			different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
			- Why Generics?
			- The Object is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety. 
			Generics add that type of safety feature. We will discuss that type of safety feature in later examples.
			Generics in Java are similar to templates in C++. For example, classes like HashSet, ArrayList, HashMap, etc., 
			use generics very well. There are some fundamental differences between the two approaches to generic types. 
		-  IO stream
		-  ![Picture3](https://user-images.githubusercontent.com/57826324/158739000-a4f3744f-3c60-4c00-9ceb-205d419be8cf.png)

- What new things you have learned today?
	- Hibernate
		-  ORM
		-  ORM means object relation mapping which helps you to convert and store your object type data into the database directly.
		-  Disadvantages of ORM
				- Slow performance in case of large batch updates
				- Little slower than JDBC
		-  Hibernate framework
			- config file
			- session factory
			- entity
			- session
		- cache
			- first level: session level (open by default)
			- second level: session factory level (close by default)
- What is your learning plan tomorrow?
	- review JDBC and Hibernate
	- learning new concept in core java, reflection
	- design patten learning
## 3.16

- What have you reviewed today? 
	- JDBC
		- general and CRUD operation in JDBC (take update for example)
	```java

public class JdbcSelectTest2 {

	public static void main(String[] args) {
   	Connection conn = null;
   	Statement stmt = null;

    	try {
        	// 1, allocate a connection object, for connecting to the database
        	conn = DriverManager.getConnection(
                	JdbcConfig.getUrl(),
                	JdbcConfig.getUser(),
                	JdbcConfig.getPassword()
        	);
        	// 2, allocate a statement object, based on the connection
        	stmt = conn.createStatement();

        	// 3, write sql query, execute query
        	String strSelect = "select title, price, qty from books";

        	System.out.println("The sql query is " + strSelect);
        	System.out.println();

        	ResultSet resultSet = stmt.executeQuery(strSelect);
        	System.out.println("The records selected are:");
        	int rowCount = 0;

        	// 4, process the query result
        	while (resultSet.next()) {
            	String title = resultSet.getString("title");
            	String price = resultSet.getString("price");
            	int qty = resultSet.getInt("qty");
            	System.out.println(title + ", " + price + ", " + qty);
            	rowCount++;
        	}
        	System.out.println("Totel number of records = " + rowCount);

    	} catch (SQLException throwables) {
        	throwables.printStackTrace();

    	// 5, close the statement and connection object to free up the resources
    	} finally {
        	try {
            	if (stmt != null) stmt.close();
            	if (conn != null) conn.close();

        	} catch (SQLException throwables) {
            	throwables.printStackTrace();
        	}

    	}
	}
}
	```

	```java
	public class JdbcUpdateTest {
    public static void main(String[] args) {
        try(
                Connection conn  = DriverManager.getConnection(
                        JdbcConfig.getUrl(),
                        JdbcConfig.getUser(),
                        JdbcConfig.getPassword()
                );
                Statement stmt = conn.createStatement();
        ){
            String strUpdate = "update books set price = price * 2, qty = qty - 1 where title = 'Java'";

            System.out.println("The sql query is " + strUpdate);
            System.out.println();

            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdate + " records are updated");


            String strSelect = "select * from books where title = 'Java'";
            System.out.println("the sql query is " + strSelect);
            ResultSet resultSet = stmt.executeQuery(strSelect);

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String price = resultSet.getString("price");
                int qty = resultSet.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
	```

- What new things you have learned today? 
	- reflection API
	- using reflection api, developers don't need to know the class utill at the runtime. Reflection gives us information 
	about the class to which an object belongs and also the methods of that class which can be executed by using the object. 
	Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.
Combine with annotations, using reflection api can achieve lots of framework jobs. 
	- SOLID principle
		- Single-responsiblity Principle
  	- Open-closed Principle
		- Liskov Substitution Principle
		- Interface Segregation Principle
		- Dependency Inversion Principle
	- design patten
		- singleton: Guarantees only one instance of a class and provides a global access point
		- factory: Create different instances under different conditions
		- builder: Used to create complex composite objects
		- proxy: Provides a proxy for other objects to control access to this object
- What is your learning plan tomorrow?
	- Java8 new feature stream API
	- Hibernate
	- web application materials
