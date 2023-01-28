package ru.netology.sqr;
public class SQRService {
    public int SQRService(int lowerLimit, int upperLimit) {
        int numberSQR = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                numberSQR++;
            }
        }
        return numberSQR;
    }
}
