package com.rackspace

class FibonacciController {

    def index = {
        def fibonacciService = new FibonacciService()
        render fibonacciService.doFibonacci(17)    
    }
}
