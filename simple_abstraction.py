# simple_abstraction.py
from abc import ABC, abstractmethod

# 1. ABSTRACT BASE CLASS (Blueprint)
class PaymentMethod(ABC):

    # Abstract Method (No implementation here, only pass)
    @abstractmethod
    def pay(self, amount):
        pass


# 2. CHILD CLASS 1 (Concrete Class - Implements the abstract method)
class UPIPayment(PaymentMethod):
    def pay(self, amount):
        print(f"Paid ₹{amount} successfully using UPI / Google Pay!")


# 3. CHILD CLASS 2 (Concrete Class - Implements the abstract method)
class CardPayment(PaymentMethod):
    def pay(self, amount):
        print(f"Paid ₹{amount} successfully using Credit/Debit Card!")


# --- HOW IT WORKS / RETRIEVAL ---

# STEP A: Try creating an object of Abstract Class directly (NOT ALLOWED!)
# p = PaymentMethod()  
# Error: TypeError: Can't instantiate abstract class PaymentMethod


# STEP B: Creating objects of Child Classes and calling the method
upi = UPIPayment()
upi.pay(500)   # Output: Paid ₹500 successfully using UPI / Google Pay!

card = CardPayment()
card.pay(1200) # Output: Paid ₹1200 successfully using Credit/Debit Card!
