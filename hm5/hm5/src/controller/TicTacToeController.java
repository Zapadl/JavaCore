package controller;

import module.TicTacToe;

public class TicTacToeController {
    private final int SIZE = 9;
    private final String FILEPATH = "./tictactoe";
    private TicTacToe ticTacToe;

    public TicTacToeController(){
        ticTacToe = new TicTacToe();
        System.out.println("Загружаем сохраненное поле");
        ticTacToe.loadgame(SIZE, FILEPATH);
        System.out.println("Создадим новую игру и сохраним в файл");
        ticTacToe.newGame(SIZE, FILEPATH);
    }
}
