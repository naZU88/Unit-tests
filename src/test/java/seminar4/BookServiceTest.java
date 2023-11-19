package seminar4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BookServiceTest {

    private Book book;

    private BookService bookService;

    private BookRepository bookRepositoryMock;

    @BeforeEach
    void setUp() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
        book = new Book();

    }

    @Test
    void getBook() {
        bookService.getBook(book);
        verify(bookRepositoryMock).processBook(book);
    }
}