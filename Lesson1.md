# 📘 Topic 01 – Getting Started with Java

Welcome to this topic of the **Java Learning Path**. In this section, you'll learn the essential foundations of programming and discover why Java is a key language in modern development.

---

## 🧠 What Is a Program?

A **program** is a series of instructions a computer can understand and execute.  
An **application** is a full working solution that includes programs, resources, and documentation.

---

## 🔁 Application Life Cycle & Types of Errors

Every application goes through a life cycle:  
**Design → Development → Testing → Deployment → Maintenance**

### Common error types:
- **Syntax errors**: Mistakes in the grammar of the code
- **Runtime errors**: Happen while the program is running
- **Logical errors**: Code runs but gives incorrect results

---

## 📜 Evolution of Programming Languages

### 🧬 Generations of programming languages:
- **1st Generation**: Machine Code (binary)
- **2nd Generation**: Assembly Language
- **3rd Generation**: High-Level Languages (e.g., Java, C)
- **4th Generation**: Declarative/Visual Languages (e.g., SQL)
- **5th Generation**: Object-Oriented Languages (e.g., Java, C++)

---

## 💻 Compilers vs Interpreters

### Interpreters:
- Translate and run code line-by-line
- Good for web and cross-platform use
- Slower performance

### Compilers:
- Translate the entire code before running
- Optimised and faster
- Java uses **both**: it compiles to bytecode and interprets with the JVM

---

## ☕ Introduction to Java

Java was created by **Sun Microsystems** in the 1990s, originally called **Oak**.  
Renamed to **Java** in 1995, it was designed to be:
- **Portable**
- **Secure**
- **Object-Oriented**

### Key components:
- **JDK (Java Development Kit)** for compiling and running code
- **JVM (Java Virtual Machine)** for cross-platform compatibility
- IDEs: IntelliJ, Eclipse, NetBeans, VS Code

---

## 🧱 Structure of a Java Programme

### Key elements:
- **Comments** (`//`, `/* */`)
- **Keywords** (`public`, `class`, `static`)
- **Statements** (end with `;`)
- **Blocks** (`{ }`)
- **Classes** (blueprints for objects)
- **Methods** (e.g., `main()`)

### Example:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
