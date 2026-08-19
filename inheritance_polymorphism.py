# inheritance_polymorphism.py

# 1. PARENT CLASS (Base Class)
class Vehicle:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model

    def start_engine(self):
        print(f"{self.brand} {self.model}: Engine started with key!")

    def display_info(self):
        print(f"Vehicle: {self.brand} {self.model}")


# 2. CHILD CLASS 1 (Single Inheritance + super() + Method Overriding)
class Car(Vehicle):
    def __init__(self, brand, model, doors):
        # super() calls the parent (Vehicle) constructor
        super().__init__(brand, model)
        self.doors = doors  # Child specific attribute

    # METHOD OVERRIDING (Polymorphism: same method name, different implementation)
    def start_engine(self):
        print(f"{self.brand} {self.model} (Car): Engine started with Push Button!")


# 3. CHILD CLASS 2 (Inheritance + Polymorphism)
class ElectricCar(Car):
    def __init__(self, brand, model, doors, battery_capacity):
        # Calls Car's constructor (Multilevel Inheritance)
        super().__init__(brand, model, doors)
        self.battery_capacity = battery_capacity

    # OVERRIDING start_engine for Electric Car
    def start_engine(self):
        print(f"{self.brand} {self.model} (EV): System powered ON silently! Battery: {self.battery_capacity}kWh")


# --- DEMONSTRATING POLYMORPHISM ---
# Polymorphism allows us to call the same method 'start_engine()' on different objects

vehicles = [
    Vehicle("Generic", "V1"),
    Car("Toyota", "Camry", 4),
    ElectricCar("Tesla", "Model 3", 4, 75)
]

print("--- Polymorphism in Action ---")
for v in vehicles:
    v.start_engine()  # Calls the respective class's start_engine() method!
