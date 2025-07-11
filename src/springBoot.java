//1️⃣ Java Collections Framework (JCF) – Master Level
//        Why: Spring uses collections (like Map, List, etc.) internally and expects you to use them wisely.
//
//        Interfaces: List, Set, Map, Queue, Deque, etc.
//
//        Implementations: ArrayList, LinkedList, HashSet, TreeSet, HashMap, LinkedHashMap, TreeMap, etc.
//
//        Differences, performance, internal structure
//
//        Fail-fast vs fail-safe
//
//        Iterator and ListIterator
//
//        Comparable vs Comparator (Sorting)
//
//        Collections utility class (e.g., Collections.sort())
//
//        2️⃣ Generics (Beginner to Expert)
//        Why: Spring heavily uses generics in almost every API (like JpaRepository<T, ID>).
//
//        Generic Classes, Methods, and Interfaces
//
//        Bounded Type Parameters: <T extends Number>
//
//Wildcards: <?>, <? extends T>, <? super T>
//
//        Type Erasure
//
//        PECS Principle
//
//        3️⃣ Exception Handling (Deep Understanding)
//        Why: Spring encourages proper exception propagation and custom exceptions.
//
//        Checked vs Unchecked Exceptions
//
//        try-catch-finally, throw, throws
//
//        Custom exceptions
//
//        Exception chaining
//
//        Best practices in exception handling
//
//        4️⃣ Multithreading & Concurrency
//        Why: Spring provides features for concurrent processing like @Async, scheduling, and reactive programming.
//
//        Threads and Runnable
//
//        Thread Lifecycle
//
//        Synchronization and Locks
//
//        ExecutorService, Callable, Future
//
//        Thread-safe Collections
//
//volatile, synchronized, wait/notify
//
//        Java Memory Model (JMM) basics
//
//        5️⃣ I/O Streams and File Handling
//        Why: File I/O, reading configs, logging, etc., are common in Spring Boot apps.
//
//        Byte and Character Streams
//
//        InputStream, OutputStream
//
//        Reader, Writer
//
//        Serialization and Deserialization
//
//        ObjectInputStream, ObjectOutputStream
//
//        6️⃣ Lambda Expressions and Functional Interfaces
//        Why: Spring and Spring Boot use functional programming extensively (e.g., Function<T,R>, lambdas in stream pipelines).
//
//        Syntax and internal working
//
//        Functional Interfaces: Function, Consumer, Predicate, Supplier
//
//        Method References, Constructor References
//
//        7️⃣ Stream API (Java 8)
//        Why: For data manipulation in a functional style, used extensively in business logic.
//
//        map, filter, collect, reduce, sorted
//
//        Intermediate vs Terminal Operations
//
//        Parallel Streams
//
//        Collectors: groupingBy, joining, toList()
//
//        8️⃣ JDBC (Java Database Connectivity)
//        Why: You must know how Java interacts with the database; Spring JDBC abstracts this later.
//
//        Steps to connect Java with a database
//
//        DriverManager, Connection, Statement, PreparedStatement, ResultSet
//
//        Transaction Management
//
//        SQL Injection prevention
//
//        Batch processing
//
//        9️⃣ Annotations (From Basics to Custom)
//        Why: Spring Boot is annotation-driven. You must know how annotations work.
//
//        Built-in annotations: @Override, @SuppressWarnings, etc.
//
//        Meta-annotations
//
//        Custom annotations and @Retention, @Target
//
//🔟 Object-Oriented Programming (OOP) Deep Understanding
//        Why: Spring is based entirely on OOP principles.
//
//        Abstraction, Encapsulation, Inheritance, Polymorphism
//
//        Association, Aggregation, Composition
//
//        SOLID principles
//
//        Design Patterns: Singleton, Factory, Strategy, Dependency Injection
//
//        1️⃣1️⃣ Java Memory Management & JVM Internals
//        Why: Spring deals with lifecycle and memory-sensitive operations.
//
//        Stack vs Heap
//
//        Garbage Collection
//
//        ClassLoader, Method Area, Runtime Constant Pool
//
//        Class loading process
//
//        JVM parameters
//
//        1️⃣2️⃣ Reflection API
//        Why: Spring uses reflection heavily for dependency injection and bean creation.
//
//        Class class
//
//getDeclaredMethod(), getDeclaredField()
//
//        Dynamic method invocation
//
//        Modifying access control at runtime
//
//        1️⃣3️⃣ Inner Classes & Anonymous Classes
//        Why: Used in lambdas, event handlers, and Spring configurations.
//
//        Static nested classes
//
//        Inner, local, and anonymous classes
//
//        Memory and scope behavior
//
//        1️⃣4️⃣ Enum and Autoboxing
//        Why: Used for status codes, switch logic, and constants in Spring.
//
//        Enum with fields and methods
//
//        EnumSet, EnumMap
//
//        Wrapper classes and autoboxing/unboxing
//
//        1️⃣5️⃣ Unit Testing in Java (Optional but Helpful)
//        Why: Spring Boot promotes TDD using JUnit and Mockito.
//
//        JUnit 4 vs JUnit 5
//
//        Writing unit tests
//
//        Assertions, Test lifecycle
//
//        Introduction to Mockito (mocking dependencies)
//
//        🚀 Bonus (Recommended Before Spring Boot)
//        Maven or Gradle: Build tools to manage dependencies
//
//        Basic Git/GitHub usage: For version control
//
//        Basics of REST APIs and JSON: Since Spring Boot is used to build RESTful services
//
