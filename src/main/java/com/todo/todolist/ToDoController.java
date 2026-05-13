package com.todo.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class ToDoController {

    ArrayList<String> tasks = new ArrayList<>();
    ArrayList<Boolean> completed = new ArrayList<>();

   @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks", tasks);
        model.addAttribute("completed", completed);
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String task) {

        if (!task.trim().isEmpty()) {
            tasks.add(task);
            completed.add(false);
        }

        return "redirect:/";
    }

    @PostMapping("/complete")
    public String completeTask(@RequestParam int index) {

        completed.set(index, true);

        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTask(@RequestParam int index) {

        tasks.remove(index);
        completed.remove(index);

        return "redirect:/";
    }

    @PostMapping("/edit")
    public String editTask(@RequestParam int index, @RequestParam String task) {

        if (index >= 0 && index < tasks.size() && !task.trim().isEmpty()) {
            tasks.set(index, task);
        }

        return "redirect:/";
    }
}