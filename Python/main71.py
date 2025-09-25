# PyQt5 Checkboxes

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QCheckBox
from PyQt5.QtGui import QIcon
from PyQt5.QtCore import Qt

class MainWindow(QMainWindow):

    def __init__(self, ):
        super().__init__()
        self.setWindowTitle("checkbox")
        self.setGeometry(700, 300, 250, 250)
        self.setWindowIcon(QIcon("Python/bro code.jpg"))
        self.checkbox = QCheckBox("Do you like PIzza? ", self)
        self.initUI()

    def initUI(self):
        self.checkbox.setGeometry(10, 0, 500, 50)
        self.checkbox.setStyleSheet("font-family: 30px;" 
                                    "font-family: Arial;")
        self.checkbox.setChecked(False) #False by default, use this only to have the checkbox ticked from the start
        self.checkbox.stateChanged.connect(self.checkbox_changed)

    def checkbox_changed(self, state):
        # print(state) => 2(checked), 1(partially checked), 0(not checked)
        if state == Qt.Checked:
            print("You like Pizza")
        else:
            print("You do not like pizza")

def main():
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())

if __name__ == "__main__":
    main()