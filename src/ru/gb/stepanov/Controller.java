package ru.gb.stepanov;

import ru.gb.stepanov.EnteringUD;
import ru.gb.stepanov.WriteToFile;

public class Controller {
    public Controller(){
        new WriteToFile(new EnteringUD().consoleEnter("Введите заметку: "));
    }
}