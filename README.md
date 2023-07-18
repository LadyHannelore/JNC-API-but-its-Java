# txt-to-html-but-its-Java

This Java program, `web.java`, is a simple utility that converts the content of a text file into an HTML file. It reads the content from an input file, formats it as an HTML document, and writes the result to an output file with the same name and the `.html` extension.

## Usage

1. Make sure you have Java installed on your system.
2. Compile the `web.java` file using a Java compiler (e.g., `javac web.java`).
3. Run the program using the Java Virtual Machine (e.g., `java web`).
4. The program will prompt you to enter the filename of the input text file. Provide the file path and press Enter.

## Input File

The input text file should contain the content you want to convert to an HTML document. The program will read the file line by line, preserving the line breaks, and format the content accordingly in the output HTML file.

## Output File

The program will generate an output HTML file with the same name as the input file, but with the `.html` extension. If the input file name contains no extension, the program will append the `.html` extension to it.

## Note

1. Ensure that the input file exists in the specified path before running the program.
2. The program uses the standard Java library (`java.io`) to read and write files.

## Example

Suppose you have a file named `example.txt` with the following content:

```
This is line 1.
This is line 2.

This is line 4.
```

Running the `web` program on this file will generate an output file named `example.html` with the following content:

```html
<html>
<head>
</head>
<body>
This is line 1.
<br>
This is line 2.
<br>
<br>
This is line 4.
<br>
</body>
</html>
```

Please make sure to use the program responsibly and provide valid input files to avoid any unexpected behavior or errors.

Feel free to modify and enhance the program according to your needs! Happy coding!
