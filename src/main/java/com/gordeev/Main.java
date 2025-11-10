package com.gordeev;

import com.gordeev.dto.Current;
import com.gordeev.dto.WeatherResponce;
import retrofit2.Response;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("API Weather в консоли");

        Scanner scan = new Scanner(System.in);

        System.out.println("Какой город?");
        while (true) {
            System.out.println();
            System.out.println("Введите свой город:");
            String city = scan.nextLine();

            Response<WeatherResponce> response = Weather.instance().current(Weather.KEY, city).execute();
            if (response.isSuccessful() && response.body() != null) {
                Current current = response.body().getCurrent();
                System.out.println("Температура: " + current.getTempC() + ", ощущается как: " + current.getFeelslikeC());
            } else {
                System.out.println("Ошибка: ");
                System.out.println(response);
            }
        }
    }
}
