# PyQty5 images

import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel
from PyQt5.QtGui import QIcon, QPixmap

class MainWindow(QMainWindow):

    def __init__(self, ):
        super().__init__()
        self.setWindowTitle("images")
        self.setGeometry(700, 300, 250, 250)
        self.setWindowIcon(QIcon("Python/bro code.jpg"))

        label = QLabel(self)
        label.setGeometry(0, 0, 150, 150)

        pixmap = QPixmap("Python/bro code.jpg")
        label.setPixmap(pixmap)

        label.setScaledContents(True) #scales the image according to the width and height adjusted by the user

        label.setGeometry((self.width() - label.width()) // 2,  
                          (self.height() - label.height()) // 2, 
                          label.width(), 
                          label.height())

def main():
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())

if __name__ == "__main__":
    main()