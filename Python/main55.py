# Magic methods = Dundar methods (double underscore) __init__, __str__, __eq__
#                 They are automaticallyy called by many of PYthon's built-in operations
#                 They allow developers to define or customize the behaviour of objects

class Book:

    def __init__(self, title, author, num_page):
        self.title = title
        self.author = author
        self.num_page = num_page

    def __str__(self):
        return f"{self.title} by {self.author}"
    
    def __eq__(self, other):
        return self.title == other.title and self.author == other.author
    
    def __lt__(self, other): #lt = less than
        return self.num_page < other.num_page
    
    def __gt__(self, other): #gt = less than
        return self.num_page > other.num_page
    
    def __add__(self, other): 
        return f"{self.num_page + other.num_page} pages"
    
    def __contains__(self, keyword):
        return keyword.upper() in self.title or keyword.upper() in self.author
    
    def __getitem__(self, key):
        if key == "title":
            return self.title
        elif key == "author":
            return self.author
        elif key == "num_page":
            return self.num_page
        else:
            return f"{key} was not found"

book1 = Book("THE HOBBIT", "J.R.R. Tolkien", 310)
book1testing = Book("THE HOBBIT", "J.R.R. Tolkien", 132)
book2 = Book("HARRY POTTER AND THE SOCERRORS STONE", "J.K. Rowling", 223)
book3 = Book("THE LION, THE WITCH AND THE WARDROBE", "C.S. Lewis", 172)

print(book1)
print(book2)
print(book3)

print(book1 == book1testing)

print(book1 > book2)
print(book3 < book2)
print(book2 + book3)
print("Lion" in book3)
print("Prince" in book1)

print(book1['title'])
print(book1['author'])
print(book1['num_page'])
print(book2['title'])
print(book2['author'])
print(book2['num_page'])
print(book3['title'])
print(book3['author'])
print(book3['num_page'])