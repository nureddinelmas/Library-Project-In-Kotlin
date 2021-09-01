import kotlin.random.Random

class Library (bookList: ArrayList<Book>) {


    fun AddBook(bookList: ArrayList<Book>){
        var bookId = Random.nextInt(1,100)
        println("Ange bokname : ")
        var name = readLine().toString()
        println("Ange bok författare : ")
        var författare = readLine().toString()
        println("vilket år :")
        var ar = readLine()!!.toInt()
        println("upplaga ?")
        var upplaga = readLine()!!.toInt()

        println("-------------------------------------------------")
        bookList.add(Book(bookId,name,författare,ar,upplaga,true))
        println("Bok ID: $bookId Name : ${name}, Författare: ${författare}, År: ${ar}, Upplaga :${upplaga}, Status : Kan lånas")
        println("-------------------------------------------------")
        Thread.sleep(3000)
        EnterIn(bookList)
    }


    fun EnterIn(bookList: ArrayList<Book>){
        println("-------------------------------------------------")
        println("Vad vill du göra?")
        println("1. Add a book to the library\n" +
                "2. Search for a book by name\n" +
                "3. List all available books\n" +
                "4. Return a book\n" +
                "5. Quit\n")
        println("-------------------------------------------------")

        var x = readLine()!!.toInt()
        when(x){
            1-> {AddBook(bookList)}
            2-> { for (i in bookList.indices){
                bookList[i].SearchBook() }}
            3->{ for (i in bookList.indices){
                bookList[i].AvailableBooks() }}
            4->{for (i in bookList.indices){
                bookList[i].returnBook() }}
            5->return

        }
    }
}