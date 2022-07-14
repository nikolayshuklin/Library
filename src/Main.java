public class Main {
    public static void main(String[] args) {
        User reader = new User("Вася","читатель");
        User administrator = new User ("Елена Сергеевна", "администратор");
        User postavschik = new User ("Жора", "поставщик");
        administrator.orderBook(); // администратор заказала книгу
        postavschik.postavschikBookInLibrary(); // поставщик доставил книги в библиотеку
        administrator.findBook(); // администратор нашла книгу
        administrator.BookToReader();//  администратор выдала книгу пользователю
        reader.giveBook(); // читатель взял книгу
        administrator.outTimer(); // администратор предупредила о просрочке сроков сдачи книги
        reader.returnBook(); // пользователь вернул книгу в библиотеку

    }
}
