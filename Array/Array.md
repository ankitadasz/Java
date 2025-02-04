**Array in Java**

An **array** is a collection of similar or homogeneous data types stored in contiguous memory locations.

### **Declaration and Initialization**

```java
int arr[] = new int[5];
```

Here, `new` is used to create an object of the array.

- The superclass of an array in Java is the **Object** class.
- Arrays are stored in **heap memory**.

### **Advantages of Arrays**

1. You can store multiple elements of the same type in a single variable.
2. Objects can also be stored in an array.
   ```java
   Employee e[] = new Employee[10];
   ```
3. Arrays provide **random access** to elements using their index.
4. Memory efficiency for storing similar types of data.

### **Disadvantages of Arrays**

1. The **size of the array is fixed**, which may lead to memory wastage if not fully utilized.
2. Only **similar data types** can be stored (homogeneous nature).
3. **Deleting an element** requires shifting other elements, making it inefficient.
4. **Insertion and deletion operations** are costly as elements need to be rearranged.

### **Types of Arrays**

Arrays can be classified into two types:

1. **Single-Dimensional Array (1D)**
   ```java
   int arr[] = new int[5];
   ```
2. **Multi-Dimensional Array (2D, 3D, etc.)**
   - **Two-Dimensional Array (2D)**
     ```java
     int matrix[][] = new int[3][3];
     ```
   - **Three-Dimensional Array (3D)**
     ```java
     int cube[][][] = new int[3][3][3];
     ```

### **Converting 1D Array to Multi-Dimensional**

To convert a **1D array** into a **2D array**, you can use looping constructs:

```java
int arr[] = {1, 2, 3, 4, 5, 6};
int rows = 2, cols = 3;
int matrix[][] = new int[rows][cols];

for(int i = 0; i < arr.length; i++) {
    matrix[i / cols][i % cols] = arr[i];
}
```

This code distributes elements of a **1D array** into a **2D matrix** row-wise.

---

## Array Declaration and Initialization in Java

### Declaration of Arrays

We should never declare the size while declaring an array.

Examples:
```java
int a[], b;
int []a, b;
int [] a, b;
```

**Comparison:**
- `int a[], b;` → Here, `a` is an array, but `b` is a simple variable.
- `int []a, b;` → Both `a` and `b` are arrays.
- `int [] a, b;` → Both `a` and `b` are arrays.

The last two declarations are **equivalent**, while the first one is **different** because only `a` is an array.

### Recommended Declaration Style

The most preferable declaration is:
```java
int[] a;
```
This improves readability and clarity in the code.

### Array Creation

1. First, declare it:
   ```java
   int[] a;
   ```
2. Then, create the array:
   ```java
   a = new int[size];
   ```
3. You can also declare and create at the same time:
   ```java
   int[] a = new int[size];
   ```

#### Special Cases:
- `int[] a = new int[0];` → This will compile and run successfully.
- `int[] a = new int[-3];` → This will **compile**, but it will throw a **NegativeArraySizeException** at runtime.

### Array Initialization

When an array is created, it gets initialized with default values:
- **Integer array (`int[]`)** → Default values are `0`.
- **String array (`String[]`)** → Default values are `null`.

#### Assigning Values
```java
a[1] = 4;
```
If the array size is **3**, and you try to assign a value at index `7`, it will throw:
**ArrayIndexOutOfBoundsException**.

#### Alternative Initialization
```java
int[] a = {10, 20, 30};
```
- In this case, values are **not** initialized to `0` first.
- If you use `new int[size]`, values will be initialized to `0` first.

### Printing Elements of an Array

To iterate and print elements of an array, you can use an enhanced for loop:
```java
int[] a = {10, 20, 30};
for (int i : a) {
    System.out.print(i + " ");
}
```
This will output:
```
10 20 30 
```


## 2D Array in Java

### Declarations and Assignments

```java
int [][] a, b; // 'a' is a 2D array, 'b' is also a 2D array
int [] a[], b; // 'a' is a 2D array, but 'b' is a 1D array
int [] a[], b[]; // 'a' is a 2D array, 'b' is also a 2D array
int [][] a, b[]; // 'a' is a 2D array, 'b' is a 3D array
int [][] a, []b; // Compile-time error: Incorrect bracket placement for 'b'
```

### Correct 2D Array Initialization

For a normal matrix array, you declare both the number of rows and columns:

```java
int [][] a;
a = new int[2][]; // Declaring an array with 2 rows, but columns are not yet defined

a[0] = new int[3]; // First row has 3 columns
a[1] = new int[2]; // Second row has 2 columns
```

Alternatively, initializing a complete 2D array:

```java
int [][] a = new int[2][3]; // 2 rows and 3 columns
```

Using direct initialization:

```java
int [][] a = {
    {10, 20, 30},
    {40, 50, 60}
};
```

### Jagged Array

A jagged array is a 2D array where rows have different column sizes:

```java
int[][] a;
a = new int[2][]; // 2 rows, but columns are assigned later
```

This allows for different row sizes, making it more flexible than a regular 2D array.

## How to Print 1D, 2D, and 3D Arrays

### 1D Array:
```java
int a = {1, 2, 34, 3};
for (int i = 0; i < a.length; i++) {
   System.out.println(a[i]);
}
```

### 2D Array:
```java
int[][] a = {{1, 2, 3}, {4, 5, 6}};
for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[i].length; j++) {
      System.out.println(a[i][j]);
   }
}
```

### 3D Array:
```java
int[][][] a = {{{1, 2, 3}, {4, 5, 6}}, {{12, 34, 44}, {63, 32, 23}}};
for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[i].length; j++) {
      for (int k = 0; k < a[i][j].length; k++) {
         System.out.println(a[i][j][k]);
      }
   }
}
```

