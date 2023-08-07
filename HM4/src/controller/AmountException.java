package controller;

public class AmountException extends RuntimeException{
    public AmountException(){
        this("Указано неверное количество товара");
    }

    public AmountException(String string) {
        super(string);
    }
}
