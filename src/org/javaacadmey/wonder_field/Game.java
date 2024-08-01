package org.javaacadmey.wonder_field;

import java.util.Scanner;

public class Game {
    private static final int NUMBER_OF_PLAYERS = 3;
    private static final int TOTAL_NUMBER_OF_ROUNDS = 4;
    private static final int GROUP_ROUNDS = 3;
    private static final int FINAL_ROUND_INDEX = 3;

    public static Scanner scanner = new Scanner(System.in);
    private String[] questions = new String[TOTAL_NUMBER_OF_ROUNDS];
    private String[] answers = new String[TOTAL_NUMBER_OF_ROUNDS];

//    public void init() {
//        System.out.println("Запуск игры " + "Поле Чудес" + " - подготовка к игре. Вам нужно ввести вопросы и ответы для игры.");
//        for (int i = 0; i < TOTAL_NUMBER_OF_ROUNDS; i++) {
//            System.out.println("Введите вопрос #1" + (i + 1));
//            questions[i] = scanner.nextLine();
//            System.out.println("Введите ответ вопрос #1" + (i + 1));
//            answers[i] = scanner.nextLine();
//        }
//        System.out.println("Иницализация закончена, игра начнется через 5 секунд");
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String skip = "\n";
//        String skipLines = skip.repeat(50);
//        System.out.println(skipLines);

   // }
}

