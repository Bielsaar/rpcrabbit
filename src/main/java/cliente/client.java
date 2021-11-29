package cliente;

import fibonacci.FibonacciRpcClient;

public class client {
    FibonacciRpcClient fibonacciRpc = new FibonacciRpcClient();
    String result = fibonacciRpc.call("4");
    System.out.println( "fib(4) is " + result);
}
