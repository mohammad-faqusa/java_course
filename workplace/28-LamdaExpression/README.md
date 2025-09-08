# Java Lambda Expressions: A Step-by-Step Course (A to Z)

Welcome! This project will teach you Java lambda expressions from the ground up through short lessons and hands-on exercises.

How to use this course:
- Follow the lessons in `src/lessons` in numeric order.
- Try the exercises in `src/exercises` after each lesson.
- You can run any class with a `main` method from your IDE or `javac`/`java`.

Prerequisites:
- Java 8+ (lambdas were introduced in Java 8).

Contents:
1. Lesson 01 – Functional Interfaces: What and Why
2. Lesson 02 – Lambda Syntax and Variations
3. Lesson 03 – Built-in Functional Interfaces
4. Exercises 01–02 – Practice Tasks

We will expand with method references, scope, streams, composition, exceptions, primitive specializations, and best practices in later lessons. For now, start with Lesson 01!

Quick start:
- Open `src/lessons/Lesson01_FunctionalInterface.java` and run it.
- Then open `src/exercises/Exercise01_Calculator.java` and complete the TODOs.

Quick Run (CLI):
- Compile all sources:
  javac -d out -sourcepath src src\**\*.java
- Run Lesson 1:
  java -cp out lessons.Lesson01_FunctionalInterface
- Run Exercise 1:
  java -cp out exercises.Exercise01_Calculator

Notes:
- The existing `Calculator` interface and `Main` class show a simple example: passing a lambda `(a, b) -> a + b` to a method.
- Feel free to modify or duplicate the files for experiments.
