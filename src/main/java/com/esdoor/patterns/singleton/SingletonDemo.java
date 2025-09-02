package com.esdoor.patterns.singleton;

final class AppConfig {
    // Eager init (thread-safe, basit)
    private static final AppConfig INSTANCE = new AppConfig();

    private AppConfig() { /* load config, etc. */ }

    public static AppConfig getInstance() { return INSTANCE; }

    public String get(String key) {
        if ("env".equals(key)) return "prod";
        if ("region".equals(key)) return "eu-central";
        return "n/a";
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        AppConfig c1 = AppConfig.getInstance();
        AppConfig c2 = AppConfig.getInstance();
        System.out.println("Same instance? " + (c1 == c2)); // true
        System.out.println("env=" + c1.get("env"));
    }
}
