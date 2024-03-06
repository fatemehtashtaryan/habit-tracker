package UserPackage;

import TaskPackage.Task;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public String email;
    public int streak;
    public User(String username,String password,String first_name,String last_name,String email){
        setUsername(username);
        setPassword(password);
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
    }
    public Task createTask(){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your task name:");
        String name= input.next();
        Task task1 = new Task(name);
        return task1;
    }
    public String getFullName(){
        String fullname = first_name+" "+last_name;
        return  fullname;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public  void  setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
}
