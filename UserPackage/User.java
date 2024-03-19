package UserPackage;

import TaskPackage.Task;
import UtilityPackage.Utils;
import java.util.Scanner;

public class User{
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public String email;
    public int streak;
    public static int count=0;
    public static Task[] TaskArray = new Task[100];
    public User(String username,String password,String first_name,String last_name,String email){
        setUsername(username);
        setPassword(password);
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
    }
    Scanner scan = new Scanner(System.in);
    public Task createTask(String name){
        if(isTaskRepetitive(name)){
            System.out.print("This is a duplicate name!!!");
        }
        System.out.print("Would you like to add a color? (y/n)");
        char answer = scan.next().charAt(0);
        if (answer == 'y'){
            System.out.print("Please enter your color's task:");
            String color = scan.next();
            TaskArray[count+1] = new Task(name, this, color);
        }
        else{
            TaskArray[count+1] = new Task(name, this);
        }
        return TaskArray[count+1];
    }
    public String getFullName(){
        String fullname = first_name+" "+last_name;
        return  fullname;
    }
    public void setPassword(String password){
        if(isPasswordValid(password)){
            this.password = password;
        }
        else System.out.print("Your Password is not valid, please enter new password");
        setPassword(scan.next());
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
    public boolean isTaskRepetitive(String name){
        for(int i =0; i<TaskArray.length; i++){
            if(TaskArray[i].name.equals(name)) return false;
        }
        return true;
    }
}
