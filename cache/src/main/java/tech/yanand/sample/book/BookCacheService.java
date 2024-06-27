package tech.yanand.sample.book;

import org.springframework.stereotype.Service;
import tech.yanand.flyingcache.CacheToThread;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Service
public class BookCacheService {

    @CacheToThread("BookCache.getBooks")
    public Collection<Book> getBooks() {
        Book book1 = new Book("test_book_1", LocalDate.now());
        Book book2 = new Book("test_book_2", LocalDate.now());

        return List.of(book1, book2);
    }
}