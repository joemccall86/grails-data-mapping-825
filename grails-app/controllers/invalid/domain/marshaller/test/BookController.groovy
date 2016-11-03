package invalid.domain.marshaller.test

class BookController {

    static responseFormats = ['json']

    def index() {
        def something = new Object()
        respond something
    }
}
