### Variables 
These are temporary memory locations created for the program to store the data.

### Comments in java
- // > single line comments
- /* */ > Multi line comments

### Datatypes
These specify the type of an data which tells the compiler or intrepreter how the programmer intended to use them.

**sizes mentioned here are on basis of 32-bit computers**
####Basic primitive datatypes:
| Datatype | Size | Range |
|----------|:-----|:-------|
|byte | 1 byte| -128 to 127|
|short | 2 byte| -32768 to 32767|
|int | 4 byte| -2^31 to 2^31-1|
|long| 8 bytes||
|float| 4 bytes| fractional numbers, stores 6 to 7 decimal digits|
|double| 8 bytes |fractional numbers, stores 15 decimal digits|
|boolean| 1bit| stores true or dfalse values|
|char | 1 byte| stores a single character/letter/ ascii value

- By default, all the fractional numbers are double in nature.
- To use as a float we need to specify 'F' at end of the number
Eg:
```
float num = 23.99F
```
**All the primitive type variables are stored in the stack memory**

#### Access Modifiers
1. public
2. private
3. protected
4. default

- Default: The data members, class or methods which are not declared using any access modifiers i.e. having _*default*_ access modifier are accessible only within the same package.
- Private: data members are accessible only within the class
- public: Everywhere it can be accessed
- protected: data members or methods are accessible only within the current class and its child classes only (only parent class and child classes can access the protected variables).
    - If no child classes it can be accessible only within the class.
    

### Classes
It is collection of data members and member functions.
- Simply, Grouping of functions with similar functionality

### Objects
Object is a instance of the class
- Each object has its own space or memory

- All the methods are stored globally for all the objects but for every object data members are stored under different memory locations as their values are different from each other.

Eg: Object creation

```Employee e = new Employee();```  

- e is of type of employee as similar to (assume int a;) a is a type of int
- For primitive types memory is allocated by java (defaultly)
- For types we have created like class we need to allocate memory which is done by using new keyword
- And that object wil have all the feature that a class has.
 
 **To access data from a object we use '.' operator**
 
 Eg: (Assume data is a primitive type created in employee class)
 ```e.data```
 
 
 ### Functions
 Function is a set of instructions which are executed only when that particular function called.
- These are used especially for code re-usability in the situation where the same code used at multiple places
- A normal function contains these parts
    - Return type or type: Data type of the value returned by the function. If it doesn't return anything then use void type as return type. 
    - Parameters: The names listed in the function's definition followed by the function name and parenthesis for holding the data passed to it when it is called.
    - name: name of the function
    - block: where the set of instructions which are to be performed when the function called are stored.
    
Eg: (Function declaration)
```
type func_name(parameter1, parameter2, ...){
    
}
```
- Arguments: The values passed to a function when it is called. 
Eg:(Calling a function)
```
func_name(arguments);
```

### Methods
The functions which are in the classes or object oriented program can be called as methods.

- These methods can also have access specifiers

### Static variables
- Whenever we made a variable or function as static it can be accessed or called without creation of object.
- To use a method or variable in the class which is defined as static, we can directly call it by using class name only.
- If we created a variable with static, only one copy of that variable is available for the all objects of that class.
- As these are made for the class not for the objects.
- Global and static variables are very similar . The only difference being static variables may be public or private . A public static variable is a global variable in java .
 
Eg:
```
Employee.java:
public class Employee{
    static int data;
}

Main.java
// Here data is called using the Employee(class name)
Employee.data


``` 


**ALL OBJECTS (NON PRIMITIVE TYPES) ARE STORED IN HEAPS.(UNLESS PRIMITIVES STORED IN STACK)**

### Strings
- String in java are not primitive types.
- Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. 

Eg:
```
String name = new String("Ravi");
or same can be directly written as
String name = "Ravi";
```
__**By default a package entirely loaded in java which is called java.lang package which contains basic classes of java including System class**__

### System
- It is a class in the java.lang package 
- All the functionalities that related to our system..
- Its class definition resembles to below
```
com.java.lang;
// Some where it declared like this
class PrintStream{
    println()
}
class System{
    static PrintStream out;
}
``` 
__out in System.out.println() is a static object of PrintStream, instantiated in System class, so it can be accessed from anywhere by Class name System__
__so println() is a function in the PrintStream Class and we call it with the object **out** which is instantiated as static object in **System** class

# Scanner class
- Scanner class is present in the java.util package.
- It is useful for input operations from the user.
- But it doesn't know where to take input so, we need to specify an argument.
- So to take input from system we use ```System.in``` as a argument in the Scanner class.
- The scanner class contains some methods which are used to take inputs(datatype specific) like next(), nextInt().
- To import Scanner class we can import it as below
```
import java.util.Scanner;
or 
To import all classes in util
import java.util.*;
```
- nextInt is a function in Scanner class to take an Integer value
- nextFloat is a function in Scanner class to take an Float value

