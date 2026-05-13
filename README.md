## 📝 To Do List Final Project
## Final Project — Java Class 254
### 👩‍💻 Authors: Lorrany Evangelista Schiavo Magalhaes and Elayne Vilela.

## 📖Description

This project is a To-Do List application built as the final project for Java Class CIS 254. It comes in two versions:

## Java Console Version (ToDoList.java) — 
a terminal-based task manager that runs in the console. It uses ArrayList to store and manage tasks dynamically at runtime, allowing users to add, view, complete, and delete tasks through a numbered menu.

## HTML Visual Version (index.html) — 
a modern, browser-based interface for the same To-Do List. Built with HTML, CSS, and JavaScript, it offers a clean visual experience with real-time task tracking, a progress bar, filters, and data persistence through localStorage so tasks are saved even after closing the browser.

Both versions share the same core logic and features — the HTML version is simply a visual upgrade over the console version.

This application allows the user to add simple tasks to a to-do list.

## 📁 Project Structure

project/
├── .git/                  ← Git version control (auto-generated)
├── .vscode/               ← VS Code workspace settings
├── src/                   ← All source files live here
│   ├── Main               ← Where the files for this code is 
│   ├── java/com/todo/ todolist     ← Java console-based To-Do List
│   ├── ToDoController.java         ← HTML/CSS/JS visual To-Do List
│   └── TodolistApplication         ← Tells Git what not to upload
├── templates/  
├── └──index.html                  ← HTML/CSS/JS visual To-Do List     
├── .gitattributes                 ← No use
├── .gitignore                     ←  No use  
└── README.md                      ← This file

### 🚀How to use the application
## Running the HTML Version (recommended)

1. Open the project in Visual Studio Code
2. Open the finel you download from GitHub 
3. Open src, main, java/com/todo/ todolist, then TodolistApplication 
4. Click "Go Live" at the bottom right of VS Code
5. The app will open in your browser automatically

## Features available in the browser:

- Add a new task by typing and pressing Enter or clicking + Add
- Click the check button when tasks are completed
- Click the delete button if you no longer want that tasks
- Click the edit button if you misspelled the word
- Use the All / Active / Completed filters to sort your view
- Tasks are automatically saved in the browser — they persist after refresh

### 🛠️ Technologies Used
|Technology | Purpose

| Java | Console app logic and Swing welcome screen | Java ArrayList | Dynamic task storage at runtime | Java Swing | Desktop GUI window for welcome screen | HTML5 | Structure of the visual To-Do List | CSS3 | Styling, animations, and layout | JavaScript | App logic and interactivity in the browser | localStorage | Saves tasks in the browser between sessions | VS Code | Code editor | GitHub | Version control and project hosting
