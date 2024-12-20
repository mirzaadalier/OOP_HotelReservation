import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

        public class Main {
            public static void main(String[] args) {
                List<UnionGuest> unionGuests = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                // Kullanıcıdan veri alma
                System.out.println("Bir misafir ismi girin:");
                String guestName = scanner.nextLine();

                System.out.println("Bir oda numarası girin:");
                int roomNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sendika üyeliği var mı? (evet/hayır):");
                String cevap = scanner.nextLine();
                boolean isUnionMember = cevap.equalsIgnoreCase("evet");

                UnionGuest unionGuest = new UnionGuest(guestName, roomNumber, isUnionMember, "");

                Guest guest2 = new UnionGuest("kenan",4,true,"fee reduce");

                boolean isUnionValid = unionGuest.SendikaGeçerlilikKontrol();

                boolean isDateValid = unionGuest.SendikaTarihKontrol();

                if (isUnionValid && isDateValid) {
                    unionGuests.add(unionGuest);
                }


                System.out.println("\nEklenen Sendikalı Misafirler:");
                unionGuests.forEach(guest -> guest.displayUnionGuestInfo());


                List<UnionGuest> activeUnionGuests = unionGuests.stream()
                        .filter(UnionGuest::checkUnionMembership)
                        .collect(Collectors.toList());


                activeUnionGuests.forEach(unionGuest1 -> {
                    System.out.println(unionGuest1.getGuestName() + " is a union member.");
                });

                // guestRoomMap'e bazı veriler ekleniyor
                Map<String, Integer> guestRoomMap = new HashMap<>();
                guestRoomMap.put("Ayşe", 101);
                guestRoomMap.put("Mehmet", 102);

                // Lambda ile Map üzerinde işlem yaparak verileri yazdırma
                guestRoomMap.forEach((name, room) -> {
                    System.out.println("Misafir: " + name + ", Oda Numarası: " + room);
                });
            }
        }

