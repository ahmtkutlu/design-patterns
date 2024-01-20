package org.ahmtkutlu.patterns;

public class Singleton {

    private static Singleton instance;
    private static int count = 0;

    private Singleton(){
        System.out.println("New Instance Created!");
    }

    public static Singleton getNewInstance(){
        count++;
        System.out.println(count);
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
