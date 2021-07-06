Employee Management System
JAVA Core Project

Employee Management System is a distributed application, developed to maintain the details of employees working in any organization. It maintains the information about the personal details of their employees, also the details about the payroll system which enable to generate the payslip. The application is actually a suite of applications developed using Java.

Language Used -  Java Core 
Concept Used - Swing (Java Concept)
IDE Used - Eclipse
Database Used - MySQL


Activate DB server (XAMPP/WAMP) for SQL DB.
DB name: projects
C:\Danish\XAMPP\mysql\bin>mysql -u root -p -h 127.0.0.1
MariaDB [(none)]> use projects;
Database changed
MariaDB [projects]> create table login(username varchar(20), password varchar(20));
Query OK, 0 rows affected (0.513 sec)

MariaDB [projects]> create table employee(name varchar(25), fname varchar(30), age varchar(10), dob varchar(20), address varchar(50), phone varchar(20), email varchar(30), education varchar(15), post varchar(15), aadhar varchar(20), emp_id varchar(10));
Query OK, 0 rows affected (0.356 sec)

Create a Java Project in Eclipse
Create a Package Employee to place all classes. 
Create a conn java class. 

Add External jar for MySQL Ex: "mysql-connector-java-5.1.49-bin"

Front page using SWING features (javax.swing.*) in java. 
CLICK HERE TO CONTINUE in front page will perform an action that is nothing but the event. To use event we will import java package java.awt.event


