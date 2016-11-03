package invalid.domain.marshaller.test

import grails.test.mixin.TestFor
import helpers.BookHelper
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(BookController)
class BookControllerSpec extends Specification {

    def doWithSpring = {
        bookHelper(BookHelper)
    }

    def setup() {
    }

    def cleanup() {
    }

    void "index should not crash"() {
        when:
        controller.index()

        then:
        notThrown NullPointerException
    }
}
