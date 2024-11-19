/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart.one;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
 public class AddingTasks {
    private List<Task> tasks;
    
    public  AddingTasks(){
    this.tasks = new ArrayList<>();
} 
    //to add a new task we should use a method
    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(int id){
        tasks.removeIf(task -> task.getID().equals(id));
    }
    public Task getTask(int id){
        for(Task task:tasks){
            if(!task.getID().equals(id)){
            } else {
                return task;
            }
        }
        return null;
    }
    public void displayTask(){
        for (Task task:tasks){
        System.out.println(task);
    }
        


    }
    }
