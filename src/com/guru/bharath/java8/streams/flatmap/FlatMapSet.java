/**
 * 
 */
package com.guru.bharath.java8.streams.flatmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author AB40286
 *
 */
public class FlatMapSet {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("Guru");
		student1.addBook(new Book("Java 8 in Action"));
		student1.addBook(new Book("Spring Boot in Action"));
		student1.addBook(new Book("Effective Java (2nd Edition)"));

		Student student2 = new Student();
		student2.setName("Bharath");
		student2.addBook(new Book("Learning Python, 5th Edition"));
		student2.addBook(new Book("Effective Java (2nd Edition)"));

		List<Student> students = Arrays.asList(student1, student2);

		System.err.println("=====================================================");
		students.stream().map(Student::getBooks)// Set<Book>
				.forEach(System.out::println);

		System.err.println("=====================================================");
		students.stream() // List to Stream
				.map(Student::getBooks) // Get only Books //Stream<Set<Book>>
				.flatMap(e -> e.stream()) // Stream<Book>
				.forEach(System.out::println);

		System.err.println("=====================================================");
		students.stream()// List to Stream
				.map(s -> s.getBooks()) // Stream<Set<Book>>
				.flatMap(b -> b.stream()) // Stream<Book>
				.map(Book::getBookName) // Stream<String>
				.distinct().forEach(System.out::println);

	}

	static class Student {

		private String name;
		private Set<Book> books = new HashSet<>();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Book> getBooks() {
			return books;
		}

		public void setBooks(Set<Book> books) {
			this.books = books;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", books=" + books + "]";
		}

		public void addBook(Book book) {

			if (books == null) {
				books = new HashSet<>();
			}
			books.add(book);
		}

	}

	static class Book {
		private String bookName;

		public String getBookName() {
			return bookName;
		}

		@Override
		public String toString() {
			return "Book [bookName=" + bookName + "]";
		}

		public Book(String bookName) {
			super();
			this.bookName = bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
	}
}
