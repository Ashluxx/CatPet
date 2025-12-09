
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Yuke Cao                   |
| Date         | 12/09/2025                 |
| Course       | Fall 2025                  |
| Assignment # | Final Project              |

# Project Overview
This project is a small Cat Pet simulator, focusing on two key design patterns: 
the Builder Pattern and the State Pattern.
It has a `Cat` object with different states (hungry, satisfied, sleepy).  
User actions ( feed / play ) change the state, and the cat meows differently.  
I also provide a simple builder to create a cat with chosen attributes (name, breed, eye color, hair color, gender, age).  
No GUI. I focus on clean classes and simple methods.

# GitHub Link:
https://github.com/Ashluxx/CatPet

# Implementation Description

### Flexibility
1. New states can be added easily: just create a new class that implements `CatState`
and override two small methods (`meow`, `getName`). Then set it into `Cat`.  
2. `CatBuilder` allow us add more optional attributes later
without breaking existing constructors.  


### Simplicity and Understandability
Each class has one clear job:  
1. `Cat` keeps the current state and exposes simple methods like `meow()`, `setState(...)`, `handleAction(...)`.  
2. `CatState` is a small interface.  
3. `HungryState`, `SatisfiedState`, `SleepyState` hold a specific behavior for each state.  
4. `CatBuilder` creates `Cat` objects.

### Avoid Duplicated Code
1. State Pattern removes duplicated checks: Meow behavior is placed inside state classes, 
not in the Cat class. This means we don't have to write long if/else statements for status checks everywhere.
2. Builder Pattern centralizes object creation: 
All complex setup logic is in CatBuilder.createCat(). 
This stops us from repeating the long list of initialization code whenever we create a new Cat.

### Design Patterns Used
1. **State Pattern**: `CatState` (interface) + `HungryState` / `SatisfiedState` / `SleepyState`.  
  `Cat` holds a `CatState` reference. This pattern keeps behavior for each state in its own class and makes transitions easy to manage.
2. **Builder Pattern**: `CatBuilder` for building a `Cat` with optional fields.  
  I chose it because we may extend attributes later, and the builder keeps the constructor simple for a student project.

### Assumptions
Only three states are existing: hungry, satisfied, sleepy.   
Actions are represented as simple strings in `handleAction(action)`.

# Project Structure
```

src/
main/java/...
Cat.java
CatBuilder.java
CatState.java
HungryState.java
Main.java
SatisfiedState.java
SleepyState.java
test/java/...
CatTest.java
pom.xml
README.md
UML.png

````

# Build & Run

Environment: JDK 1.8 and Maven

## Compile
```bash
mvn clean compile
````

## Run tests

```bash
mvn clean test
```

