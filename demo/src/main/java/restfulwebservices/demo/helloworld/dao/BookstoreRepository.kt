package org.deloitte.bookstore.dao

import org.deloitte.bookstore.model.Book
import org.springframework.

interface BookstoreRepository : CrudRepository<Book, String> {
}

open class CrudRepository<T, U> {

}
