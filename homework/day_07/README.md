### Đề bài

Xây dựng class **Player** chứa các thông tin về cầu thủ bao gồm: number(số áo), fullName, position(Vị trí, sử dụng enum: GK, DF, MF, FW)

Xây dựng class Team để chọn đội. Ví dụ:

```java
allPlayers.add(new Player(23,"Nguyễn Văn Toản",Position.GK));
```

In thông tin toàn bộ cầu thủ theo theo số áo - tên - Vị trí

Tiến hành lựa chọn 11 cầu thủ ngẫu nhiên theo các mô hình

1GK - 4DF - 4MF - 2FW

1GK - 4DF - 3MF - 3FW

1GK - 3DF - 5MF - 2FW

Gợi ý

```java
selectedTeam = new ArrayList<Player>();
Random general = new Random();
int gateKeeperSize = 0;
int defenderSize = 0;
int midFieldSize = 0;
int forwaderSize = 0;
System.out.println("List player: ");
while (gateKeeperSize < 1) { //Vì GK chỉ có 1 người nên vòng lặp sẽ dừng lại khi tìm được 1 người
     int rdGateKeeper = general.nextInt(22); //tìm cầu thủ ngẫu nhiên
         //Nếu cầu thủ ở vị trí ngẫu nhiên có vị trí là GK thì thêm vào danh sach
     if (allPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
           selectedTeam.add(allPlayers.get(rdGateKeeper));
           gateKeeperSize++;
     }
}

while (defenderSize < 4) {
     int rdDefender = general.nextInt(22);
     if (allPlayers.get(rdDefender).getPosition().equals(Position.DF)
         && !selectedTeam.contains(allPlayers.get(rdDefender))) {//Sử dụng contains để kiểm tra xem cầu thủ đó đã có trong danh sách chưa, nếu chưa thêm vào danh sách
         selectedTeam.add(allPlayers.get(rdDefender));
         defenderSize++;
     }
}
```