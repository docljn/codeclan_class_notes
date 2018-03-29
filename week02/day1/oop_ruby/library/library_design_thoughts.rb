# Wondering if this kind of structure would work better?

# # “Design classes so there should never be more than one reason for a class to change.” # #


# class Book
#  title - read only
#  borrower
#  due date
#  home library
#  holds

# class Borrower
# name
# max books checked out = number
# number books checked out = number <= max

# class Library
# name
# catalogue = all books with home library = name
# book in stock = subset with no borrower listed
