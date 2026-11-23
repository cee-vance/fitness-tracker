# Workout Tracker

A simple command-line workout tracking application written in Java.

This project was developed as part of an introductory Java course and demonstrates object-oriented programming, file persistence, collections, and console-based user interaction. The application allows users to record workouts, categorize them by type, save workout history, and view workout statistics. 【1-f0a9ac】【2-bbdb31】【3-a2b6f7】【4-5c8a52】

## Features

- Create and store workouts
- Track workout duration in minutes
- Categorize workouts by type:
  - Cardio
  - Upper Body Strength Training
  - Lower Body Strength Training
- Save workout history between sessions
- Load previously saved workouts automatically
- View workout statistics and summaries
- Organize workouts by date and week 【1-f0a9ac】【2-bbdb31】【4-5c8a52】

## Technologies Used

- Java
- Object-Oriented Programming
- Java Collections Framework
- File I/O
- Enumerations
- Console-Based User Interface 【2-bbdb31】【3-a2b6f7】【4-5c8a52】

## Project Structure

| File | Description |
|--------|-------------|
| Menu.java | Main application entry point and menu system. 【1-f0a9ac】 |
| Workout.java | Workout data model. 【2-bbdb31】 |
| WorkoutType.java | Enumeration containing workout categories. 【3-a2b6f7】 |
| WorkoutUtils.java | Utility methods for file persistence and date conversion. 【4-5c8a52】 |
| WorkoutsByWeek.java | Weekly workout organization and statistics. |
| WorkoutUtilsTest.java | JUnit test scaffold. 【5-a1f0a7】 |

## Building the Project

Compile the application from the project root:

```bash
javac Menu.java Workout.java WorkoutType.java WorkoutUtils.java WorkoutsByWeek.java
```

## Running the Application

```bash
java Menu
```

## Data Storage

Workout data is saved locally to:

```text
workouts.txt
```

If the file does not exist, the application will create it automatically when workouts are saved. Existing workout data is loaded when the application starts. 【4-5c8a52】

## Example Workout Types

```text
CARDIO
STRENGTH_TRAINING_UPPER
STRENGHT_TRAINING_LOWER
```

## Example

```text
Workout Menu

1. Add Workout
2. View Workouts
3. View Statistics
4. Save and Exit
```

## Authors

- Collin H.
- Jacob W.

Developed as a Java course project and preserved as an example of early object-oriented software development.
