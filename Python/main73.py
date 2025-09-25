# PyQt5 LineEdit
import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QLineEdit, QPushButton
from PyQt5.QtGui import QIcon

class MainWindow(QMainWindow):
    def __init__(self, ):
        super().__init__()
        self.setWindowTitle("Line edit")
        self.setGeometry(700, 300, 250, 250)
        self.setWindowIcon(QIcon("Python/bro code.jpg"))
        self.line_edit = QLineEdit(self)
        self.button = QPushButton("Submit", self)
        self.initUI()

    def initUI(self):
        self.line_edit.setGeometry(10, 10, 200, 40)
        self.button.setGeometry(210, 10, 100, 40)
        self.line_edit.setStyleSheet("font-size: 25px;" 
                                     "font-weight: bold;" 
                                     "font-family: Arial")
        self.button.setStyleSheet("font-size: 25px;" 
                                     "font-weight: bold;" 
                                     "font-family: Arial")
        self.line_edit.setPlaceholderText("Say Your Name")
        
        self.button.clicked.connect(self.submit)
    
    def submit(self):
        text = self.line_edit.text()
        print(f"Hello {text}")


if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())