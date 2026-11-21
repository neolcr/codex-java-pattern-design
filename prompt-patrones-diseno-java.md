# Project: Java Design Patterns — 23 GoF Patterns

Act as a senior software engineer specializing in Java, software architecture, design patterns, and technical education.

Your goal is to **create from scratch a complete, functional, and educational repository implementing all 23 Gang of Four (GoF) design patterns in Java**.

Do not limit yourself to proposing an architecture or generating a project skeleton. You must implement all examples, document them, test them, and deliver a fully completed project.

## 1. Technologies

- Java 21.
- Maven.
- JUnit 5.
- No Spring or unnecessary frameworks.
- Code and documentation in Spanish, while preserving the official design pattern names and standard Java naming conventions.

## 2. Required Design Patterns

**Creational (5):**

Singleton, Factory Method, Abstract Factory, Builder, and Prototype.

**Structural (7):**

Adapter, Bridge, Composite, Decorator, Facade, Flyweight, and Proxy.

**Behavioral (11):**

Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, and Visitor.

## 3. Project Structure

Organize the project by categories and design patterns.

Each pattern must have its own package under `com.neol.patterns`.

Do not mix implementations of different design patterns.

## 4. Requirements for Each Design Pattern

For each of the 23 design patterns:

1. Select a realistic and easy-to-understand use case.
2. Explain the problem that motivates the application of the pattern.
3. Implement the necessary classes and interfaces.
4. Include a `Demo` class with an executable `main` method.
5. Implement JUnit 5 tests that verify the expected behavior.
6. Create a Markdown document containing:
   - Purpose of the pattern.
   - Problem it solves.
   - Structure and participants.
   - Explanation of the implementation.
   - Mermaid class diagram.
   - Advantages and disadvantages.
   - When to use it.
   - When to avoid it.
   - Differences compared to related design patterns.

The examples should be simple while accurately representing the original GoF pattern.

## 5. Code Quality

- Follow Java best practices.
- Favor composition where appropriate.
- Avoid unnecessary abstractions.
- Use descriptive names.
- Avoid external dependencies unless necessary.
- Keep examples independent of one another.
- Do not generate placeholder code or incomplete implementations.
- Do not leave TODOs or unfinished methods.

## 6. General Documentation

Create a `README.md` that includes:

- Repository purpose.
- Installation requirements.
- How to build and run the examples.
- How to execute the tests.
- A table listing all 23 design patterns grouped by category.
- Links to the documentation and source code for each pattern.
- A general comparison of the three design pattern categories.

## 7. Repository Instructions

Create an `AGENTS.md` file documenting:

- Project goals and architecture.
- Coding conventions.
- Package organization.
- Rules for adding or modifying examples.
- Documentation and testing requirements.
- Validation commands.

## 8. Continuous Integration
Get up a CI pipeline (e.g., GitHub Actions) that:
Automatically builds the project and runs the tests.

## 9. Execution Plan

Work in phases:

1. Initialize Maven, Git, and the repository structure.
2. Create `AGENTS.md` and the initial `README.md`.
3. Implement the five creational design patterns.
4. Implement the seven structural design patterns.
5. Implement the eleven behavioral design patterns.
6. Complete the documentation.
7. Configure continuous integration.
8. Run the final validation checks.

Validate each group before proceeding to the next.

If errors occur, investigate and fix them.

## 10. Definition of Done

Do not consider the work complete until:

- All 23 design patterns have been implemented.
- Every pattern has its own `Demo` class.
- Every pattern has automated tests.
- Every pattern has documentation.
- `mvn clean verify` completes successfully.
- The README links to all 23 examples.
- No implementations remain unfinished.

Once finished, provide a summary including the files created, the 23 patterns implemented, the test results, and any remaining limitations.

Do not claim to have executed validations that have not actually been performed.

**Start by creating the repository and execute the entire plan until completion. Do not stop after generating only the project structure.**