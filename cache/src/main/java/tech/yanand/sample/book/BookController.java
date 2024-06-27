package tech.yanand.sample.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    private static final Logger LOG = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookCacheService bookCacheService;

    @GetMapping("/get_books")
    public Collection<Book> getBooks() {
        Collection<Book> books = bookCacheService.getBooks();
        Collection<Book> books1 = bookCacheService.getBooks();

        LOG.info("Books instance is same: [{}]", books == books1);

        return books;
    }
}
