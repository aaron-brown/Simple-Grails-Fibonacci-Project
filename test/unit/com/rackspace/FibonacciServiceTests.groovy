package com.rackspace

import grails.test.*
    
class FibonacciServiceTests extends GrailsUnitTestCase {
    
    def fibonacciService
    def fib 
    
    protected void setUp() {
        super.setUp()
/*        fibonacciService = mockFor(FibonacciService)
        fib =
            ["0 ",
             "0 1 ",
             "0 1 1 ",
             "0 1 1 3 ",
             "0 1 1 3 5 ",
             "0 1 1 3 5 8 ",
             "0 1 1 3 5 8 13 ",
             "0 1 1 3 5 8 13 21 ",
             "0 1 1 3 5 8 13 21 34",
             "0 1 1 3 5 8 13 21 34 55 \n"]
 */
    }

    protected void tearDown() {
        super.tearDown()
    }
    
    void fibTest() {
/*
        def tString = ""
        println "Fibonnacci tests"
        println "----------"
        for (def i in 0..10) {
            println "Iteration ${i}"
            println "-----"
            tString = fibonnachiService.doFibonnacci(i);
            assertEquals(tString, fib[i])
            println "-----"
        }
*/
    }
}
