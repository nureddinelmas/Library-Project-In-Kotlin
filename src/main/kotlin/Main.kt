fun main(args : Array<String>) {

    var book1 = Book(141,"Sverige", "Nureddin", 2017,200, true)
    var book2 = Book(142,"Turkiet", "Lena", 2019,460, true)
    var bookList = ArrayList<Book>()
    bookList.add(book1)
    bookList.add(book2)

    var library = Library(bookList)
       library.EnterIn(bookList)
}









