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
    def doFibonnacci(def iterations) {
        def ret = ""
        iterations = iterations - 2
        ret += "${lastTwoNumbers[0]} "
        ret += "${lastTwoNumbers[1]} "
        for(def i in 0..iterations) {
            if(i % 11 == 0) {
                ret += "\n"
            }
            lastTwoNumbers[i % 2] = lastTwoNumbers[0] + lastTwoNumbers[1]
            ret += "${lastTwoNumbers[i % 2]} "
        }
        
        return ret
    }
}
