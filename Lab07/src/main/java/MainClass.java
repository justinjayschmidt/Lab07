public class MainClass {
    
    public static void main(String[] args){
        User user01 = new User("Jay", "Chicago");
        user01.tweet("First tweet").display();
        
        User user02 = new User("Joe");
        user02.tweet("Hi! This is Joe").display();
        
        User user03 = new User("Emily", "New York City");
        user03.tweet("Such a beautiful day in NYC today!").display();
        
        user02.tweet("Wish I could get some deep dish right now.").display();       
    }
}
