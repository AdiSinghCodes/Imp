from abc import ABC, abstractmethod

class DataProcessor(ABC):
    def __init__(self,file_name):
        self.file_name = file_name
        self.__record_count = 0

    @abstractmethod
    def process_data(self,file_name,record_count):
        pass


class CSVProcessor(DataProcessor):
    def __init__(self,file_name,delimiter=","):
        self.file_name = file_name
        self.delimiter = delimiter

    def process_data(self,record_count):
        self.__record_count += 150
        print("Status",self.__record_count)

class JSONProcessor(CSVProcessor):
    def __init__(self,file_name,record_count):
        self.file_name = file_name
        self.record_count = record_count

    def process_data(self,record_count):
        self.__record_count += 300
        print("Status", self.__record_count)

i = CSVProcessor("sales.csv")
i.process_data()
j = JSONProcessor("users.json")
j.process_data()