- It means to take an integer from the System input and store it in num
Eg:
```
public class Main {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); 
        num = sc.nextInt();
        System.out.println(num);
    }
}
```

- BufferReader and DataInputStream will take every thing as a string, and we need to convert them again to our required type.
- So its easy to use scanner class
##### scanner.nextLine()
- To take string input scanner class in a line
- If we use this next line in the middle of the program means after any input statements it simply make the execution control to move next line.
- Instead of taking input string from the next line.
- So overcome this we need to use another nextLine above to break the input there and come to program.

#### scanner.next()
- To take input string but only one word
- But next will work fine... not like nextLine

### Relational operators
<,>,>=,<=,==

### Logical operators
&&, ||

### Decision statements
if, if-else, nested-if, switch(and cases)

### Looping Statements
- Looping statements are the statements that execute one or more statements repeatedly several numbers of times.
- In while loop in Java checks the condition if the condition is true then control goes inside the loop body otherwise goes outside of the body
- In java programming language there are three types of loops; while, for and do-while. Here while and for are entry controlled looping Statements, and do-while is exit controlled looping Statements.

### Arrays
- An array is a collection of similar types of elements which has contiguous memory location. We can store only a fixed set of elements in an array.
- Arrays in Java are index-based, the first element of the array is stored at the 0th index, the 2nd element is stored on the 1st index and so on.
Syntax:
```
datatype[] name_of_arr = new datatype[size]

```
- In java array is a type of object.
- So whenever it is an object we have to explicitly allocate memory.

##### Accessing and Manipulating arrays
```
 // Array declaration and memory allocation as it is an object
        int[] a = new int[8];
        Scanner sc = new Scanner(System.in);
        // Array element accessing and initialising
        // a[0]=4;
        // a[1]=5;
        // System.out.println(a[0]+" "+a[1]);
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
```
- In the same we can create float array which contains only float type elements , double array which contains only double type elements

### Java naming Convention (not a rule)
- Class name follows **PascalCase** NamingConvention. (Every first letter of word is capital)
- Function name and variable name follows __camelCase__ namingConvention.(first letter of the first word is small and first letter of remaining all are Capitals)


### Array of Objects
- In java, we can also take an array of objects.
- It means array stores set of similar type objects
Syntax:
```
ClassName[] employees = new ClassName[size];
``` 

Eg: (Employee class with getdata(from user) and display details)
```
//Main.java class
package com.java.day4;

public class Main {
    public static void main(String[] args){
        // Array of the integers
        int[] numbers = new int[3];
        // Array of Objects which are Employee type
        Employee[] employees = new Employee[3];

        // Object Creation and storing in array
        for(int i=0;i<3;i++){
            employees[i] = new Employee();
        }

        //set details
        for(int i = 0;i<3;i++){
            employees[i].getData();
        }

        //get details
        //set details
        for(int i = 0;i<3;i++){
            employees[i].display();
        }

    }
}


// Employee Class

package com.java.day4;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    String city;
    Scanner sc = new Scanner(System.in);
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------- Enter the employee details -------------------");
        System.out.print("Enter name of employee: ");
        name = sc.nextLine();
        System.out.print("Enter age of employee: ");
        age = sc.nextInt();
        System.out.print("Enter city of employee: ");
        city = sc.next();
    }
    public void setData(String inp_name,int inp_age,String inp_city)
    {
        name = inp_name;
        age = inp_age;
        city = inp_city;

    }
    public void display()
    {
        System.out.println("The Name is "+name);
        System.out.print("The Age is ");
        System.out.println(age);
        System.out.println("The City is "+city);
    }

}


```

### new
It is a memory allocation operator which assigns a memory location to an object.

### Constructors
- A method in a class which has same name as class name is called as constructors in `Java`.
- Constructors are methods in class which allocate memory or create object and intialize the objects to the class.
- These will not have return type
- If constructor is private we cannot create object on other class
- If anything to be executed at the time of Object creation then place those things in the constructor


#### Default Constructors
- This type will not contain any arguments
- This will be called by default, and it will be present default when created class.
- Whenever you are calling a constructor it means creating an object

### Data hiding
- The data should not be changed from outside the class.
- By default, the members of class are default.
- So always make all the properties private.
- Hiding the data(properties) from outside accessing is Data Hiding.

### Data Abstraction
- Displaying only essential information and hiding the details or data is called Data Abstraction.


### Data Binding
- When we hide variable, but we need to access or change those we can use getter and setter methods.
- Then we can see that we binded the variable age with the getter and setter methods.
- The concept of binding the variable with the functions is called Data binding.

### Encapsulation
- The process of binding the data members and member functions is called Encapsulation.
- Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. 
- In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
### this pointer or keyword
- this keyword will always represent the current class context or current class properties.

### Function or Method Overloading
- The process of creating method or function with same name but different parameters or return type is called Function overloading.
 
- The linking of a function with an object during compile time is called early binding. 
- It is also called static binding.

