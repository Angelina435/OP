package com.example.z10;

import java.util.Scanner;


class EventSelection {
    public void selectEvent(String eventName) {
        System.out.println("Выбрано мероприятие: " + eventName);
    }
}


class SeatSelection {
    public void selectSeat(int seatNumber) {
        System.out.println("Выбрано место: " + seatNumber);
    }
}


class Payment {
    public void processPayment(double amount) {
        System.out.println("Оплачено: " + amount + " рублей");
    }
}


class TicketFacade {
    private EventSelection eventSelection;
    private SeatSelection seatSelection;
    private Payment payment;

    public TicketFacade() {
        this.eventSelection = new EventSelection();
        this.seatSelection = new SeatSelection();
        this.payment = new Payment();
    }


    public void orderTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите мероприятие (Концерт, театр, вечеринка): ");
        String eventName = scanner.nextLine();

        System.out.println("Выберите место (1-10): ");
        int seatNumber = scanner.nextInt();

        System.out.println("Введите сумму для оплаты: ");
        double amount = scanner.nextDouble();

        eventSelection.selectEvent(eventName);
        seatSelection.selectSeat(seatNumber);
        payment.processPayment(amount);
        System.out.println("Билет успешно заказан!");
    }
}


public class Main {
    public static void main(String[] args) {
        TicketFacade ticketFacade = new TicketFacade();


        ticketFacade.orderTicket();
    }
}
