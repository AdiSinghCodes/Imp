class BankAccount:
    def __init__(self,account_number,account_holder,balance):
        self.account_number = account_number
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self,amount):
        if(amount > 0):
            self.balance = self.balance + amount
            print(f"Amount deposiyed and updated balance is {self.balance}")
        else:
            print("Amount is in negative")

    def withdraw(self,amount):
        if(amount <= self.balance and amount > 0):
            self.balance = self.balance - amount
            print(f"Current balance: {self.balance}")
        else:
            print("Insufficient balance!")

    def display_balance(self):
        print(f"Current balance: {self.balance}")

Aditya = BankAccount(1001,"sunil",500.0)
Aditya.deposit(200.0)
Aditya.withdraw(100.0)
Aditya.withdraw(1000.0)
Aditya.display_balance()


            
            
        
            
            