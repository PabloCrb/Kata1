import java.time.LocalDate;

public class ChipBag {
    private String brand;
    private int scovilleUnits;
    private LocalDate expirationDate;

    public ChipBag(String brand, int scovilleUnits, LocalDate expirationDate) {
        this.brand = brand;
        this.scovilleUnits = scovilleUnits;
        this.expirationDate = expirationDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScovilleUnits() {
        return scovilleUnits;
    }

    public void setScovilleUnits(int scovilleUnits) {
        this.scovilleUnits = scovilleUnits;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


}
