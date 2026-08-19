class Employee:
    def __init__(self,emp_id,name):
        self.emp_id = emp_id
        self.name = name

    def calculate_salary(self):
        print("No calci of salary in base class")
        return 0.0

class FullTimeEmployee(Employee):
    def __init__(self,emp_id,name,monthly_salary,bonus):
        super().__init__(emp_id,name)
        self.monthly_salary = monthly_salary
        self.bonus = bonus

    def calculate_salary(self):
        return self.monthly_salary + self.bonus

class ContractEmployee(Employee):
    def __init__(self,emp_id,name,hourly_rate,hours_worked):
        super().__init__(emp_id,name)
        self.hourly_rate = hourly_rate
        self.hours_worked = hours_worked

    def calculate_salary(self):
        return self.hourly_rate * self.hours_worked

employees = [FullTimeEmployee(101,"Aditya",60000,10000), 
ContractEmployee(102,"Rahul",500,160)]

for i in employees:
    print(f"{i.name} (ID:{i.emp_id}) Total Salary: {i.calculate_salary()}")