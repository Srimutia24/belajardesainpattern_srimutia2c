ANALISA UNTUK FILE DUCK.JAVA

1)	Antarmuka QuackBehavior dan FlyBehavior:
      Antarmuka ini digunakan untuk mendefinisikan perilaku quack (suara bebek) dan fly (terbang). Setiap antarmuka hanya memiliki satu metode yang sesuai dengan perilaku yang diwakilinya.

2)	Kelas Implementasi Perilaku Quack (Quack, Squeak, MuteQuack):
      Kelas-kelas ini mewakili berbagai perilaku quack yang berbeda, seperti quack standar, squeak, dan mute (tidak bersuara). Setiap kelas mengimplementasikan antarmuka QuackBehavior.

3)	Kelas Implementasi Perilaku Fly (FlyWithWings, FlyNoWay, FlyWithRocketPower):
      Kelas-kelas ini mewakili berbagai perilaku terbang yang berbeda, seperti terbang dengan sayap, tidak bisa terbang, dan terbang dengan tenaga roket. Setiap kelas mengimplementasikan antarmuka FlyBehavior.

4)	Kelas Duck yang Dikembangkan
      Kelas Duck kini memiliki dua variabel instance, yaitu quackBehavior dan flyBehavior, yang merepresentasikan perilaku quack dan fly secara terpisah. Metode performQuack() dan performFly() digunakan untuk menjalankan perilaku quack dan fly sesuai dengan implementasi masing-masing perilaku yang telah ditetapkan.
      Metode setQuackBehavior() dan setFlyBehavior() digunakan untuk mengatur perilaku quack dan fly pada saat runtime.

5)	Kelas-kelas Turunan MallardDuck, RedheadDuck, RubberDuck, WoodenDuck, dan ModelDuck:
      Kelas-kelas ini mengimplementasikan metode display() untuk menentukan tampilan masing-masing jenis bebek, serta melakukan inisialisasi perilaku quack dan fly sesuai dengan jenis bebeknya.
      Dengan menggunakan komposisi untuk menyimpan perilaku-perilaku yang bervariasi, kita dapat dengan mudah mengganti perilaku bebek secara dinamis dengan hanya mengatur objek-objek strategi yang sesuai. Ini meningkatkan fleksibilitas aplikasi dan memisahkan implementasi dari perilaku-perilaku tertentu ke dalam kelas-kelas yang terpisah.


ANALISA UNTUK FILE TUGAS.JAVA

1). Implementasi Strategy Pattern:
Code tersebut mendemonstrasikan implementasi Strategy Design Pattern dengan dua strategi: DiskonPersen dan DiskonPotongan.
Interface DiskonStrategy mendefinisikan satu metode abstrak hitungDiskon.
Kelas DiskonPersen dan DiskonPotongan mengimplementasikan DiskonStrategy dan mendefinisikan logika perhitungan diskon masing-masing.

2). Class Context:
Class Pembelian menampung strategi diskon yang sedang digunakan (strategiDiskon).
Method hitungTotalHarga menghitung total harga dengan menggunakan strategi diskon yang dipilih.
Method setStrategiDiskon memungkinkan perubahan strategi diskon secara dinamis.

3). Penggunaan:
Code menunjukkan contoh penggunaan dua strategi diskon dengan DiskonPersen dan DiskonPotongan.
Total harga dihitung dengan strategi yang berbeda dan hasilnya ditampilkan.

4). Analisa Kelebihan:
Code ini menunjukkan implementasi Strategy Design Pattern yang jelas dan mudah dipahami.
Penggunaan strategi memungkinkan perhitungan diskon yang fleksibel dan dapat diubah dengan mudah.
Code mudah diperluas dengan menambahkan strategi diskon baru.

5). Analisa Kekurangan:
Code ini hanya menunjukkan contoh sederhana dengan dua strategi.
Dalam aplikasi yang lebih kompleks, mungkin diperlukan pengelolaan strategi yang lebih kompleks.

6). Kesimpulan:
Code ini menunjukkan implementasi Strategy Design Pattern yang baik dan dapat digunakan sebagai contoh
untuk mempelajari pattern ini. Code ini mudah dipahami dan dapat diubah untuk kebutuhan yang berbeda