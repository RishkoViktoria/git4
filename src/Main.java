public class Main {
    public static void main(String[] args) {
        // Начальная сумма на счету клиента
        int initialBalance = 100;

        // Сумма пополнения
        int rechargeAmount = 1100;

        // Порог для начисления бонуса
        int bonusThreshold = 1000;

        // Рассчитываем сумму бонуса
        int bonus = (rechargeAmount > bonusThreshold) ? (rechargeAmount / 100) : 0;

        // Итоговая сумма на счету клиента
        int finalBalance = initialBalance + rechargeAmount + bonus;

        // Выводим результат
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}