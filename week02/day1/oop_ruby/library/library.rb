#library.rb
# INSTRUCTION
# Model a Library as a class.
#
# * Create a class for a Library that has an array of books. Each book should be a hash with a title, which is a string, and rental details, which is another hash with a student name and due date.
#
#

# MY COMMENTS:
# 1. My methods are ugly.
# 2. I want three classes, with the library overseeing the relationship between books and borrowers.
# 3. I'm still not sure that my tests are testing the right things!

class Library

  attr_reader :books_array

  def initialize(books_array)
    @books_array = books_array || []  # if no array given, won't fail because @books_array == nil
  end

  # * Create a method that lists all the books and their corresponding details.

  def book_list
    for book in @books_array
      puts "Title: #{book[:title]}"
      puts "Borrower: #{book[:rental_details][:student_name]}"
      puts "Return due date: #{book[:rental_details][:date]}"
    end
  end

  # CARE: actually wanted to RETURN the books and info.

  # Create a method that takes in a book title and returns all of the information about that book.

  def book_info(title_string)
    for book in @books_array
      return book if book[:title] == title_string
    end
    return nil
  end

  # Create a method that takes in a book title and returns only the rental details for that book.

  def book_rental(title_string)
    book = book_info(title_string)
    if book == nil
      return "Book not found."
    end
    return book[:rental_details]
  end

  # Create a method that takes in a book title and adds it to our book list (Add a new hash for the book with the student name and date being left as empty strings)

  def add_book(title_string)
    book = {}
    book[:title] = title_string
    book[:rental_details] = {}
    book[:rental_details][:student_name] = ""
    book[:rental_details][:date] = ""

    @books_array.push(book)

  end

  # Create a method that changes the rental details of a book by taking in the title of the book, the student renting it and the date it's due to be returned.

  def change_rental(book_title, borrower, return_date)
    book = book_info(book_title)
    book[:rental_details][:student_name] = borrower
    book[:rental_details][:date] = return_date
    return book
  end

end


# end library.rb
