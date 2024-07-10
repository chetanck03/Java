# Java Basics Overview

## Operators

### Arithmetic Operators
- **Addition (+)**: Adds two operands.
- **Subtraction (-)**: Subtracts the second operand from the first.
- **Multiplication (*)**: Multiplies two operands.
- **Division (/)**: Divides the numerator by the denominator.
- **Modulus (%)**: Returns the remainder of a division.

### Relational Operators
- **Equal to (==)**: Checks if two operands are equal.
- **Not equal to (!=)**: Checks if two operands are not equal.
- **Greater than (>)**: Checks if the left operand is greater than the right.
- **Less than (<)**: Checks if the left operand is less than the right.
- **Greater than or equal to (>=)**: Checks if the left operand is greater than or equal to the right.
- **Less than or equal to (<=)**: Checks if the left operand is less than or equal to the right.

### Logical Operators
- **AND (&&)**: Returns true if both operands are true.
- **OR (||)**: Returns true if at least one of the operands is true.
- **NOT (!)**: Reverses the logical state of its operand.

### Assignment Operators
- **Assign (=)**: Assigns a value to a variable.
- **Add and assign (+=)**: Adds and assigns a value to a variable.
- **Subtract and assign (-=)**: Subtracts and assigns a value to a variable.
- **Multiply and assign (*=)**: Multiplies and assigns a value to a variable.
- **Divide and assign (/=)**: Divides and assigns a value to a variable.
- **Modulus and assign (%=)**: Takes modulus and assigns a value to a variable.

### Increment and Decrement Operators
- **Increment (++)**: Increases a variable's value by 1.
- **Decrement (--)**: Decreases a variable's value by 1.

## If-Else Statements

### Basic Structure
```
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```

## Number Systems

### Decimal System (Base 10)
- The most common number system used by humans.
- Consists of digits 0-9.
- Example: 1234

### Binary System (Base 2)
- Used internally by almost all modern computers and computer-based devices.
- Consists of digits 0 and 1.
- Example: 1010 (which is 10 in decimal)

### Octal System (Base 8)
- Uses digits from 0 to 7.
- Was widely used in the early days of computing.
- Example: 123 (which is 83 in decimal)

### Hexadecimal System (Base 16)
- Often used in computing as a more human-friendly representation of binary-coded values.
- Consists of digits 0-9 and letters A-F (or a-f).
- Example: 1A (which is 26 in decimal)

### Conversion between Number Systems

#### Decimal to Binary
```java
int decimal = 26;
String binary = Integer.toBinaryString(decimal); // Output: "11010"
