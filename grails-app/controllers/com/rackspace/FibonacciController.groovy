package com.rackspace

class FibonacciController {

    def index = {
    
    }
    
    def results = {
        def iterations = params["iterations"]
        render "Iterations: ${iterations}"
    }
}
