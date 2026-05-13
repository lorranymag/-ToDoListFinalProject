# 📝 To-Do List Final Project  
## Final Project — Java Class CIS 254  
### 👩‍💻 Authors: Lorrany E. S.Magalhaes & Elayne Vilela  

---

## 📖 Description  

This project is a **To-Do List application** built as the final project for Java Class CIS 254.  

It includes two versions:

### 💻 Java Console Version (`ToDoList.java`)  
A terminal-based task manager that runs in the console.  
It uses `ArrayList` to store and manage tasks dynamically at runtime.  

Features:
- Add tasks  
- View tasks  
- Mark tasks as completed  
- Delete tasks  

---

### 🌐 Web Version (Spring Boot + Thymeleaf)  
A modern, browser-based version of the To-Do List.  

This version connects:
- **Frontend:** HTML, CSS  
- **Backend:** Java (Spring Boot)  

Files involved:
- `index.html` → user interface  
- `ToDoController.java` → handles logic  
- `TodolistApplication.java` → runs the app  

Features:
- ➕ Add tasks  
- ✔ Mark tasks as completed  
- ✏️ Edit tasks  
- ❌ Delete tasks  
- 🎨 Clean and modern UI  

---

Both versions share the same core functionality — the web version is a **visual upgrade** of the console version.

---

## 📁 Project Structure  
project/

├──  .git/
├──  .vscode/
├──  src/
│  └──  main/
│  ├──  java/com/todo/todolist/
│  │  ├──  ToDoList.java # Console version
│  │  ├──  ToDoController.java # Web controller
│  │  └──  TodolistApplication.java # Spring Boot main app
│  └──  resources/
│  └──  templates/
│  └──  index.html # Web UI
├──  pom.xml
├──  .gitignore
└──  README.md

---

## 🚀 How to Run the Application  

### ▶️ Run the Web Version (Recommended)

1. Open the project in **Visual Studio Code**  
2. Open the terminal  
3. Run the program 
4. It will open in your browser automatically


---

## ✨ Features  

- ➕ Add new tasks  
- ✔ Mark tasks as completed  
- ✏️ Edit tasks  
- ❌ Delete tasks  
- 🔄 Dynamic updates with Spring Boot  
- 🎨 Clean and responsive interface  

---

## 🛠️ Technologies Used  

| Technology | Purpose |
|----------|--------|
| Java | Backend logic |
| Spring Boot | Web framework |
| Thymeleaf | Connects Java to HTML |
| HTML5 | Structure |
| CSS3 | Styling |
| JavaScript | UI interactivity |
| ArrayList | Task storage |
| Maven | Project management |
| VS Code | Development environment |
| GitHub | Version control |

---

## 📝 Notes  

- The web version runs using **Spring Boot (not Live Server)**  
- Make sure port **8080** is available  
- If the app doesn’t load, restart the server  

---
