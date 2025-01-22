# Differences Between JDK, JRE, and JVM

### JDK (Java Development Kit)
- **Definition**: A software development kit required to develop Java applications.
- **Components**: JRE + Development Tools.
- **Development Tools**:
  - `java`: To run Java applications.
  - `javac`: To compile Java source files.
  - `javadocs`: To generate documentation.
  - `javaw`: Similar to `java`, but without a console window.

### JRE (Java Runtime Environment)
- **Definition**: Provides libraries and environment required to run Java applications.
- **Components**: Includes JVM and standard class libraries.

### JVM (Java Virtual Machine)
- **Definition**: An abstract machine that provides the runtime environment to execute Java bytecode.
- **Functionality**: Converts bytecode into machine code that the OS can execute.

---

# Key Java Concepts

### Class
- **Definition**: A keyword used to define a class name.
- You can define multiple classes in a Java program.
- A program can have only one `public` class.
- **Syntax**: First, write the access modifier, followed by the keyword `class`, and then the class name.

### Main Method
#### Components
1. **Public**: Access modifier
   - Makes the method accessible from outside the class.
   - Required so that JVM can access the method even if the program and JDK are on different drives.

2. **Static**: Keyword
   - Allows the JVM to call the method without creating an object.

3. **Void**: Return type
   - Specifies that the method does not return any value.
   - JVM doesn’t require a return value; hence, `void` is used.

4. **Main**: Method name
   - Execution starts from the `main` method.
   - There should be only one `main` method in a program.

#### Frequently Asked Interview Questions
1. **Is `void` null or zero?**
   - `Void` is neither null nor zero; it represents an empty value.

---

### String in Main Method
- **Definition**: A class name in Java.
- **Usage**: Used in the `main` method because strings are immutable. Once a value is assigned to a string, it cannot be changed.

### `args` in Main Method
- **Definition**: The name of the array used to pass arguments to the program.
- **Note**: The array name can be anything, not necessarily `args`.

---

# Summary
- **Access Modifiers**: Four types - `public`, `private`, `protected`, and `default`.
- **Execution Flow**: JDK compiles the code, and JVM executes it starting from the `main` method.
- **Important Keywords**: `public`, `static`, `void`, `String`.
- **Immutable Strings**: Ensures security and efficiency in the execution process.



# Java Basics Explained

### Use of `System`
- `System` is a class that is part of the `java.lang` package.
- It provides access to system resources and utilities, such as standard input, output, and error streams.

### Use of `out`
- `out` is a static variable in the `System` class.
- It represents the standard output stream and is an instance of `PrintStream`.
- `System.out` is commonly used for printing text to the console.

### Use of `println`
- `println` is a method in the `PrintStream` class.
- It is used to print messages to the console with a newline at the end.
- `PrintStream` provides three main methods for output:
  1. `print()` - Prints text without a newline.
  2. `println()` - Prints text followed by a newline.
  3. `printf()` - Formats and prints text based on a format string.

### Order of Modifiers in the `main` Method
In a Java program, the order of modifiers in the `main` method can be changed without affecting its functionality. For example:

```java
public static void main(String[] args) {  
    // Code here
}
```

is equivalent to:

```java
static public void main(String[] args) {  
    // Code here
}
```

