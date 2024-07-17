package tech.yanand.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.yanand.sample.book.Book;
import tech.yanand.sample.book.BookMapper;

import java.time.LocalDate;
import java.util.List;

@Component
public class BookCommandLineRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(BookCommandLineRunner.class);

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("test_book_1", LocalDate.now());
        Book book2 = new Book("test_book_2", LocalDate.now());

        int result = bookMapper.insertAll(List.of(book1, book2));
        LOG.info("Insert result: {}", result);

        List<Book> bookList = bookMapper.selectAll();
        LOG.info("Select result: {}", bookList);
    }
}
