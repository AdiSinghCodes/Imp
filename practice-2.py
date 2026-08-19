class StudentReportCard:
    def __init__(self,student_name,roll_no, marks):
        self.student_name = student_name
        self._roll_no = roll_no
        self.__marks = marks

    def get_marks(self,marks):
        return self.__marks

    def set_marks(self,new_marks):
        if(new_marks >= 0 and new_marks<=100):
            self.__marks = new_marks
            print(self.__marks)
        else:
            print("Invalid marks")

    def calci_grades(self,marks):
        if(self.__marks >= 90 ):
            print('A')
        elif(self.__marks >=75):
            print('B')
        elif(self.__marks >=40):
            print('C')
        else:
            print('F')

r = StudentReportCard("Rohan",105,82.0)
ans = r.calci_grades(77)
print(f"Rohan initial grade is {ans}")
r.set_marks(95.0)
r.set_marks(110.0)

print("Used name mangling", r._StudentReportCard__marks)

