# Computer Science Interactive Flowchart

This is a flowchart that allows the user to interact with the Computer Science current courses at Purdue.

## The Problem

Purdue offers two things: a flowchart and a course catalog that shows information about the course. Everytime I have to search for a course, I have to change between the webs, which is very irritating. That leads to myself thinking, why don’t I integrate both into one?

## How It Works

For version 1.0, the user types in the console what course they want to find information about, and the system will answer some basic information back about the course, and return no such courses if the course does not exist.

For version 2.0, this will be extended into a basic flowchart that shows the information when a user clicks on the course.

## Tech Stack

- **Language:** Java
- **Libraries:** JavaFX

## Setup

```bash
git clone https://github.com/vgbao435/CS-Course-map
cd CS-Course-map
javac -d out src/*.java
```

## Usage

```bash
java -cp out System
```

## Roadmap

Features you haven't built yet but plan to (pull these from your
"Schedule" quadrant in the Eisenhower Matrix).

- [ ] Course.java function without compile error or logic error. Build the first Course object CS 180.
- [ ] Build multi courses in System.java and build a prerequisite system.
- [ ] Include basic information retrieved from Purdue website about the courses.
- [ ] Build a function that finds the shortest path to reach a course from CS 180.
- [ ] Clickable JFrame map of courses
- [ ] Add MATH and STAT courses, beside CS courses
- [ ] Improve the User Interface, starting to look for new utilities for version 3.0


## Author

Gia Bao Vu, https://github.com/vgbao435/CS-Course-map

