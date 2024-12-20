import java.util.Scanner;

public class UnionGuest extends Guest implements UnionCheck {
    private boolean unionMember;
    private String privileges; // Özel ayrıcalıklar: örneğin 'fee reduction and massage service'

    Scanner scanner = new Scanner(System.in);


    public UnionGuest(String guestName, int roomNumber, boolean unionMember, String privileges) {
        super(guestName, roomNumber);
        this.unionMember = unionMember;
        this.privileges = privileges;
    }

    // UnionGuest bilgilerini gösterme metodu
    public void displayUnionGuestInfo() {
        super.displayGuestInfo(); // Guest sınıfının bilgilerini göster
        System.out.println("Union Membership: " + (unionMember ? "Yes" : "No"));
        System.out.println("Privileges: " + privileges);
    }

    @Override
    public boolean checkUnionMembership() {
        return unionMember;
    }

    @Override
    public boolean SendikaGeçerlilikKontrol() {
        System.out.println("Sendika onayı geçerli mi? (evet ya da hayır)");
        String cevap = scanner.nextLine();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Sendika Geçerli.");
            return true;
        } else {
            System.out.println("Sendika Geçersiz.");
            return false;
        }
    }

    @Override
    public boolean SendikaTarihKontrol() {
        System.out.println("Sendika geçerlilik sözleşmesi 2025 yılını kapsıyor mu? (evet ya da hayır)");
        String cevap2 = scanner.nextLine();
        if (cevap2.equalsIgnoreCase("evet")) {
            System.out.println("Sendika Onaylandı.");
            return true;
        } else {
            System.out.println("Sendika tarihi geçersiz.");
            return false;
        }
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }
}
