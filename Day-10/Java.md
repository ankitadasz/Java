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

