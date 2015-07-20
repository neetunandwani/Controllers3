package controllers3

class MyNewFilters {

    def filters = {
        def dependsOn = [NewFilters]

        all(controller: '*', action: '*') {

            before = {

                println("in my new Filter")

            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }

    }
}
