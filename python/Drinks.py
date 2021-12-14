from decimal import Decimal

def main():
    while True:
        show_menu()
        c = input("Input choice: ")
        if c == "1":
            func1()
        elif c == "2":
            func2()
        elif c == "3":
            func3()
        else:
            print("Program will now exit, bye")
            exit()


# this function prints out a menu where the user can choose the method to run
def show_menu():
    print("== ABCD-A ACT 6 DOCKER PYTHON APPLICATION MENU ==")
    print("1. Boy or girl")
    print("2. Drinks")
    print("3. Too Many Long Words")
    print("4. EXIT")
    print("=================================================")

def func1():
    print("Input a username and determine if the owner is a girl or a boy | solution by: bayquen")
    s = input("Input name:")
    d = (list(s[:len(s) - 1]))
    a = set()
    for e in d:
        a.add(e)

    if len(a) % 2 == 0:
        print("CHAT WITH HER!")
    else:
        print("IGNORE HIM!")

def func2():
    from decimal import Decimal
    print('''
    Little Vasya loves orange juice very much. That's why any food and drink in his kitchen necessarily contains orange juice. There are n drinks in his fridge, the volume fraction of orange juice in the i-th drink equals pi percent.

    One day Vasya decided to make himself an orange cocktail. He took equal proportions of each of the n drinks and mixed them. Then he wondered, how much orange juice the cocktail has.

    Find the volume fraction of orange juice in the final drink.
    ''')
    print()
    print('''
    Example Inputs:
    Sample 1
        The number of drinks:
        3
        The proportion of drinks:
        50 50 100
        Percentage of orange juice:
        66.666666666667

    Sample 2
    The number of drinks:
        4
        The proportion of drinks:
        0 25 50 75
        Percentage of orange juice:
        37.5
    ''')
    n_drinks = int(input('The number of drinks: '))
    proportions = input('The proportion of drinks:').split(' ')
    total = 0
    for proportion in proportions:
        total += int(proportion)
    print(f'Percentage of orange juice {Decimal(total/n_drinks)}')


def func3():
    print("Indicate the number of words you want to enter (ex. 5)")
    wordCount = int(input())

    print("Enter the " + str(wordCount) + " words, one by one.")
    for i in range(0, wordCount):
        word = str(input())
        length = len(word)
        print("Result: ", end="")
        if length > 10:
            print(word[0], end='')
            print(length - 2, end='')
            print(word[length - 1])
        else:
            print(word)
            
if __name__ == "__main__":
    main()




