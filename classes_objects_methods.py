# classes_objects_methods.py

# 1. CLASS (Blueprint)
class Student:
    # Constructor: Initializes the attributes of an object
    # 'self' refers to the specific object instance being created/manipulated
    def __init__(self, name, roll_number, marks):
        self.name = name          # Instance attribute
        self.roll_number = roll_number  # Instance attribute
        self.marks = marks        # Instance attribute

    # 2. METHOD (Behavior)
    def display_info(self):
        print(f"Student: {self.name} | Roll No: {self.roll_number} | Marks: {self.marks}")

    def check_pass_status(self):
        if self.marks >= 40:
            return "Passed"
        else:
            return "Failed"


# 3. OBJECTS (Instances of the Class)
# Creating two distinct objects from the Student class
student1 = Student("Aditya", 101, 85)
student2 = Student("Rahul", 102, 35)

# Calling methods on objects
print("--- Student 1 Details ---")
student1.display_info()
print("Status:", student1.check_pass_status())

print("\n--- Student 2 Details ---")
student2.display_info()
print("Status:", student2.check_pass_status())
