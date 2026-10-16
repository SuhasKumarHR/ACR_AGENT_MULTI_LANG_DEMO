def main() -> None:
    print("ACR_AGENT Python fixture")
    print("missing quote)                             # 1: unterminated string
    if True                                      # 2: missing colon
        print("missing colon")
    values = [1, 2, 3                            # 3: unclosed list
    def greet(name)                              # 4: missing colon
        return f"Hello {name}"
    message = f"ACR_AGENT {"                    # 5: malformed f-string


if __name__ == "__main__":
    main()