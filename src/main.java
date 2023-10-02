import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        ChipBag takis = new ChipBag("Takis", 8000, LocalDate.of(2023, 11, 23));
        System.out.println(takis.daysLeft());
        System.out.println(takis.isSpicy());

    }
}
