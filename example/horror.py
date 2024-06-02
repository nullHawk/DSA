import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QVBoxLayout, QWidget

class HorrorStoryGame(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Horror Story Game')
        self.setGeometry(100, 100, 400, 300)
        self.central_widget = QWidget()
        self.setCentralWidget(self.central_widget)
        self.layout = QVBoxLayout(self.central_widget)

        self.story_label = QLabel('', self)
        self.layout.addWidget(self.story_label)

        self.choice_buttons = []
        for i in range(1, 4):
            button = QPushButton('', self)
            button.clicked.connect(lambda checked, i=i: self.make_choice(i))
            self.choice_buttons.append(button)
            self.layout.addWidget(button)

        self.current_story_page = 1
        self.load_story_page(self.current_story_page)

    def load_story_page(self, page_number):
        if page_number == 1:
            self.story_label.setText("You find yourself in a dark, abandoned mansion on a stormy night. "
                                     "You hear strange noises coming from the basement. What will you do?")
            self.choice_buttons[0].setText("Go investigate the basement.")
            self.choice_buttons[1].setText("Stay where you are.")
            self.choice_buttons[2].setText("Exit the mansion.")

    def make_choice(self, choice_number):
        if self.current_story_page == 1:
            if choice_number == 1:
                self.story_label.setText("You cautiously make your way to the basement door. "
                                         "As you descend the stairs, you hear a loud creaking sound behind you. "
                                         "You quickly turn around, but there's nothing there. "
                                         "Do you continue down or go back up?")
                self.choice_buttons[0].setText("Continue down to the basement.")
                self.choice_buttons[1].setText("Go back up to the main floor.")
                self.choice_buttons[2].setText("Scream for help.")
                self.current_story_page += 1
            elif choice_number == 2:
                self.story_label.setText("You decide to stay where you are, too scared to investigate. "
                                         "The strange noises continue, but you remain frozen in place. "
                                         "Suddenly, you hear footsteps approaching. What do you do?")
                self.choice_buttons[0].setText("Hide and remain silent.")
                self.choice_buttons[1].setText("Call out and ask who's there.")
                self.choice_buttons[2].setText("Run for the exit.")
                self.current_story_page += 2
            elif choice_number == 3:
                self.story_label.setText("You choose to exit the mansion, thinking it's too dangerous to stay. "
                                         "As you step outside, you're immediately drenched by the pouring rain. "
                                         "Where will you go?")
                self.choice_buttons[0].setText("Head into the woods.")
                self.choice_buttons[1].setText("Seek shelter in the nearby barn.")
                self.choice_buttons[2].setText("Return to the mansion.")
                self.current_story_page += 3

    def next_page(self):
        self.current_story_page += 1
        self.load_story_page(self.current_story_page)

if __name__ == '__main__':
    app = QApplication(sys.argv)
    window = HorrorStoryGame()
    window.show()
    sys.exit(app.exec_())
