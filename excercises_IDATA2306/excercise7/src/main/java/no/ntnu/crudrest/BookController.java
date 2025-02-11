package no.ntnu.crudrest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

/**
 * REST API controller for book collection.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    /**
     * Get All books.
     * HTTP GET to /books
     *
     * @return List of all books currently stored in the collection
     */
    @GetMapping
    public Collection<Book> getAll() {
        // Implementation will depend on service or repository
        return null;
    }

    /**
     * Get a specific book.
     *
     * @param id ID of the book to be returned
     * @return Book with the given ID or status 404
     */
    @GetMapping("/{id}")
    public ResponseEntity<Book> getOne(@PathVariable Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * HTTP POST endpoint for adding a new book.
     *
     * @param book Data of the book to add
     * @return 201 Created on success, 400 Bad request on error
     */
    @PostMapping
    public ResponseEntity<String> add(@RequestBody Book book) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Delete a book from the collection.
     *
     * @param id ID of the book to delete
     * @return 200 OK on success, 404 Not found on error
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * Update a book in the repository.
     *
     * @param id   ID of the book to update
     * @param book New book data
     * @return 200 OK on success, 400 Bad request on error
     */
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Book book) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}