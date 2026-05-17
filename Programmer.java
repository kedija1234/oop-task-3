package kedijaProject;


class Programmer extends Person {

    
    protected String favoriteLanguage;

    
    public Programmer(String name, int age, String favoriteLanguage) {

        
        super(name, age);

        this.favoriteLanguage = favoriteLanguage;
    }

    
    @Override
    public void activity() {

        System.out.println(getName() + " is coding in " + favoriteLanguage);
    }


    public void showInfo() {

        System.out.println("\n--- Programmer Info ---");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Favorite Language: " + favoriteLanguage);
    }
}