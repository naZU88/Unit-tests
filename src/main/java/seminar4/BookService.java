package seminar4;

public class BookService{

        private BookRepository repository;

        public BookService(BookRepository repository){
            this.repository = repository;
        }

        public void getBook(Book book){
            //получение информации о книге
                repository.processBook(book);
        }

}
