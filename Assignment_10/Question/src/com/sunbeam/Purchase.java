
//Write a menu driven code that have below menus.
//1. Accept book details and add in collection
//2. Display all books from collection
//3. Sort the book details as per category and display it.
//4. Sort the book details as per author and display it.
//5. Find book by id.

package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
//import java.util.Locale.Category;
import java.util.Scanner;
import java.util.Set;

import com.sunbeam.Book.Category;

public class Purchase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Book> bookList = new HashSet<>();
		
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it");
			System.out.println("4. Sort the book details as per author and display it");
			System.out.println("5. Find book by id");
			System.out.println("ENTER YOUR CHOICE : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("THANK YOU...");
				break;

			case 1:
				Book b = new Book();
				
				try {
				b.accept(sc);
				}catch(IllegalArgumentException e){
					System.out.println("ENTER PROPER BOOK CATEGORY...");
				}
				
				bookList.add(b);
				break;

			case 2:
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;

			case 3:
				class CompareCategory implements Comparator<Book> {
					@Override
					public int compare(Book o1, Book o2) {
						return o1.getCategory().compareTo(o2.getCategory());
					}
				}
				Comparator<Book> c1 = new CompareCategory();
				List<Book> s1 = new ArrayList<>(bookList);

				Collections.sort(s1, c1);

				for (Book book : s1) {
					System.out.println(book);
				}
				break;

			case 4:
				class CompareAuthor implements Comparator<Book>{
					@Override
					public int compare(Book o1, Book o2) {
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}
				}
				break;

			default:
				System.out.println("PLEASE CHECK YOUR CHOICE...");
				break;
			}

		} while (choice != 0);

		sc.close();
	}

}
