package controllers3

class NewFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                println("In new Filer")
            }
            after = { Map model ->
            }
            afterView = { Exception e ->
                println("************in after view")
                println(e)
            }
        }

        forBook(uri: "/book/*") {
            before = {
                println("In book Filer")
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
