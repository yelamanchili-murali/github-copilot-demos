# Refactoring Demo

This demonstration showcases GitHub Copilot's capabilities in code refactoring and improving existing codebases. The project appears to be based on a billing/invoicing system for entertainment performances, providing a realistic scenario for exploring refactoring techniques.

## Project Structure

- **`FilterPlays.java`** - Data filtering and query logic
- **`Invoice.java`** - Invoice handling and billing operations
- **`Performance.java`** - Performance-related functionality and calculations
- **`Play.java`** - Domain objects representing entertainment performances
- **`StatementPrinter.java`** - Statement generation and formatting logic
- **`pom.xml`** - Maven project configuration

## Key Concepts Demonstrated

- **Code Refactoring Techniques**: Improving existing code structure and readability
- **Legacy Code Improvement**: Working with and modernizing existing codebases
- **Clean Code Principles**: Applying best practices for maintainable code
- **Design Pattern Implementation**: Recognizing and implementing common patterns
- **Method Extraction**: Breaking down complex methods into smaller, focused units
- **Logic Visualization**: Understanding complex code through visual representation

## Demo Steps

1. `/explain` - Use Copilot to understand existing code structure and logic
2. `/doc` - Generate documentation for existing methods and classes
3. Select the `print` method in `StatementPrinter.java` and apply the prompt `Visualise the logic of this method using ASCII` in Copilot chat.
4. Refactor the `print` method - make it modular and readable.

## Learning Outcomes

This demo illustrates GitHub Copilot's ability to:
- Analyze and explain complex existing code
- Generate comprehensive documentation for undocumented code
- Visualize complex logic flows for better understanding
- Suggest refactoring improvements for better code organization
- Apply clean code principles to legacy codebases

## Getting Started

Build and run the project using Maven:

```bash
mvn clean compile
mvn exec:java
```

## Refactoring Focus Areas

The `StatementPrinter.print()` method serves as the primary example for demonstrating:
- Complex method decomposition
- Conditional logic simplification
- Code organization and modularity improvements
- Performance calculation optimization