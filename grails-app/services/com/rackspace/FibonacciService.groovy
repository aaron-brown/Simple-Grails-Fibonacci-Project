package com.rackspace

class FibonacciService {

    static transactional = false
    
    def lastTwoNumbers = [0, 1]
    
    /**
     * Performs the Fibonnacci algorithm up to a specified number of iterations
     * 
     * @param iterations The number of iterations to perform
     * 
     * @return A string of the sequence, in 10-element rows
     */
    def doFibonacci(def iterations) {
        def ret = ""
        ret += "${lastTwoNumbers[0]} "
        ret += "${lastTwoNumbers[1]} "
        for(def i in 2..iterations) {
            if(i % 10 == 0) {
                ret += "<br />"
            }
            lastTwoNumbers[i % 2] = lastTwoNumbers[0] + lastTwoNumbers[1]
            ret += "${lastTwoNumbers[i % 2]} "
        }
        
        return ret
    }
}
