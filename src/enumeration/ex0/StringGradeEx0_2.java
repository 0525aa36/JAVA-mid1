package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int vip = discountService.discount("VIP", price); //존재하지 않는 등급
        System.out.println("BASIC 등급의 할인 금액: " + vip);

        int gold = discountService.discount("gold", price); //소문자
        System.out.println("gold 등급의 할인 금액: " + gold);

        int diamondd = discountService.discount("DIAMONDD", price); //오타
        System.out.println("DIAMOND 등급의 할인 금액: " + diamondd);
    }
}
