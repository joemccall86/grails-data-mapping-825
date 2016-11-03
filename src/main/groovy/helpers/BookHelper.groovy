package helpers

import grails.plugins.rest.client.RestBuilder

/**
 * Instantiate RestBuilder in a non-spring context for testing
 */
class BookHelper {
    RestBuilder rest = new RestBuilder()
}
