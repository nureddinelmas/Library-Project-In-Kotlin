class Book( var bookId : Int =0,
            var name: String ="",
           var författare: String ="",
           var år : Int =0,
           var upplaga : Int= 0,
           var status: Boolean) {




    fun LanaBookStatus() {
        if (status){
            toString()
            println("Det kan du låna boken: -$bookId -$name ")
            status = false
            Thread.sleep(5000)
        }
        else{
            println("Det kan du INTE låna boken: $bookId $name")
            Thread.sleep(5000)
        }
    }

    fun returnBook(){
        println("Vilken bok ska du lämna? Namn?")
        var bookname = readLine().toString()
        if(name == bookname){
            println("Tack för att du lämnat boken : $bookId  $name")
            status = true
            Thread.sleep(5000)
        }

    }
    override fun toString(): String{
       return "Book ID : $bookId Book Name : $name, Författare: $författare, År: $år, Upplaga :$upplaga, Status : $status "

    }
    fun SearchBook(){
        println("Skriv den book som du söker")
        var searchbook: String = readLine().toString()

        if (searchbook == name) {
            if (status){
                println("Book ID : $bookId Book Name : $name, Författare: $författare, År: $år, Upplaga :$upplaga, Status : Kan lånas ")
                println("Vill du låna den här ($bookId - $name) boken. Ja eller Nej")
                var input = readLine().toString()

                if (input == "Ja"){
                    status = false
                    println("Du lånada den här boken : ($bookId $name)")
                    Thread.sleep(3000)

                }
                else{
                    return
                }
            }
            else{
                println("Book ID : $bookId Book Name : $name, Författare: $författare, År: $år, Upplaga :$upplaga, Status : Kan inte lånas ")
            Thread.sleep(5000)
            }
        }
        else{
            println("Den $searchbook bok saknar, tyvärr")
            Thread.sleep(5000)
        }

        }

    fun AvailableBooks() {
        if (status)
            println("Bok ID: $bookId Name : ${name}, Författare: ${författare}, År: ${år}, Upplaga :${upplaga}, Status : Kan lånas")
            Thread.sleep(5000)
    }
    }