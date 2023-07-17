Java SE
-----------------------------------------------------------

    Lab Setup
        JDK 1.8
        MySQL Server 5 or above
        Eclipse or IntelJ or STS as an IDE

    Java 1.8
    -----------------------

        JDK vs JRE vs JVM

            Java Development Kit        offers development support          (dev kit + JRE)     needed for devwelopers
            Java Runtime Environment    offers execution support            (JVM + JIT + GC)    needed for end-users
            Java Virtual Machine        is the virtual machien that
                                        hsots our java application and executs it.

        Features
            Simple
            Robust
            Secure
            Self-Documented
            Multi-Threaded
            Platform Independent
            Archetecture Neutral
        
        Characteristics 
            Strictly Case Sensitive
            Strictly but partially Object Oriented
            Each statement has to be terminated with a statement termination operator (;)
            {} flower braces are used to write a block of code.

        Tokens
            Identifiers
                is a name givne to any resource like variables, classes, objects, methods ...etc.,

                1. Naems of variables, objects and mehtods must be lower in case and follow
                    init-caps from second word onwards

                    length, boxLength, boxLengthInCms

                2. Names of user defiend data types like classes, interfaces, enums and annotation follow init-caps

                    Exception, IOException, File, String, Math, System, ArrayIndexOutOfBoundsException

                3. Naems of constants must be all caps. Underscopre are allowed to separate words.

                    PI,MAX_LIMIT,MIN_LIMIT

            Keywords
                are the reserved words in the language.

            Operators
                is, most of the times, a symbol representing an operation

                    Binary
                        Arithmetic  +   -   *   /   %
                        Relational  <   >   <=  >=  ==  !=
                        Assignment  =   +=  *=  *=  /=  %=
                        Logical     && ||   !

                    Unary           -   ++  --
                    Ternary         <conc> ? <true_exp> : <false_exp> 

            Comments
                end of line     //
                block           /* */

            Literals
                are hardcoded valeus

                public class App01 {
                    public static void main(String[] args){
                        String s = "Hello World";
                        char ch = '@';
                        double r = 80.9;
                        double area = Math.PI*r*r;
                        double cir = 2*Math.PI*r;
                    }
                }

            
            Line#   Identifiers     Keywords            Operators       Comments        Literals
            ---------------------------------------------------------------------------------------
               1      App01         public class        {
               2      main, args    public static void   (), [], {
                      String
               3      String, s                           =, ;                          "Hello World"
               4      ch            char                  =, ;                          '@'
               5      r             double                 =,;                          80.9
               6      area Math PI  double                 =,;,*,.
               7      cir Math PI   double                 =,*,.,;                        2

        Data Types
            Primitive
                byte
                short
                int
                long
                double
                float
                char
                boolean
                void ]

            User Defiend
                Class
                Interface
                Enum
                Annotation

        Control Structures
            Decision Making / Branching Control Statements
                simple if
                if..else
                if ladder
                nested if
                switch

            Looping Control Statements
                do..while                   post-conditioned indefinite loop
                while                       pre-conditioned  indefinite loop
                for                         pre-conditioned  definite loop
                for..each                   definite loop used to iterate through an array or any other collection.

            Non-Conditional Control Statements
                return
                break
                continue


        OOPs

            Class           is a user defiend data type that represents a model in terms of its properties and its
                            behaviour. Properties as fields and behaviours as methods.

            Object          is a variable of class type.

            Encapsulation   is data-hiding and data-binding. 
                            data hiding is providing indirect access to the fields or methods to safe gaurd their operations.

                                private, public, protected and defualt access modifiers to hide the field or method
                                and provide a setter or getter as an indirect access. 

                                by this we can allow a field as read-only or write-only or read-write.

                            class

                            no-access-modifier then it is default
                            private
                            protected
                            public

                            constructor
                                is a method that gets invoked immdiatly after the allocation of an object.
                                constructor shall not return any thing and shall have the same name as that of the class

                            this keyword
                                referes to the current object of a method and 
                                is also used to invoke one constructor from another constructor of the same class.

                                class Circle{
                                    private double radius;

                                    public void setRadius(double r){
                                        radius=r;
                                    }
                                }

                                //the variable r is not understandable as per standards.

                                class Circle{
                                    private double radius;

                                    public void setRadius(double radius){
                                        radius=radius;
                                    }
                                }

                                //the assignment is meaningless, both radisu refer to the mehtod argument, not the field

                                class Circle{
                                    private double radius;

                                    public void setRadius(double radius){
                                        this.radius=radius;
                                    }
                                }

                            static keyword

                                static when applied on fields
                                    instacne variable   those fields that are not marked as static
                                                        each object of the class will have their own copy of these fields

                                    class variable      those fields that are marked as static
                                                        these fields are shared by all the objects of the class

                                static when applied on methods
                                    methods that are marked as static can access only other static fields or methods of
                                    that class directly. 

                                static when applied on classes
                                    We have a concept of writing class inside a class.
                                    Inner Class     a class not marked as static and is inside another class
                                    Nested Class    a class marked as static and is inside another class

                                    Inner class will have access to all memeber of its enclosing class even if they are private.

                                static when applied as blocks

                                    static {} //static block

                                    a class can have anyy number of static blocks but are treated as a single unit.
                                    The code written inside the static block executes once in the liftime of the class.
                                    And that get executed before the class is accessed for the firt time.
                                
            Polymorphisim
                                allows us to model multiple implementatiosn of the same behaviour.

                                it means that we can have more than one method with the same name.

                                Overloading
                                                two or more methods from the smae class or from a super and a sub class
                                                must have the same name , but differ in parmaters list.

                                                class ArithmeticService {

                                                    public int sum(int a,int b) {
                                                        //......
                                                    }

                                                    public Matrix sum(Matrix a,Matrix b){
                                                        //......
                                                    }

                                                    public CompleNumber sum(CompleNumber a,CompleNumber b){
                                                        ///......
                                                    }
                                                }

                                                class GeometicService extends ArithmeticService {
                                                     public Rectangle sum(Rectangle a,Rectangle b){
                                                        ///......
                                                    }
                                                }

                                Constructor overlaoding
                                    having more than one constructor in the same class, it results in
                                        Default Constructor
                                        Paramatrized Constructor
                                        Copy Constructor

                                        public class ComplexNumber {
                                            private int real;
                                            private int img;

                                            public ComplexNumber(){
                                                //default constructor - has no args
                                            }

                                            public CompleNumber(int real,int img){
                                                //paramatrized constructor - has args
                                            }

                                            public ComplexNumber(ComplexNumber c){
                                                //copy constructor - has the object of the smae class as arg
                                            }
                                        }
                                
                                Overrriding

                                            Two methods are overriden when they belong to a super and sub
                                            classes and have the exact smae signature (method name, params list and return type)

                                                class BubbleSort {
                                                    private int[] data;

                                                    //getter and setter

                                                    public void display(){
                                                        //print the data array
                                                    }

                                                    public void sort(){
                                                        //implemnting bubble sort algorithm
                                                    }
                                                }

                                                class QuickSort  extends BubbleSort{
                                                    public void sort(){
                                                        //implemnting quick sort algorithm
                                                    }
                                                }

            Inheretence
                                    deriving a new class from an existing class.
                                    the existing class is called the super class
                                    and the new one is called the sub class.

                                    extends keyword is used to derive a sub class from a super class.

                                    java does not support multiple inheretence on classes.

                                    class Pen {
                                        private Nib nib;
                                        private Barrel barrel;
                                        private Refile rifle;

                                        public void write(Paper paper,String text){

                                        }
                                    }

                                    class Marker extends Pen {
                                        public void write(WhiteBoard board,String text){

                                        }
                                    }

            Abstraction        To declare a unimplemented method.

                                this method will be implemented by various implementation providers.

                                the keyword abstract to declare a method having no implementation, such
                                methods are called abstract methods.

                                An abstract method must be accomidated by a abstract class or by an interface.

                                abstract keyword is used to mark a class abstract.

                                abstract class                  vs      interface
                                 can have abstract methods                  can have abstract methods
                                        (use abstract keyword)

                                 can have non-abstract methods              can have non-abstract methods 
                                                                                    (using defualt keyword)

                                 can have fields                            can not have fields

                                 does not support multiple inheretence      does support multiple inheretence

    Assignemnt

                    Loan
                    |
                    -------------------------
                    |                       |
                    HousingLoan             PersonalLoan
                    |
                    MortagageLoan

    Java inbuilt packages
    --------------------------------------------------------------------------------------------

        java.lang                   String Manipulations, Exception Handling, Multi-threading
        java.time                   Data time manipulations
        java.util                   Geenrics, Collections, Utility classes
        java.util.function          Functional interfaces, Lambda Expressions
        java.util.stream            Streams API
        java.io                     IO Streams
        java.nio                    Novel IO Streams (Non-Blocking IO Streams)
        java.sql                    JDBC
                                
        java.lang

            Object
                        int hashcode()
                        boolean equals(Object)
                        String toString()
                        void finalize()

            System                                                  c-lang       cpp-lang
                        public static java.io.PrintStream out       stdout      cout
                        public static java.io.PrintStream err       stderr      cerr
                        public static java.io.InputStream in        stdin       cin
                        public stativ void gc();
                        public static void exit(int);

            Math

            String                  is immutable, ence any modification to a string object resutls in a new string object.
                                    so direct string modification is very costly.

            StringBuilder           
            StringBuffer
                                    help modify a string without creating new string objects.
                                    StringBuilder is used in single-thread application as it is not synchronous
                                    StringBuffer is used in multi-thread application as it is synchronous

            Wrapper Classes
                                Integer
                                Float
                                Double
                                ...etc.,

                                Integer iObj1 = 45; //auto-boxing
                                int x = iObj1;      //auto-unboxing

        Exception Handling

                an exception is a break point of the application due to errorsome data or
                errorsome operation.

                java.lang.Throwable
                                |
                                -------------
                                |           |
                                Error       Exception       <--- Sub-Classes (CHECKED EXCEPTIONS)
                                            |
                                            RuntimeException <--- Sub-classes (UNCHECKED EXCEPTIONS)


                    UnChecked Exceptions are to be avoided but not handled. The compiler will not
                    CHECK if this sort of an exception is handled or not.

                    class EmployeeServbice {
                        public void increaseSalary(Employee emp){
                            if(emp!=null){
                                emp.setSalary(emp.getSalary()*2);
                            }
                        }
                    }

                    Checked Exceptions can not be avoided/prevented, but they msut be handled using a special
                    control strucutre called try...catch statement. The compiler will CHECK if these sort 
                    exceptions are handled or not and will not compile the appliction if these
                    are not handled.

                    Exceptions that are developed by the developer are called user-defiend exceptions,
                    and Exceptions that are already provided by Java are called in-built Exception.

                    We can create our own sub-class of Exception or RutnimeException to create
                    Checked or Unchecked user-defiend exceptions.

                    try-catch statement

                        try{
                            //statements that may raise an exception
                        }catch(ExceptionType exp){
                            //log the exception for dubugging purposes
                            //either tranfer the exception to the next layer of the app
                            //or we will display a user understandable messages
                        }catch(ExceptionType2 exp){
                            //log the exception for dubugging purposes
                            //either tranfer the exception to the next layer of the app
                            //or we will display a user understandable messages
                        }catch(ExceptionType3 exp){
                            //log the exception for dubugging purposes
                            //either tranfer the exception to the next layer of the app
                            //or we will display a user understandable messages
                        }finally{
                            //code that has to execute at any cost irrespective of the exception may raise or not
                        }

                    try-with-multiCatch statement.

                        try{
                            //statements that may raise an exception
                        }catch(ExceptionType | ExceptionType2  | ExceptionType3 exp){
                            //log the exception for dubugging purposes
                            //either tranfer the exception to the next layer of the app
                            //or we will display a user understnadable messages
                        }finally{
                            //code that has to execute at any cost irrespective of the exception may raise or not
                        }

                    try-with-resources statement.

                        try(Closable obj = new ClosableObject(); ) {
                            //statements that may raise an exception
                        }catch(ExceptionType | ExceptionType2  | ExceptionType3 exp){
                            //log the exception for dubugging purposes
                            //either tranfer the exception to the next layer of the app
                            //or we will display a user understnadable messages
                        }

                    throw           used to raise a user defiend exception.
                    throws          used to transfer an exception from a method to its calling method.

        java.time       DataTiem API

            LocalTime       .now(),.of(h,min,sec)
            LocalDate       .now(),.of(y,mon,day)
            LocalDateTime   .now(),.of(y,mon,day,h,min,sec)

            ZonedDateTime   .now(ZoneId)

            offer plusMethods and minusMethods for date arthemetics.
            offer isBefore and isAfter methods for cronological comparision apart from equals methods
            offer toString methdo and parse and format methods

            DateTimeFormatter   .ofPattern(formatString)

                a sample formatString  is "dd-MMM-yyyy hh:mm:ss"

            Period      .between(start,end)     //measures the distence between two dates
            Duration    .between(start,end)     //measures the distence between two times

        java.util

            Scanner
            Random

            Generics 

                Generic is a ADT (abstract data type) that represents a non-realized type 
                which cna be realized jsut before the usage.

                public class Swapper<T> {
                    public void swap(T a,T b){
                        T t;
                        t=a;
                        a=b;
                        b=t;
                    }
                }


                Swapper<Employee> s1 = new Swapper<>();
                s1.swap(emp1,emp2);

                Swapper<String> s2 = new Swapper<>();
                s2.swap(str1,str2);

                Swapper<Integer> s3 = new Swapper<>();
                s3.swap(n1,n2);

            Collections

                is the java's approach to data-structures.

                java.util.Collection (interface)                all data structures
                           |
                           |    add(ele),remove(ele),contains(ele),size(),isEmpty(),stream()
                           |                           
                           | ← List (interface)                 Linear Data Structure
                           |
                           |        1. elements are arranged in an oder fashion
                           |        2. elements can be indexed and can be accessed randomly through the index
                           |        3. elements can be duplicate
                           |        4. any number of nulls can also be inserted here
                           |
                           |        get(index),first(),last(),removeAt(index),indexOf(ele)
                           |
                           | ← Set (interface)                  Non-Linear Data Structure

                                    1. elements arranged in a tree fashion
                                    2. elements can not be indexed
                                    3. elements can not be duplicate
                                    4. only one null value can be inserted here

                    List Implementations

                        ArrayList           growable array, is not synchronized
                        Vector              growable array, is synchronized
                        LinkedList          doublly-linked list 


                    Set Implementation

                        HashSet             no predictable retriving order
                        LinkedHashSet       entry order retrival
                        TreeSet             ascending order of magnitude in retrival

                    Dictate Comparision of Models like Employee/Book/BankAccount ..etc.,

                        java.lang.Comparable<>      int compareTo(ele)
                            //return 0 if this==ele
                            //return -1 if this<ele
                            //return +1 if this>ele

                        java.util.Comparator<>      int compare(ele1,ele2)

                            //return 0 if ele1==ele2
                            //return -1 if ele1<ele2
                            //return +1 if ele1>ele2

                java.util.Map   (interface)

                        is a collection of (key,value) pairs.

                        1. key can not be duplicate
                        2. key can not be null

                        put(key,value),set(key,value),get(key),keySet(),containsKey(key)

                        Implementations
                            HashMap             no predictable retriving order
                            LinkedHashMap       entry order of keys in retrival
                            TreeMap             ascending order of magnitude of keys in retrival
                                

                java.util.Collections
                        is a utility class offering a varity of utility methods for collections.

            
        java.util.regex

        java.util.function

        java.util.stream