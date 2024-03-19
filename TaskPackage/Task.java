package TaskPackage;

import UserPackage.User;

import java.util.Scanner;

public class Task {
    public String name;
    private double start_time;
    private double finish_time;
    private  String color;
    public User user;
    public Task(String name, User user){
        this.name = name;
        this.user=user;
    }
    public Task(String name, User user, String color){
        this(name, user);
        this.color=color;
    }
    public boolean isColorValid(String color){
        for(char charColor : color.toCharArray()){
            if(charColor<48||charColor>70){
                return false;
            }
        }
        return true;
    }
    public double getDuration(){
        return finish_time-start_time;
    }
    public void setStartTime(){
        System.out.print("please enter start time:");
        Scanner input = new Scanner(System.in);
        this.start_time=input.nextInt();
        if(start_time<0) this.start_time=-start_time;
        System.out.print("please enter finish time:");
        this.finish_time=input.nextInt();
        if(finish_time<0) this.finish_time=-finish_time;
    }

}
