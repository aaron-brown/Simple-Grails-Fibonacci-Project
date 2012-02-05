package com.rackspace

class FibonacciController {

    def index = {
    
    }
    
    def results = {
        def iterations = 10
        if(params.containsKey("iterations")) {
            render "Key contained<br />"
            iterations = params["iterations"]
        }
        render "Iterations: ${iterations}"
    }
}
