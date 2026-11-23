# Workout Tracker

A simple command-line workout tracking application written in Java.

This project was developed as part of an introductory Java course and demonstrates object-oriented programming, file persistence, collections, and console-based user interaction. The application allows users to record workouts, categorize them by type, save workout history, and view workout statistics. 

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
- Organize workouts by date and week 

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
| Menu.java | Main application entry point and menu system. |
| Workout.java | Workout data model.  |
| WorkoutType.java | Enumeration containing workout categories.  |
| WorkoutUtils.java | Utility methods for file persistence and date conversion.  |
| WorkoutsByWeek.java | Weekly workout organization and statistics. |
| WorkoutUtilsTest.java | JUnit test scaffold.  |

## Building the Project

Compile the application:

```bash
cd Fitness_Tracker
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

If the file does not exist, the application will create it automatically when workouts are saved. Existing workout data is loaded when the application starts. 

## Unit Testing

The repository includes a JUnit 5 test scaffold:

- `WorkoutUtilsTest.java`

This project does not include JUnit libraries in the repository. To run the tests, download the JUnit Platform Console Standalone JAR and place it in the project root.

Compile the project and tests:

```bash
javac -cp .;junit-platform-console-standalone.jar *.java
```

Run the tests:

```bash*java -jar junit-platform-console-s*andalone.jar --class*path . --scan-class-path
```

### *inux / macOS

Compile:

```bash
ja*ac -cp .:junit-platform-console-st*ndalone.jar *.java
```

Run:

```b*sh
java -jar junit-platform-consol*-stand*lone.jar --class-path . --scan-cla*s-path
```
````*

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
