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
## 3.17

- What have you reviewed today? 
	- B tree and B+ tree
		- B-Tree is known as a self-balancing tree as its nodes are sorted in the inorder traversal. In B-tree, a node can have more than two children. B-tree has a height of logM N (Where ‘M’ is the order of tree and N is the number of nodes). And the height is adjusted automatically at each update. In the B-tree data is sorted in a specific order, with the lowest value on the left and the highest value on the right. To insert the data or key in B-tree is more complicated than a binary tree.
		- There are some conditions that must be hold by the B-Tree:
			- All the leaf nodes of the B-tree must be at the same level.
			- Above the leaf nodes of the B-tree, there should be no empty sub-trees.
			- B- tree’s height should lie as low as possible.
		- ![image](https://user-images.githubusercontent.com/57826324/158929223-26ac08ce-73a5-4da4-9417-ab056760fad6.png)
		- B+ tree eliminates the drawback B-tree used for indexing by storing data pointers only at the leaf nodes of the tree. Thus, the structure of leaf nodes of a B+ tree is quite different from the structure of internal nodes of the B tree. It may be noted here that, since data pointers are present only at the leaf nodes, the leaf nodes must necessarily store all the key values along with their corresponding data pointers to the disk file block, in order to access them. Moreover, the leaf nodes are linked to providing ordered access to the records. The leaf nodes, therefore form the first level of the index, with the internal nodes forming the other levels of a multilevel index. Some of the key values of the leaf nodes also appear in the internal nodes, to simply act as a medium to control the searching of a record.
		- ![image](https://user-images.githubusercontent.com/57826324/158929382-f0c2c182-bfb1-4566-996a-5331a3921f67.png)
	- stream API
	- Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
	```java
	public static void main(String args[])
  {
  
    // create a list of integers
    List<Integer> number = Arrays.asList(2,3,4,5);
  
    // demonstration of map method
    List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
    System.out.println(square);
  
    // create a list of String
    List<String> names =
                Arrays.asList("Reflection","Collection","Stream");
  
    // demonstration of filter method
    List<String> result = names.stream().filter(s->s.startsWith("S")).
                          collect(Collectors.toList());
    System.out.println(result);
  
    // demonstration of sorted method
    List<String> show =
            names.stream().sorted().collect(Collectors.toList());
    System.out.println(show);
  
    // create a list of integers
    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
  
    // collect method returns a set
    Set<Integer> squareSet =
         numbers.stream().map(x->x*x).collect(Collectors.toSet());
    System.out.println(squareSet);
  
    // demonstration of forEach method
    number.stream().map(x->x*x).forEach(y->System.out.println(y));
  
    // demonstration of reduce method
    int even =
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
    System.out.println(even);
  }
- What new things you have learned today?
	- OSI model
		- 7 application layer
human computer interaction layer, where application can access the network services
HTTP, (Hypertext Transfer Protocol)
FTP, File Transfer Protocol
POP, Post Office Protocol
SMTP, Simple Mail Transfer Protocol
DNS, Domain Name System

		- 6, Presentation Layer,
ensure that data is in usable format an dis where data encryption occurs

		- 5, Session 
maintain connection and is for controlling ports and sessions

		- 4, transport
transmits data using transmission protocols: TCP, UDP

		- 3, network
decides which physical path the data will take

		- 2, data link layer
define the format of data on the network

		- 1, physical layer,
transmit raw bit stream voer physical medium

	- TCP/IP model
	- <img width="574" alt="image" src="https://user-images.githubusercontent.com/57826324/158930216-b5356138-c3c1-4ded-aec9-403cf87c83ad.png">

	- HTTP
	- <img width="698" alt="image" src="https://user-images.githubusercontent.com/57826324/158930297-e0c403b4-9beb-4c7e-abae-8b96147e4b83.png">

- What is your learning plan tomorrow?
	- Hibernate
	- keep learning on web application
## 3.18

- What have you reviewed today?
	- Hibernate
	- Hibernate is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications. Object relational mapping is based on the containerization of objects and the abstraction that provides that capacity.
	- <img width="608" alt="image" src="https://user-images.githubusercontent.com/57826324/159104128-35b89277-7435-4b31-8b07-ac2299860e2f.png">
	- config file
	- <img width="622" alt="image" src="https://user-images.githubusercontent.com/57826324/159104143-40aa2376-cd50-482f-96e3-6ddecc3b6a18.png">
	- session fectory
	- <img width="618" alt="image" src="https://user-images.githubusercontent.com/57826324/159104156-5089a1e2-1be9-4786-a906-e2c9dca7a72a.png">
	- entity
	- <img width="609" alt="image" src="https://user-images.githubusercontent.com/57826324/159104177-be042da7-381f-4e23-a583-a043f4513829.png">
	- session
	- <img width="598" alt="image" src="https://user-images.githubusercontent.com/57826324/159104202-5744e44d-ceb3-4f0a-a4d4-34958b1e6f74.png">
- What new things you have learned today?
	- The whole process for building a java web application
	- <img width="618" alt="image" src="https://user-images.githubusercontent.com/57826324/159104245-0f4febbb-9ceb-4f11-a6bb-cf00aaceab5b.png">
	- tomecat files in linux system(you can also build it in different system, but the linux is the most popular one.
		- bin: startup, shutdown and other scripts and executables
		- common: common classes that catalina and web app can use
		- conf: config file
		- logs: app logs
		- temp: temporary variable and files
		- webapps: contains the web application
		- work: temporary storage
	- servlet lifecycle
	- <img width="358" alt="image" src="https://user-images.githubusercontent.com/57826324/159104312-b12f778d-b4fe-436e-ba05-da6d3be0be69.png">
	- MVC arcitecture
	- sessions and cookies
- What is your learning plan tomorrow?
	- keep reviewing rest of Hibernate
	- get familiar with the whole process of java web application
	- tomcat, servlet, JEE

## 3.21

- What have you reviewed today?
	- Servlet
	- Servlets are the Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver. 
Properties of Servlets are as follows:
		- Servlets work on the server-side.
		- Servlets are capable of handling complex requests obtained from the webserver.
	- <img width="963" alt="image" src="https://user-images.githubusercontent.com/57826324/159387384-ec097755-bd2c-4466-902e-e97ebe49a712.png">
	- Execution of Servlets basically involves six basic steps: 

		- The clients send the request to the webserver.
		- The web server receives the request.
		- The web server passes the request to the corresponding servlet.
		- The servlet processes the request and generates the response in the form of output.
		- The servlet sends the response back to the webserver.
		- The web server sends the response back to the client and the client browser displays it on the screen.
	- lambda expresion
	- Lambda is introduced from Java 8 to implify the creation of objects from funcitonal interfaces.
Since all the functional interfaces have only 1 abstract method, the lambda acually is used to represent the implementation of that only 1 method.
Lambda doesn't have name, the parameter list and return type define the lambda.
Lambda looks like this:
() -> {}
() part is the parameter list of the abstract method.
{} is the body of the abstract method.
	- functional Interface
		- Functional interface is a kind of interface that has only 1 abstract method.
		- Functional interface can have multiple default methods and static methods.
		- for example:
```java

@FunctionalInterface // annotation is optional
public interface Doable {

  // this is the only abstract method. It doesn't have body.
  int doIt(String event);

  default int defaultMethodDemo1(){ // this is a default method, it has body.
    System.out.println("This is Java");
  }

  static int staticMethodDemo2() {. // this is a static method, it has body.
    System.out.println("Static");
  }
  
}

```
- What new things you have learned today?
	- Spring
		- IoC(Inversion of Control)
		- Refers to the core container that uses the DI or IoC pattern to implicitly provide an object reference in a class during runtime. This pattern acts as an alternative to the service locator pattern. The IoC container contains assembler code that handles the configuration management of application objects.
The Spring framework provides two packages, namely org.springframework.beans and org.springframework.context which helps in providing the functionality of the IoC container.
	- why spring use dependency injection?
	- Dependency injection supports these goals by decoupling the creation of the usage of an object. That enables you to replace dependencies without changing the class that uses them. It also reduces the risk that you have to change a class just because one of its dependencies changed.
	- <img width="167" alt="Screen Shot 2022-03-21 at 14 32 44" src="https://user-images.githubusercontent.com/57826324/159400702-c80603a1-b016-48ef-8d9c-694bd7c6d8e9.png">
	- springboot layout
	- controller -> service -> DAO
- What is your learning plan tomorrow?
	- how to create Spring and Servlet projects
	- sharpen understanding in spring