Eg:
```
public class Calculation {
    public void add(int num1, int num2){
        int res = num1+num2;
        System.out.println(res);
    }

    public void add(int num1, int num2, int num3){
        int res = num1+num2+num3;
        System.out.println(res);
    }
}

calculation.add(1,2); // calls first add method with 2 params
calculation.add(1,2,3); //calls second add method with 3 params
```

### Polymorphism
- Ability to exist in many forms is called polymorphism.
- Overloading is the concept of the polymorphism.
- Polymorphism is the ability of an object to take on many forms.
- The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. 
- Any Java object that can pass more than one IS-A test is considered to be polymorphic.

##### Compile time Polymorphism
- Whenever an object is bound with their functionality at the compile-time, it is compile-time polymorphism
- Compile time polymorphism is achieved by function overloading or operator overloading.

##### Run time Polymorphism
- Whenever an object is bound with the functionality at run time, it is runtime polymorphism.
- Run time polymorphism is achieved by Function Overriding and virtual function concept.

### Inheritance
- The process of extending the features of one class by another class is called Inheritance.
- Make Reusability
- 'extends' keyword is used to inherit a class
```
class OneClass
{
    properties,
    methods
}

class OtherClass extends OneClass
{
    another properties,
    methods
}

Now OtherClass can use all the features of the Oneclass
```
    
**Everything in the OOP is maximum related for security and reusability**

### Function or Method overriding
- If the method in the parent class and derived class is exactly the same then parent class method is overridden by child class method
- This process is called Method Overriding

### Interfaces
- Its almost like a class but all the properties in the interface are by default final. 
- And every method in the interface should always be an abstract method
    ###### Abstract Method
        - The methods that does not have implemetation is called Abstract method.
Eg:
```
    interface Demo{
        properties are final by default,
        // Should be abstract
        methods(){
        }
     }
```
- Interfaces can't be instantiated i.e., we cannot create objects for interface.
- Interfaces are inherited by the classes and the implementation of all the methods of the interfaces is responsibility of class that implements.
- All the methods in the interface should be overridden atleast with some empty method.
- 'implements' keyword is used to inherit the interface. 

- It supports Abstraction.
```
Shape c = new Circle();
c.area();
// Here c is of type Shape 
// but it has the memory or it references to Circle Object
// As c is a type of Shape and no one can see any area implementation
// in shape but actually it is refering the circle class
// This is the concept of Abstraction in which 
// Only essential features are shown by hiding background details or implementation

```

### final keyword
- static means there is only one copy of the variable in memory shared by all instances of the class. 
- The final keyword just means the value can't be changed. 
- Without final , any object can change the value of the variable.Dec 8, 2012
- final variable -> To create constant variables(value cant be changed).
- final methods -> To prevent Method Overriding
- final classes -> To prevent Inheritance

### Enhanced for loop(foreach loop)
- Directly iterate over elements.
- here var is element in collection/array
- It means it get elements one by one from collection.
```
    for(type var: array/collection){
    }
```
### Iterators
- Iterator present in the java.util.
- Iterator basically stores the iteration of the collection.
- Especially used for high end collections
- Using Iterators
```
Iterator iterator = names.iterator();
// hasNext() method returns true if there is a next element
// else false
while(iterator.hasNext()){
    // If has next element then get the element.
    System.out.println(iterator.next());
}
```



## Collections
- Group of data is a collection.
- Array is also a collection, but it is not dynamic.

### ArrayList
- Present in java.util package
Syntax to create:
```
ArrayList<String> names = new ArrayList();
*If we not mentioned as type <String> it can store anything*
```
- Use arraylist object(names).add() method to add element to array.
- In add() method, we can directly specify the value to add sequentially.
- Or you can also specify index,value arguments to insert value at given index.

- To remove element
` names.remove("Thor"); // by value
    names. remove(0); // by index
`
- To check exists or not 
```
ArrayListobj.contains(val); //returns exists or not
```

### Hash Tables
- It stores the data in the form of key value pairs.
- Creating HashTable
```
//Creating Hashtable with Key is of String type and value is of string type.
Hashtable<String,String> hashtable = new Hashtable();
```
- In hashtable, each key-value pair is stored as an Map entry.
- That means Map.Entry<Key,Value> in the hastable.entrySet().
- Using HashTables
Eg:
```
    // Hash Table
    //Creating Hashtable with Key is of String type and value is of string type.
    Hashtable<String,String> hashtable = new Hashtable();
    hashtable.put("Name1","Ravi");
    hashtable.put("Name2","Iron Man");
    hashtable.put("Name3","Thor");
    System.out.println("---Storing in Hash table--");
    // To get hash value
    System.out.println(hashtable.get("Name1"));
    // To remove a element


    for (Map.Entry entry: hashtable.entrySet()) {
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    hashtable.remove("Name3");

    for (Map.Entry entry: hashtable.entrySet()) {
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
```


