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
## 3.22

- What have you reviewed today?	
	- lifecycle of multi-thread
		- New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
		- Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
		- Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
		- Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
		- Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.
	- four ways to create a thread: extends thread class, implaments runnable, implements callable, threadPoolExcuter
	- Thread pool 
		- Threadpool is a collection of pre-initialized, idle threads that are ready to be given task. The Threads don't terminate rightaway when the tasks are done, when one thread completes the work, the thread becomes idle, ready to be dispatched to another task.
	- ![Picture1](https://user-images.githubusercontent.com/57826324/159596337-b690aaca-6280-421c-b191-6cd3c5b4372c.png)
	- there are 5 thread in the thread pool, in the core part, we have 2 running thread and there are extra 3 thread area inside the thread pool. out side the thread pool, we have a queue for other threads, there are 4 spaces for up coming thread. abort policy, callerRunPolicy, discardPolicy, and discardOldestPolicy
	- Thread Communication
		- lock
		- volatile keyword
		- wait/notify
- What new things you have learned today?
	- agile style
	- In software development, agile (sometimes written Agile) practices include requirements discovery and solutions improvement through the collaborative effort of self-organizing and cross-functional teams with their customer(s)/end user(s),adaptive planning, evolutionary development, early delivery, continual improvement, and flexible responses to changes in requirements, capacity, and understanding of the problems to be solved.
Popularized in the 2001 Manifesto for Agile Software Development, these values and principles were derived from and underpin a broad range of software development frameworks, including Scrum and Kanban.
	- waterfall style
	- The waterfall model is a breakdown of project activities into linear sequential phases, where each phase depends on the deliverables of the previous one and corresponds to a specialization of tasks. The approach is typical for certain areas of engineering design. In software development, it tends to be among the less iterative and flexible approaches, as progress flows in largely one direction ("downwards" like a waterfall) through the phases of conception, initiation, analysis, design, construction, testing, deployment and maintenance.
	- sprint style
	- one sprint is about 1 or 2 weeks, in each sprint, we have tickets about project, tech lead or cto will decide each tickets score and assign to developer
	- stand up stratge
	- agile tools
		- KANBAN, pivotal, JIRA
	- CI/CD(continue intergration, continue deployment)
	- new a document in checklist for CICD
- What is your learning plan tomorrow?
	- servlet project creation flow
	- Collection review

## 3.23

- What have you reviewed today?
	- ArrayList vs LinkedList
	-  ArrayList is implemented based on a dynamically resizable array; linked list is based on a linear data structure in which elements are not stored in a contiguous memory location, each element is linked using pointers.
for get operation, ArrayList is faster than LinkedList, because we can access element by index, linked list however, need to be traversed by pointers to access an element
for add and remove operations, LinkedList is faster than ArrayList because ArrayList might need to ensure the array capacity and copy the array internally,
ArrayList -> add: O(1) at best, O(n) at worst; remove(): O(n)
LinkedList -> add(): O(1) add(index, elem): O(n); remove():O(n)
	- HashMap
	- Hashmap is a data structure that stores key-value mapping pairs, internally it converts each key to a hashcode which is stored inside a bucket of an array with default size of 16.
HashMap is internally implemented using array + linked list + redblacktree (jdk1.8 added redblacktree). When linked list size is at TREEIFY_THRESHOLD (>8), it would convert the linked list to a redblacktree, when nodes of redblacktree is less than UNTREEIFY_THRESHOLD (<6), it would convert back to linkedlist.
	- HashMap vs HashTable
	- They both implement the Map interface.
HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value.
HashTable is thread-safe, while HashMap is not.( synchronized vs unsynchronized)
	- HashMap vs concurrentHashMap
	- Instead of locking the whole map like HashTable, ConcurrentHashMap allows concurrent read and thread-safe update operations. To perform read operation thread won’t require any lock but to perform update operation thread require a lock, but it is the lock of a bucket, by default ConcurrentHashMap maintain 16 locks for a map.
	- LinkedHashMap
	- LinkedHashMap is a map data structure whose keys are preserved in insertion order, internally implemented by the doubly linked list, which means each node entry has two more pointers which point to the previous node and the next node to track the insertion order.
	- TreeMap
	- TreeMap is a map data structure whose keys are ordered by natural ordering or a comparator. It has O(logn) lookup and insertion time. Internally it is implemented by a red black tree.
- What new things you have learned today?
	- Spring AOP
	- Aspect oriented programming 
In AOP, aspects enable the modularization of concerns such as transaction management, logging or security that cut across multiple types and objects (cross cutting corners)
	- Key Terminology

		- Aspect: 
an aspect is a class that implements enterprise application concerns that cut across multiple classes, such as transaction management, logging, security
Aspect are implemented regular classes using Spring XML configuration
Regular classes annotated with @Aspect annotation (@AspectJ style)


		- Join Point: 
a point during the execution of a program, such as the execution of a method or the handling of an exception 

		- PointCut:
a predicate that matches join points, 
Advice is associated with a pointcut expression and runs at any join point matched by the pointcut
SPring framework uses the AspectJ Pointcut expression language


		- Advice
before: advices that executes before a join point
after: advice to be executed regardless of the means by which a join point exits (normal or exceptional return)
after return: advice to be executed after a join point completes
after throwing: advice to be executed if a method exits by throwing an exception
around: advice that surrounds a join point such as a method invocation


	- controller -> service -> DAO (repository) -> connect database
	- finish one spring AOP demo and push it to a new repo on github

- What is your learning plan tomorrow?
	- keep reviewing spring framework
	- get deeper in Spring IOC and Spring AOP

## 3.24

- What have you reviewed today?
	- heap vs stack in jvm
		- stack is used to store the order of method execution and local variables while the heap memory stores the objects and it uses dynamic memory allocation and deallocation.
	- can we force gc
		- Call the System. gc() command.
		- Call the getRuntime(). gc() command.
		- Use the jmap command.
		- Use the jcmd command.
		- Use JConsole or Java Mission Control.
	- JVM: Platform for executing the Java byte code.
	- JRE: JRE = Java Virtual Machine (JVM) + Libraries to run the application
	- JDK:Java Runtime Environment (JRE) + Development tools
	- Constructor: is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
	- getter/setter: getter and setter are two conventional methods that are used for retrieving and updating value of a variable. By using getter and setter, the programmer can control how his important variables are accessed and updated in a correct manner, such as changing value of a variable within a specified range.
- What new things you have learned today?
	- Spring MVC
	- MVC
	- ![Picture1](https://user-images.githubusercontent.com/57826324/160056493-23d3d9cc-3554-40cf-b9e3-24e9e8c6d06a.png)
		- model: contains the data of the application
		- controller: business logic of application. @Controller
		- View: web pages, JSP
		- front controller: in Spring MVC, dispatcher servlet
	- ![Picture2](https://user-images.githubusercontent.com/57826324/160056824-e20ecdf3-0c58-46d1-80f4-8e205cdc7168.png)

	- all incoming request is intercepted by the dispatcherServlet that work as the front controller
	- the dispatcherServlet gets an entry of handler mapping form the xml file and forwards the request to the controller
	- the controller return an object of ModelAndView
	- the dispatcherServlet checks the entry of the view resolver in xml file and invokes the specified view component.
	- spring boot
		- advantage
provide a flexible way to config the java beans, xml configuration and database transactions
batch processing and manage rest endpoints
everything is auto configed 
annotation based spring application
eases dependency management
include embedded servlet container -> Tomcat
	- Rest API Design
		- http method, http status code, http url design
	- Spring RESTful API
		- @RestController, @Controller, @Service, @Repsoitory,
@GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @RequestMapping, 
@PathVariable, @RequestParam
@RequestBody, @ResponseBody

	- Exception Handling
	- ![Picture3](https://user-images.githubusercontent.com/57826324/160057343-4f753886-5719-49b0-9190-22db338eb433.png)

- What is your learning plan tomorrow?
	- Keep reviewing the rest demo project
	- make sure each line of the code that I can understand.

## 3.25

- What have you reviewed today?
	- Spring different layer
	- ![image](https://user-images.githubusercontent.com/57826324/160291569-c18ee3eb-285a-4219-b409-8aa49d1ce52d.png)

		- controller
		- Controller is the interface that interacts with the outside world. It handles incoming HTTP requests and send response back to the caller. Based on the incoming request URL and HTTP verb (GET/POST/PUT/PATCH/DELETE), API decides which controller and action method to execute e.g. Get() method will handle HTTP GET request, Post() method will handle HTTP POST request, Put() method will handle HTTP PUT request and Delete() method will handle HTTP DELETE request for the above Web API.
		- service
		- service is the utility that defines the business logic of the application.
		- DAO
		- DAO or Data Access Object is used to interact with the database directly.
		- entity(database)
	- Restful API
		- @RestController
		- @Controller
		- @Service
		- @Repsoitory
		- @GetMapping, @PostMapping, @PutMapping,@PatchMapping, @DeleteMapping, @RequestMapping
		- @PathVariable, @RequestParam
		- @RequestBody, @ResponseBody
- What new things you have learned today?
	- HTTP Status code
	- 200	ok; 201	created, Post, Put; 202	accepted; 204	no content; 400	bad request; 401	unauthorized; 403	forbidden; 404	not found; 405	method not allowed; 500	internal server error; 501	not implemented
	- URL design
	- basic, use "/" to seprate layers
	- use "?" to implement different methods. filtering, sorting, searching
	- exception handling
		- @ExceptionHandler for local exception handling
		- @ControllerAdvice for global exception handling
	- validation
		- first way to deal with validation, we can manully write inline code for valid data;
		- or we can use annotation that provided by spring framework to handle it
		- @NotNull, @NotEmpty, @NotBlank, @Min, @Max, @Pattern, @Email …


- What is your learning plan tomorrow?
	- keep learning on Springboot and restful api, it is the most importent part of Spring
	- read restful api demo code and fully understand it.
	- JDBC and Hibernate review

## 3.28

- What have you reviewed today?
	- JDBC
	- JDBC Driver is a software component that enables java applications to interact with the database
	- java application   < — >         JDBC driver          < — >               database
	- A JDBC program comprises the following steps
		- allocate a connection object, for connecting to the database
		- allocate a statement object, based on the connection
		- write sql query, execute query
		- process the query result
		- close the statement and connection object to free up the resources
	- 1) Statement
		- Statement interface is used to execute normal SQL queries. You can’t pass the parameters to SQL query at run time using this interface. This interface is preferred over other two interfaces if you are executing a particular SQL query only once. The performance of this interface is also very less compared to other two interfaces. In most of time, Statement interface is used for DDL statements like CREATE, ALTER, DROP etc.
	- 2) PreparedStatement
		- PreparedStatement is used to execute dynamic or parameterized SQL queries. PreparedStatement extends Statement interface. You can pass the parameters to SQL query at run time using this interface. It is recommended to use PreparedStatement if you are executing a particular SQL query multiple times. It gives better performance than Statement interface. Because, PreparedStatement are precompiled and the query plan is created only once irrespective of how many times you are executing that query. This will save lots of time.
	- 3) CallableStatement
		- CallableStatement is used to execute the stored procedures. CallableStatement extends PreparedStatement. Usng CallableStatement, you can pass 3 types of parameters to stored procedures. They are : IN – used to pass the values to stored procedure, OUT – used to hold the result returned by the stored procedure and IN OUT – acts as both IN and OUT parameter. Before calling the stored procedure, you must register OUT parameters using registerOutParameter() method of CallableStatement. The performance of this interface is higher than the other two interfaces. Because, it calls the stored procedures which are already compiled and stored in the database server.
	- Hibernate
	- ORM
	- ![image](https://user-images.githubusercontent.com/57826324/160512564-f738f8da-d31f-446f-98eb-f86a97d23754.png)
	- ![image](https://user-images.githubusercontent.com/57826324/160512638-c9f70804-20f7-4fa9-a768-aca28e74a005.png)
	- Mapping
		- One to One
		- One to Many
		- Many to One
		- Many to Many
	- restful api
	- safe: get
	- idempotent: get, put, delete
	- cacheable: get, post

- What new things you have learned today?
	- Validation
	```
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-validation</artifactId>
</dependency>


- common validation annotations
	- @NotNull, @NotEmpty, @NotBlank, @Min, @Max, @Pattern, @Email 
	- Swagger
	- swagger is an open source project used to generate the rest api documents for RESTful services.
	```
	
@EnableSwagger2
@Configuration
public class SwaggerConfig {

      @Bean
      public Docket productApi() {
          return new Docket(DocumentationType.SWAGGER_2)
                  .select()
                  .apis(RequestHandlerSelectors.basePackage("com.antra"))
                  .paths(regex("/api.*"))
                  .build().apiInfo(metaInfo());
             
      }
     private ApiInfo metaInfo() {
       
        ApiInfo apiInfo=new ApiInfo("User Api", "User Api methods", "1.0", "Terms of Service", 
	new Contact("Antra Inc","http://www.antra.net","abc@gmail.com"), "License for User Details ", "Url of user", Collections.EMPTY_LIST);
    
        return apiInfo;
     }
}


- What is your learning plan tomorrow?
	- review Database normalization
	- MongoDB and Redis
	- Spring framework fully review

## 3.29

- What have you reviewed today?
	- JAR vs WAR
        - JAR stands for Java Archive. JAR is zipped file containing the compressed versions of .class files and resources of compiled Java libraries and application which mean its for pure Java application.
        - WAR stands for Web Application Resource. These archive files have the .war extension and are used to package web applications that we can deploy on any Servlet/JSP container.
        - 1NF
		- each table cell should contain a single value
		- each record needs to be unique
	- 2NF
		- be in 1NF
		- single column primary key
	- 3NF
		- be in 2NF
		- has no transitive functional dependencies
	- MongoDB
	- ![image](https://user-images.githubusercontent.com/57826324/160737574-d1fca5ef-e0f8-496a-b4f5-171b2bdb12ba.png)
	- Redis
	- ![image](https://user-images.githubusercontent.com/57826324/160737617-40bd20c5-73a2-44a3-b5a7-f26745296a5f.png)
	- Spring
		- IOC/DI and AOP
		- bean scope
			- single (default), prototype, request, session, global session
		- important annotations
			- @Autowired, @Resource, @Component, @Scope(“singleton/prototype”), @Configuration, @ComponentScan(“package”), @Bean
		- mvc
			- model view controller, dispatcher servlet
		- boot
		- restful api annotation
			- @RestController, @Controller, @Service, @Repsoitory,
			- @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @RequestMapping, 
			- @PathVariable, @RequestParam
			- @RequestBody, @ResponseBody
		- Lombok
			- @Data, @AllArgsConstructor, @NoArgsConstructor
		- Exception 
			- @ExceptionHandler, @ControllerAdivce, @ResponseStatus
		- Validation
			- @NotNull, @NotEmpty, @NotBlank, @Min, @Max, @Pattern, @Email
- What new things you have learned today?
	- Authentication-username + password
	- Authorization-role
	- security-at rest / in transit username (password) (ssn) 
	- Encryption
	- Hashing
	- Encoding
	- 1.validate input controller
	- 2.HTTP+Security(TLS > SSL)
	- 3. Token - > JWT (Json web token)
	- JWT
		- Json Web Token, an encoded JSON data used for data exchange as "Token". It looks like a string, so can be used as a token.
	- OAUTH2
		- Open Authorization 2.0 It is a way to let users log in to a website/application using the 3rd party account
- What is your learning plan tomorrow?
	- review interview questions
	- equals / hashcode

## 3.30

- What have you reviewed today?
	- Constructor 
		- is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
getter/setter
		- getter and setter are two conventional methods that are used for retrieving and updating value of a variable. By using getter and setter, the programmer can control how his important variables are accessed and updated in a correct manner, such as changing value of a variable within a specified range.
	- Final, Finalize, Finally
		- Final keyword is used to apply restrictions on class(immutable), method(cannot override) and variable(constant).
		- Finally is a block that always executes when the try block exits even if an unexpected exception occurs.
		- Finalize is a method to perform clean up processing just before object is garbage collected.
	- equals/hashcode
	- HashMap and HashSet use the hashcode value of an object to find out how the object would be stored in the collection, and subsequently hashcode is used to help locate the object in the collection. Hashing retrieval involves:
		- First, find out the right bucket using hashCode().
		- Secondly, search the bucket for the right element using equals()
	- You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the general contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with all hash-based collections, including HashMap, HashSet, and Hashtable. 
- What new things you have learned today?
	- Application Architectures
	- MVC Pattern
	- ![image](https://user-images.githubusercontent.com/57826324/160984788-1aac3007-8ffd-42d6-bd0d-3a12bf5501e0.png)
	- 3-tier Architecture
 		- Web Layer
			- Communication with clients using network protocols like HTTP, websocket
			- Input Validation 			
			- Exception Handling		
			- Authorization, access control
		- Service Layer
 			- Business Logic
 			- Transaction Management
 		- Data Layer
			-  Data Access, CRUD operations to DB
	- SOA
	- Service-Oriented Architecture
		- Focusing on interaction and integration between independent services, usually using a service bus, SOAP or messaging system.
 		- ESB, In SOA, an enterprise service bus(ESB) acts as a center control of the communication and integration between the services.
Popular product like MuleSoft ESB, Anypoint ESB
	- Microservices
	-  This is an architectural development style that allows building applications as a collection of small autonomous services developed for a business domain. It is a variant of structural style architecture that helps arrange applications as a loosely coupled service collection. The Microservice contains fine-grained services and lightweight protocol.
- What is your learning plan tomorrow?
	- review springboot restful demo
	- review Design Patterns

## 3.31

- What have you reviewed today?
	- Design Pattens
		- Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		- ![image](https://user-images.githubusercontent.com/57826324/161197893-139c5d31-8e57-43ec-9683-5ef6207f3a95.png)
		- Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		- ![image](https://user-images.githubusercontent.com/57826324/161197980-1a7a7005-4f78-4e86-8127-5d8a5275d547.png)
		- Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
		- ![image](https://user-images.githubusercontent.com/57826324/161198033-3251e9d4-740b-4c34-a717-2e9a8f72373c.png)
		- In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern. In proxy pattern, we create object having original object to interface its functionality to outer world.
		- ![image](https://user-images.githubusercontent.com/57826324/161198135-e0a4c99a-c9ef-4546-8ef6-4eeb4f46e687.png)
- What new things you have learned today?
	- Microservices
		- Split the application into tiny little services and then link them together using distributed communication, like http, service discovery, load balancing and api gateway. It is flexible. Each service could be developed, tested, deployed separately. It is loosely coupled. Services are communicating through the network. It is resilient. Elastically adding/removing nodes for each service won't cause issues to the overall application. Network failures can be 	 recovered by using retry circuit breakers.
	- pros and cons of Microservices
	- ![image](https://user-images.githubusercontent.com/57826324/161196000-6db9abb5-1477-4d28-826f-7626c46b1b17.png)
	- Eureka
		- Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.
	- Client-side LB
		- The Ribbon mainly provides client-side load balancing algorithms. It is a client-side load balancer that provides control over the behavior of HTTP and TCP client. The important point is that when we use Feign, the Ribbon also applies.
	- Api Gateway
		- An API gateway sits between external clients and the applications running in your datacenter and clouds. APIs (application programming interfaces) define how applications can communicate, without the client having to know where or how they are implemented. An API gateway validates incoming requests, routes them to the appropriate backend service based on defined policies, and then returns the appropriate result to the client.
- What is your learning plan tomorrow?
	- review and dive into content that covered this week
	- review Spring MVC

## 3.31

- What have you reviewed today?
	- Collections
	- List
		- List is the most commonly used collection. ArrayList can be used in most of the scenarios.
		- ArrayList
		- LinkedList
	- Queue
		- FIFO
		- PriorityQueue
		- minHeap
		- maxHeap

	- Map
		- All Maps are collections of Key-Value pairs. hashCode/equals methods of the Key class are used internally.
		- HashMap
		- LinkedHashMap
		- TreeMap
		- ConcurrentHashMap
		- HashTable
		- ![image](https://user-images.githubusercontent.com/57826324/161473561-8ff4ec18-fca9-4a40-b319-e586db3bb073.png)


	- Set
		- Similarly to map, set is actually using map's key as storage of the elements. All values are the same dummy object. So a set has the same feature as the map's key.
		- HashSet
		- TreeSet 
- What new things you have learned today?
	- Microservice
	- Log Tracing
		- Spring Cloud Sleuth is a framework to add the traceId and spanId into the HTTP Request Header, as well as the logs.
		- Zipkin server is used for aggregation of the logs with traceId and spanId.
	- Config Server
		- Spring Config Server can be used for centralizing all the configuration files for each service, also for every environment(dev, test, staging, UAT, prod).
	- Fault Tolerance
		- Resilience4j is the recommended framework.
		- Netflix Hystrix (Not used anymore)
		- Resilience4j provides: circuit breaker, retry, ratelimiter, cache, bulkhead.
	- Cloud/AWS
		- EC2 - It provides user servers with CPU, memory, disk, network and OS.
		- S3 - file storage using bucket and key to indicate the id. Fast and lots of space. 		
		- SQS - Message Queue. Very simple one.
		- SNS - Notification service, can send SMS, Email, SQS, HTTP etc.
		- Lambda - It hosts functions which could be triggered by other services. It is serverless. Could be used for small tasks which don't need a dedicated server.
 		- RDS - RDBMS hosts, like Oracle, MySql, PostgreSQL, etc..
		- ECS - Orchestration and management of Docker containers.
		- ECR - Registry of Docker Images.
- What is your learning plan tomorrow?
	- Spring framework and web application review
	- core Java
