# Java Basics: Key Topics

## 1. Variables
- **Definition**: Storage locations in memory with a specific type.
- **Declaration**: `datatype variableName;`
- **Initialization**: `variableName = value;`

## 2. Data Types
- **Primitive Types**: 
  - `byte`, `short`, `int`, `long` (Integer types)
  - `float`, `double` (Floating-point types)
  - `char` (Character type)
  - `boolean` (Boolean type)
- **Non-Primitive Types**: 
  - `String`, Arrays, Classes, Interfaces

## 3. Naming Conventions
- **Classes**: PascalCase (e.g., `MyClass`)
- **Methods**: camelCase (e.g., `myMethod()`)
- **Variables**: camelCase (e.g., `myVariable`)
- **Constants**: UPPER_CASE (e.g., `MY_CONSTANT`)

## 4. Literals
- **Integer Literals**: `123`, `0b1010` (binary), `0x7B` (hexadecimal)
- **Floating-Point Literals**: `3.14`, `2.71e-3`
- **Character Literals**: `'a'`, `'\n'`
- **String Literals**: `"Hello, World!"`
- **Boolean Literals**: `true`, `false`

## 5. Keywords
- Reserved words in Java with special meaning.
- Examples: `class`, `public`, `static`, `void`, `if`, `else`, `switch`, `case`, `break`, `continue`, `return`, `new`, `try`, `catch`, `finally`, `throw`, `throws`

## 6. Escape Sequences
- **Common Sequences**:
  - `\n` (new line)
  - `\t` (tab)
  - `\\` (backslash)
  - `\"` (double quote)
  - `\'` (single quote)

## 7. User Input
- **Using Scanner Class**:
  ```java
  import java.util.Scanner;

  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int number = scanner.nextInt();

## 8. Type Conversion and Casting
- **Implicit Conversion**: Java automatically converts smaller data types to larger ones.
  - Example: `int` to `long`, `float` to `double`
  - ```java
    int num = 10;
    long bigNum = num; // implicit conversion from int to long
    ```

- **Explicit Casting**: Manually converting a larger data type to a smaller one.
  - Example: `double` to `int`
  - ```java
    double pi = 3.14;
    int wholePart = (int) pi; // explicit cast from double to int
    ```

- **String Conversion**: Converting between strings and other data types.
  - `int` to `String`: `String.valueOf(intValue)`
  - ```java
    int number = 123;
    String numberStr = String.valueOf(number); // converts int to String
    ```

  - `String` to `int`: `Integer.parseInt(stringValue)`
  - ```java
    String str = "456";
    int num = Integer.parseInt(str); // converts String to int
    ```
  - `double` to `String`: `String.valueOf(doubleValue)`
  - ```java
    double decimal = 4.56;
    String decimalStr = String.valueOf(decimal); // converts double to String
    ```

  - `String` to `double`: `Double.parseDouble(stringValue)`
  - ```java
    String str = "7.89";
    double num = Double.parseDouble(str); // converts String to double
    ```

- **Other Type Conversions**:
  - `char` to `int`: 
  - ```java
    char ch = 'A';
    int ascii = (int) ch; // converts char to int (ASCII value)
    ```

  - `int` to `char`: 
  - ```java
    int ascii = 65;
    char ch = (char) ascii; // converts int (ASCII value) to char
    ```

  - `boolean` to `String`:
  - ```java
    boolean flag = true;
    String flagStr = String.valueOf(flag); // converts boolean to String
    ```

  - `String` to `boolean`:
  - ```java
    String str = "true";
    boolean flag = Boolean.parseBoolean(str); // converts String to boolean
    ```
