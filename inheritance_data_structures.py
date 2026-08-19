# inheritance_data_structures.py
# Data Engineering Focus: Inheritance + Polymorphism + Lists, Tuples, Dicts, Sets, Strings

# 1. BASE CLASS (Parent)
class DataPipeline:
    def __init__(self, pipeline_name):
        self.pipeline_name = pipeline_name

    def process(self, raw_data):
        # Base method to be overridden
        pass


# 2. CHILD CLASS (Inheritance + Data Structure Manipulations)
class UserLogPipeline(DataPipeline):
    def __init__(self, pipeline_name, log_format):
        super().__init__(pipeline_name)  # Reuse parent constructor using super()
        self.log_format = log_format

    # METHOD OVERRIDING (Polymorphism)
    def process(self, raw_log_lines):
        print(f"--- Running Pipeline: {self.pipeline_name} ---")

        # -------------------------------------------------------------
        # DATA STRUCTURE CONCEPT 1: STRINGS & LIST COMPREHENSION
        # Cleaning whitespace and splitting log lines into raw tokens
        # -------------------------------------------------------------
        cleaned_lines = [line.strip() for line in raw_log_lines if line.strip()]

        # -------------------------------------------------------------
        # DATA STRUCTURE CONCEPT 2: TUPLES (Immutable Data Records)
        # Parsing string lines into structured tuple records: (user_id, status, ip)
        # -------------------------------------------------------------
        records = []
        for line in cleaned_lines:
            parts = line.split(",")  # String splitting
            user_id = parts[0].strip().upper()  # String methods: upper()
            status = parts[1].strip().lower()   # String methods: lower()
            ip = parts[2].strip()
            records.append((user_id, status, ip))  # Storing as Tuple (Immutable record)

        print("\n1. Parsed Tuple Records:", records)

        # -------------------------------------------------------------
        # DATA STRUCTURE CONCEPT 3: SETS (Deduplication)
        # Extracting unique User IDs
        # -------------------------------------------------------------
        unique_users = {rec[0] for rec in records}  # Set comprehension
        print("2. Unique User IDs (Set):", unique_users)

        # -------------------------------------------------------------
        # DATA STRUCTURE CONCEPT 4: DICTIONARY (Key-Value Aggregations)
        # Grouping IPs by status: {"success": [ip1, ip2], "error": [ip3]}
        # -------------------------------------------------------------
        status_grouped = {}
        for user, status, ip in records:
            if status not in status_grouped:
                status_grouped[status] = []
            status_grouped[status].append(ip)

        print("3. Status Grouped IPs (Dict):", status_grouped)

        # Dict Comprehension: Counting occurrences per status
        status_counts = {status: len(ips) for status, ips in status_grouped.items()}
        print("4. Status Counts (Dict Comp):", status_counts)

        return records


# --- TESTING DATA ENGINEERING PIPELINE ---
raw_logs = [
    "  USR101, SUCCESS, 192.168.1.1  ",
    "usr102, ERROR, 10.0.0.1",
    "USR101, SUCCESS, 192.168.1.2",
    "  usr103, error, 10.0.0.2  ",
    ""  # Empty line to test filtering
]

pipeline = UserLogPipeline(pipeline_name="User ActivityETL", log_format="CSV")
processed_records = pipeline.process(raw_logs)
