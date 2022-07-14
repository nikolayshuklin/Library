public class User implements Reader, OrderBook, Postavschik, Administrator {
    String name;
    String professional;
    public User (String name, String professional){
        this.name = name;
        this.professional = professional;
    }

    @Override
    public void findBook() {
        System.out.println(this.name +" нашел нужную книгу.");
    }

    @Override
    public void BookToReader() {
        System.out.println(this.name +" Выдал книгу читателю.");
    }

    @Override
    public void outTimer() {
        System.out.println(this.name + " уведомляет о просрочке сроков сдачи книг. ");
    }

    @Override
    public void orderBook() {
        System.out.println(this.name + " заказала книгу.");
    }

    @Override
    public void postavschikBookInLibrary() {
        System.out.println(this.name + " доставил книги в библиотеку.");
    }

    @Override
    public void giveBook() {
        System.out.println(this.name + " взял книгу в библиотеке.");
    }

    @Override
    public void returnBook() {
        System.out.println(this.name + " вернул книгу в библиотеку.");
    }
};
