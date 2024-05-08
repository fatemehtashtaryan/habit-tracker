package TaskPackage;
import
 UserPackage.User;

import java.util.Scanner;

public class Task {
    public String name;
    private double start_time;
    private double finish_time;
    public final String color;
    public User user;
    public Task(String name, User user){
        setName(name);
        this.user=user;
        this.color=null;
    }
    public Task(String name, User user, String color){
        setName(name);
        this.user=user;
        this.color=color;
    }
    public void setName(String name){
        if(name.length()>10) {System.out.print("Your number is not valid"); this.name="ali";}
        else this.name=name;
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
    public void setColor(String color){
        for(char charColor : color.toCharArray()){
            if(charColor <48 || charColor >70){
                System.out.print("please again enter color:");
                Scanner input = new Scanner(System.in);
                setColor(input.next());
            }
        }
    }

}
