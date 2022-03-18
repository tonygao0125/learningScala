# learningScala </font>

## Day11 - Execptional Handling
### Definition
*One of the effective means to **handle the runtime errors** so that the regular flow of the application can be preserved.*

- An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.
- Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception such as the name and description of the exception and the state of the program when the exception occurred.
- Exceptional Handling 
- ![alt text](https://qph.fs.quoracdn.net/main-qimg-f8158a86d1c25835cb09137a955295d3-pjlq)

### Reasons
- Invalid user input
- Device failure
- Loss of network connection
- Physical limitations (out of disk memory)
- Code errors
- Opening an unavailable file

### Example
1. Read a file, however
  - File Not Fould
  - File Is Corrupted
2. Divide a/b, however denominator b=0, lead to Arithmetic issue. 

### Scala vs Java
Exception Handling in Java is very similar to Scala. But Java have two types exceptions: checked and unchecked exception; **Scala only has unchecked expression**. 
- <ins> Checked exception </ins>: Mandatory to check this kind of expression at compile time so they are also called compile time exceptions. E.g., File/Class Not Found. 
  - ClassNotFoundException
  - IOException
  - SQLException
- <ins> Unchecked exception </ins>: Not checked by the compiler, also called runtime exceptions. Exmaple: a program is ok to be compiled so checked exeption pass, but when run, it throws arithmetic error. Then, it's unchecked exception.
  - ArithmeticException
  - ArrayStoreException
  - ClassCastException

### When come across an exception, either we can make a throw or handle it.

- Throw exception - Pass the exception to the main/another program. 

- Handle - 3 ways to handle:
  1. Try...Catch... (traditional way)
  2. Try (with predifined Class)...Success/Failure...
  3. Catch object 

