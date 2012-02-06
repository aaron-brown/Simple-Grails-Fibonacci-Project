package com.rackspace

import com.sun.org.apache.xpath.internal.operations.String;

class FibonacciController
{
    
    def index =
    {
    
    }
    
    def results =
    {
        def fibonacciService = new FibonacciService()
        def iterations = Integer.parseInt(params["iterations"] ?: "10")
        
        [result : fibonacciService.doFibonacci(iterations)]
    }
}
