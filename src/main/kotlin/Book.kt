class Book(var name: String ="",
           var författare: String ="",
           var år : Int =0,
           var upplaga : Int= 0,
           var status: Boolean) {


    fun LanaBookStatus() {
        if (status){
            println("Det kan du låna boken")
            status = false
        }
        else{
            println("det kan du INTE låna boken")
        }
    }

    fun returnBook(){
        println("Tack för att du lämnat boken")
        status = true
    }
    override fun toString(): String{
       return "- Book Name : $name, Författare: $författare, År: $år, Upplaga :$upplaga, Status : $status "

    }
    fun SearchBook(){
        println("Skriv den book som du söker")
        var searchbook: String = readLine().toString()

        if (searchbook == name) {
            if (status){
                toString()
                println("Vill du låna den här $name boken. Ja eller Nej")
                var input = readLine().toString()

                if (input == "Ja"){
                    status = false
                    println("Du lånada den här boken : $name")
                }
                else{
                    return
                }
            }
            else{
                toString()
            }
        }
        else{
            println("Den $searchbook bok saknar, tyvärr")
        }

        }

    fun AvailableBooks() {
        if (status)
            println("Name : ${name}, Författare: ${författare}, År: ${år}, Upplaga :${upplaga}, Status : Kan Lånas")
        }

    }