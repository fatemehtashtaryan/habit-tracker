package UserPackage;

import Activity.ToDo;
import TaskPackage.Task;
import UtilityPackage.Utils;

import java.util.Objects;
import java.util.Scanner;

public class User{
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public String email;
    public int streak;
    private ToDo[] tasks = new ToDo[100];
    public static int count=0;
    public static Task[] TaskArray = new Task[100];
    public User(String username,String password,String first_name,String last_name,String email){
        setUsername(username);
        setPassword(password);
        setFirstName(first_name);
        setLastName(last_name);
        if(!Utils.isEmailValid(email)) this.email="gmail@gmail.com";
        else this.email=email;
    }
    Scanner scan = new Scanner(System.in);
    public void createToDo(){
            tasks[count+1] = new ToDo();
    }
    public String getFullName(){
        String fullname = first_name.concat(" " +last_name);
        return  fullname;
    }
    public void setPassword(String password){
        Utils Utils1 = new Utils();
        if(Utils1.isPasswordValid(password)){
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
    public Task getTaskByName(String Name){
        for(int i =0; i<count; i++){
            if(Objects.equals(TaskArray[count].name, Name)) return TaskArray[count];
        }
        System.out.print("not found");
        return null;
    }
    public Task[] getTaskByColor(String color){
        Task[] sameColorTask = new Task[count];
        int j =0;
        for(int i =0; i<count; i++){
            if(Objects.equals(TaskArray[count].color, color)){
                sameColorTask[j]=TaskArray[i];
            }
        }
        return sameColorTask;
    }
    public void setFirstName(String FirstName){
        char[] charArray= FirstName.toCharArray();
        if(charArray[0]>90) Character.toUpperCase(charArray[0]);
        for(int i =1; i<FirstName.length(); i++){
            if (charArray[i]<65) Character.toLowerCase(charArray[i]);
        }
        this.first_name=new String(charArray);
    }
    public void setLastName(String lastName){
        char[] charArray= lastName.toCharArray();
        if(charArray[0]>90) Character.toUpperCase(charArray[0]);
        for(int i =1; i<lastName.length(); i++){
            if (charArray[i]<65)Character.toLowerCase(charArray[i]);
        }
        this.last_name=new String(charArray);
    }
    public Boolean isToDoRepetitive(String name){
        for(int i =0; i<tasks.length; i++){
            if(tasks[i].name.equals(name)) return false;
        }
        return true;
    }
    public ToDo[] getToDosByColor(String color){
        ToDo[] todos = new ToDo[100];
        int count=0;
        for(int j=0; j<tasks.length; j++){
            if(tasks[j].getColor().equals(color)) todos[count++] = tasks[j];
        }
        return todos;
    }

}
