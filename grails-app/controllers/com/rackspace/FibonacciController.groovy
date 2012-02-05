package com.rackspace

import com.sun.org.apache.xpath.internal.operations.String;

class FibonacciController {
    
    def index = {
    
    }
    
    def results = {
        def fibonacciService = new FibonacciService()
        def iterations = 10
        
        if(params.containsKey("iterations") && params["iterations"] != "")
            iterations = Integer.parseInt(params["iterations"])
            
        [result : fibonacciService.doFibonacci(iterations)]
    }
}
