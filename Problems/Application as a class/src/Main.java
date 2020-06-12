class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String i : args) {
            System.out.println(i);
        }
    }
}
