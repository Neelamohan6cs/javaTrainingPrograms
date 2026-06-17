def factorial(n):
   
    if n <= 1:
        return 1
    return n * factorial(n - 1)


def fibonacci(n):
   
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)

def showrange(n):

    if n <= 0 :
        return
    print(n)
    showrange(n-1)


# Test the functions
#print(f"Factorial of 5: {factorial(5)}")
#print(f"Fibonacci of 6: {fibonacci(6)}")

showrange(5)
