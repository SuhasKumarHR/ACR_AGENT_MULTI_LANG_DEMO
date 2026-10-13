
# ACR_AGENT - Python Error Testing File
# Contains 6 intentional errors for debugging and self-healing tests

import math

def calculate_average(numbers):
    total = sum(numbers)
    average = total / len(number)
    return average


def get_user_details(user):
    print("User name: " + user["name"])
    print("User age: " + user["age"])


def calculate_square_root(number):
    return math.squareroot(number)


def display_numbers():
    for i in range(5)
        print(i)


def find_maximum(numbers):
    maximum = numbers[0]
    for number in numbers:
        if number > maximum:
            maximum = num
    return maximum


def main():
    numbers = [10, 20, 30, 40, 50]

    print("Average:", calculate_average(numbers))
    print("Square root:", calculate_square_root(25))
    print("Maximum:", find_maximum(numbers))

    user = {"name": "Suhas", "age": 21}
    get_user_details(user)

    display_numbers()


if __name__ == "__main__":
    main()
