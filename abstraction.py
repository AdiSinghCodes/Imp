# abstraction.py
# Abstraction in Python using abc module (Abstract Base Class)

from abc import ABC, abstractmethod

# 1. ABSTRACT BASE CLASS (Blueprint/Interface)
# Inherits from ABC (Abstract Base Class)
class DatabaseConnector(ABC):

    @abstractmethod
    def connect(self):
        """Abstract method: Must be implemented by all subclasses"""
        pass

    @abstractmethod
    def execute_query(self, query):
        """Abstract method: Must be implemented by all subclasses"""
        pass

    # Concrete method (Normal method with implementation)
    def disconnect(self):
        print("Database connection closed successfully.")


# 2. CONCRETE SUBCLASS 1 (PostgreSQL)
class PostgresConnector(DatabaseConnector):
    def connect(self):
        print("Connecting to PostgreSQL Database at port 5432...")

    def execute_query(self, query):
        print(f"PostgreSQL executing query: {query}")


# 3. CONCRETE SUBCLASS 2 (MongoDB)
class MongoConnector(DatabaseConnector):
    def connect(self):
        print("Connecting to MongoDB at port 27017...")

    def execute_query(self, query):
        print(f"MongoDB executing query/find: {query}")


# --- DEMONSTRATING ABSTRACTION & RULES ---

# RULE 1: You CANNOT instantiate an Abstract Class directly!
# db = DatabaseConnector()  # Throws TypeError: Can't instantiate abstract class DatabaseConnector

# RULE 2: Subclasses MUST implement ALL abstract methods, otherwise instantiating them throws an error!
pg = PostgresConnector()
pg.connect()
pg.execute_query("SELECT * FROM users;")
pg.disconnect()

print("-" * 40)

mongo = MongoConnector()
mongo.connect()
mongo.execute_query("{ 'user': 'Aditya' }")
mongo.disconnect()
