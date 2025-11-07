# Business Rules Demo

This demonstration showcases how GitHub Copilot can assist with implementing business logic and rule-based systems. The project focuses on cost calculation algorithms and rule engine architecture patterns.

## Project Structure

- **`RulesEngine.java`** - Core rules engine implementation
- **`costing/CostCalculator.java`** - Business costing logic with decision table patterns
- **`USER_STORY.md`** - Business requirements and user stories for the cost calculation system
- **`pom.xml`** - Maven project configuration

## Key Concepts Demonstrated

- **Business Rule Implementation**: Converting business requirements into code
- **Decision Table Logic**: Using table-driven approaches to minimize conditional logic
- **Rule Engine Architecture**: Structured approach to implementing business rules
- **Code Generation from Requirements**: Translating user stories into functional classes
- **Reverse Engineering**: Extracting business logic documentation from existing code

## Demo Steps

1. With the file `USER_STORY.md` file open in the IDEA, enter the prompt `Generate the Java classes the implements the user story`.
2. The step above should generate a `CostCalculator` class or similar with a placeholder for `calculateCost` (or similar) method.
3. Implement the decision table logic in the `calculateCost()` method.
4. Can I use a table-driven approach to `calculateCost()` to minimise the use of if-else?
5. A reverse engineering use case -> Assuming we lost the docs or user story is out of date. Enter the prompt `Can you extract the decision table from this code block?` to generate the decision table from code.

## Learning Outcomes

This demo illustrates GitHub Copilot's ability to:
- Translate business requirements into structured code
- Suggest architectural patterns for rule-based systems
- Optimize conditional logic using table-driven approaches
- Generate documentation from existing code implementations

## Getting Started

Build and run the project using Maven:

```bash
mvn clean compile
mvn exec:java
```