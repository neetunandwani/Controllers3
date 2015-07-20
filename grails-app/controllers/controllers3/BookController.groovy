package controllers3

import CO.FileCO

class BookController {

    def index() {
        render view: "index", model: [name: "neetu"]
    }

    def show() {
        render "show"
    }

    def createOrderPDF = {
        File file = new File("/home/neetu/Pictures/Telia code coverage 23-June.png")
        byte[] orderPDF = file.getBytes()
        response.setHeader("Content-disposition", "attachment; filename=" + file.name)
        response.contentLength = orderPDF.length
        response.outputStream << orderPDF
    }

    def save(FileCO fileCO) {
        println(fileCO)
        File file = new File("/home/neetu/image")
        file.bytes = fileCO.myFile
        render("save")
    }
}
