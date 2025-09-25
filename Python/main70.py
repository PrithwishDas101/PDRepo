# PyQt5 buttons

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QPushButton,QLabel
from PyQt5.QtGui import QIcon

class MainWindow(QMainWindow):

    def __init__(self, ):
        super().__init__()
        self.setWindowTitle("buttons")
        self.setGeometry(700, 300, 250, 250)
        self.setWindowIcon(QIcon("Python/bro code.jpg"))
        self.button = QPushButton("Click me!", self)
        self.label = QLabel("Hello!", self)
        self.initUI()

    def initUI(self):
        self.button.setGeometry(50, 100, 200, 100)
        self.button.setStyleSheet("font-size: 40px;"
                                  "background-color: cyan;")
        self.button.clicked.connect(self.onclick)

        self.label.setGeometry(50, 200, 200, 100)
        self.label.setStyleSheet("font-size: 50px;")
        
    def onclick(self):
        print("button clicked")
        self.button.setText("Clicked")
        self.label.setText("GoodBye!")
        self.button.setDisabled(True)


def main():
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())

if __name__ == "__main__":
    main()