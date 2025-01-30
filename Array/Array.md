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


