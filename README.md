# Zmags Java Assigment

Zmags Java Assigment Libarary is Powerfull Java Library that implimnets Following Functions.

  - TriangleAnalyzer (Task1)
  - FileAnalyzer   (Task2)
  - Bag class     (Task 3)

# Classes

  - TriangleAnalyzer.java
  - FileAnalyzer.java
  - Bag.java
  
 # How to Use 
 Pakage name = " com.zmags.task "
### TriangleAnalyzer.java

TriangleAnalyzer takes 3 interger as arugment (length of sides of triangles ) and return type of Triangle . Type Integers are following

    int SCALENE = 1;
    int ISOSCELES = 2;
    int EQUILATERAL = 3;
    int INVALID = 4;
### How to use TriangleAnalyzer.java
    //create object of TriangleAnalyzer class
    TriangleAnalyzer instance = new TriangleAnalyzer();
    //call getTriangleType function and it will return values accordingly .its so simple
    int result = instance.getTriangleType(4, 3, 2);
    
### FileAnalyzer.java
FileAnalyzer is utility class that return K maximun occured word from file .It is scaleable class and can handle large files easily. It takes configration in constructor . Filename/Path, Ignore Case and Number if output results

### How to use FileAnalyzer.java
        
        //create object of class and pass it file name with full path
        //this class contains more overloaded constructor for Number of output and ignorecase
        //default result count is 10 and its case senstive ("Foo" and "foo" are not equal in 
        //default behavious)
 ## Deplyment
        
        //Build.cmd is added 
        //open command promp run build.cmd and it will make jar 
        //Import into project and start using library
        
      
        FileAnalyzer analyzer = new FileAnalyzer("testfile.txt");
        
        //call function getMostOccuredWords with will return list of K max occured words
         List<Word> result = analyzer.getMostOccuredWords();
         
### Bag.java
Bag class is genaric collection class with is using arraylist underline as container to collect objects. you can make it any object type

### How to use Bag.java
    //create object of Bag class and mention datatype on creation time
     Bag<String> bag = new Bag<String>();
     //add element of same type
        bag.add("1");
        bag.add("1");
        bag.add("2");
        bag.add("3");
        //you can add/remove/iterate it as normal collection class

# Unit Tests
unit test are include in source code and almost try to cover all source code

# Assumptions
-   for task3 I take Assumtion to use any collection as container so i use array list . We can use array and make it geowable as well 
-   for task 1 we can return Enum as well my i return Int (Enum choose is good as well)
-   for tas  2 I take asuumption by default we are trating words as case senstive but i write constrotor that make whole thing case insenstive


