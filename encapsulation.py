# encapsulation.py

class Employee:
    def __init__(self, name, salary, pin):
        self.name = name          # PUBLIC attribute (accessible anywhere)
        self._salary = salary      # PROTECTED attribute (convention: intended for internal/subclass use)
        self.__pin = pin          # PRIVATE attribute (hidden, triggers Name Mangling)

    # GETTER method to view private attribute
    def get_pin(self):
        return self.__pin

    # SETTER method to update private attribute safely
    def set_pin(self, new_pin):
        if len(str(new_pin)) == 4:
            self.__pin = new_pin
            print("PIN updated successfully!")
        else:
            print("Invalid PIN! Must be 4 digits.")


# --- Testing Encapsulation ---
emp = Employee("Aditya", 75000, 1234)

# 1. Accessing Public attribute
print("Public (Name):", emp.name)

# 2. Accessing Protected attribute (Possible, but discouraged by convention)
print("Protected (Salary):", emp._salary)

# 3. Direct access to Private attribute throws an AttributeError!
# print(emp.__pin)  # Error: 'Employee' object has no attribute '__pin'

# 4. Accessing Private attribute via Getter & Setter methods
print("Private (PIN via Getter):", emp.get_pin())

emp.set_pin(9999)    # Valid update
print("Updated PIN:", emp.get_pin())

emp.set_pin(12)      # Invalid update

# 5. Accessing Private attribute via Name Mangling (Interview concept!)
# Syntax: object._ClassName__private_attribute
print("Private (via Name Mangling):", emp._Employee__pin)
