package ui;


import model.Client;
import model.InvestmentDataBase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try {
            new App();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to run application: file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
