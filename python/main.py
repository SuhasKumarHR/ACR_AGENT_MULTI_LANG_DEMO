def calculate_total(price, quantity):
    total = price * quantity
    return total


def main():
    price = 100
    quantity = 5

    total = calculate_total(price, quantity)

    print("Product Price:", price)
    print("Quantity:", quantity)
    print("Total:", total)


if __name__ == "__main__":
    main(