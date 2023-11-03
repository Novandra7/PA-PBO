# PROJECT AKHIR PEMROGRAMAN BERIORIENTASI OBJEK 
## TEMA : PERPUSTAKAAN
### KELOMPOK 9
------
### Deskripsi Project

Proyek Sistem Informasi Perpustakaan adalah aplikasi Java yang bertujuan untuk mengelola dan memantau operasi sehari-hari dari sebuah perpustakaan. Sistem ini dirancang untuk memudahkan pengelolaan koleksi buku, peminjaman, pengembalian, dan pengelolaan data anggota.

DENGAN FITUR

- Manajemen Karyawan
- Manajemen Buku
- Peminjaman
- Statistik dan Laporan
- Sistem otentikasi

### 1. FLOWCHART
![new fc (1)](https://github.com/Novandra7/PA-PBO/assets/122107967/48395052-fea1-4846-855e-43e160f7f43d)
Alur proses dalam aplikasi ini dimulai dari menu login. Dalam menu ini user dapat melakukan login dengan menginputkan username, password dan memilih role jika dari user itu sendiri sudah memiliki akun. Jika ternyata user belum memiliki akun, maka user dapat melakukan registrasi terlebih dahulu dengan menginputkan username baru, password dan juga nama. Setelah itu user akan diarahkan untuk melakukan proses login dengan menginputkan data-data yang sudah diisi sebelumnya saat melakukan registrasi. Setelah menginputkan data pada saat proses login, maka program akan melakukan pengecekan terhadap inputan tersebut. Jika inputan yang dimasukkan sudah benar, maka program akan mengecek role dari si user tersebut, apakah dia login sebagai admin atau member. Jika user login sebagai admin maka program akan mengarahkan user ke menu admin. Jika user ternyata login sebagai member, maka program akan mengarahkan user ke menu member. Namun jika terdapat inputan yang tidak sesuai, maka program akan menampilkan notifikasi dan mengembalikan ke menu login.

Ketika user login sebagai admin, maka user dapat melakukan pengelolaan terhadap data buku, karyawan dan juga riwayat peminjaman yang ada di perpustakaan. Admin dapat memilih salah satu dari ketiga data tersebut untuk dikelola. Jika admin memilih buku, maka admin dapat melakukan pengelolaan data berupa menambahkan, melihat, mengubah ataupun menghapus data buku. Jika admin ingin menambahkan buku, maka admin dapat menginputkan data-data buku berupa kode, judul dan penulis buku untuk kemudian data tersebut disimpan ke dalam database. Jika admin ingin melihat buku, maka program akan mengambil data dari database untuk kemudian ditampilkan dalam aplikasi. Jika admin ingin mengubah data, maka admin dapat menginputkan judul atau penulis buku yang baru untuk kemudian diperbaharui di dalam database. Terakhir, jika admin ingin menghapus data buku, maka admin dapat memilih buku yang akan dihapus dan kemudian program akan mengeksekusi atau menghapus data buku tersebut dari database. Setiap kali program selesai melakukan sebuah proses, maka program akan mengembalikan ke menu admin.

Jika admin memilih karyawan, maka program akan menjalankan alur proses yang tidak jauh berbeda dengan proses pengelolaan data buku. Untuk menambahkan atau mengubah data karyawan sendiri ada beberapa inputan yang harus dimasukkan oleh admin, inputan tersebut berupa id karyawan, nama karyawan dan atau  id penanggungjawab. Setelah itu program akan mengeksekusi data sesuai dengan pilihan admin sebelumnya entah itu menambahkan ataupun mengubah data karyawan dari database. Jika admin ingin melihat data karyawan, maka program akan mengambil data dari database untuk kemudian ditampilkan dalam aplikasi. Terakhir, jika admin ingin menghapus data karyawan, maka admin dapat memilih data karyawan yang akan dihapus dan kemudian program akan mengeksekusi atau menghapus data karyawan tersebut dari database. Setiap kali program selesai melakukan sebuah proses, maka program akan mengembalikan ke menu admin.

Jika admin memilih riwayat peminjaman, maka program akan menampilkan riwayat peminjaman yang telah dilakukan oleh member dan telah tercatat atau tersimpan dalam database. Jika user memilih log out maka program akan mengembalikan ke menu login, namun jika admin memilih pilihan yang salah maka program akan mengarahkan admin untuk memilih pilihan yang benar.

Ketika user login sebagai member, maka user dapat melakukan peminjaman buku dengan memilih buku yang akan dipinjam, kemudian memilih karyawan yang akan bertanggung jawab terhadap peminjaman tersebut. Setelah itu program akan menambahkan data riwayat peminjaman tersebut kedalam database. Selain melakukan peminjaman, member juga dapat melihat riwayat peminjaman. Jika member memilih riwayat, maka akan ditampilakn riwayat peminjaman buku yang telah dilakukan oleh member sebelumnya. Jika member ingin membatalkan pilihan, maka member dapat memilih “batal” kemudian kembali memilih pilihan yang diinginkan entah itu meminjam ataupun melihat riwayat peminjaman. Setiap kali program selesai melakukan sebuah proses, maka program akan mengembalikan ke menu member termasuk pada saat jika member memilih log out.

### 2. ERD
![Logical](https://github.com/Novandra7/PA-PBO/assets/122107967/a107b72e-2b9a-4d50-968b-5769ab968ebe)

Dalam ERD ini, terdapat entitas utama yang melibatkan tiga jenis pengguna: admin, member, dan karyawan. Admin bertanggung jawab atas pengelolaan buku dalam perpustakaan, termasuk menambahkan, mengubah, dan menghapus data buku. Member dapat melakukan peminjaman buku, tetapi hanya satu buku dalam satu waktu. Setelah mengembalikan buku, member dapat meminjam buku lainnya. Karyawan berperan dalam memeriksa status peminjaman yang dilakukan oleh member.

Konsep supertype dan subtype digunakan untuk membedakan antara admin dan member sebagai subtype dari entitas akun. Admin dan member memiliki atribut khusus, namun keduanya merupakan jenis akun dalam sistem perpustakaan.

Dalam hubungan antar entitas, terdapat keterkaitan atau relasi wajib (mandatory) dan opsional. Admin memiliki relasi yang wajib dengan buku, yang berarti admin harus mengelola buku dalam sistem. Karyawan memiliki relasi yang wajib dengan peminjaman, mengindikasikan bahwa karyawan bertanggung jawab memeriksa peminjaman yang dilakukan oleh member. Di sisi lain, hubungan antara member dan peminjaman bersifat opsional, yang berarti seorang member tidak wajib melakukan peminjaman buku.

Konsep non-transferability diterapkan pada relasi antara member dan peminjaman, yang berarti nilai dari entitas peminjaman tidak dapat dipindahkan antar member. Hal ini memastikan bahwa setiap peminjaman buku tetap terkait dengan member yang melakukan peminjaman.

Rekursif digunakan untuk memodelkan hubungan antar karyawan. Rekursif memungkinkan fleksibilitas dalam memodelkan struktur hierarki antar karyawan, seperti atasan, bawahan, dan rekan kerja, tanpa perlu membuat banyak entitas terpisah. Setiap karyawan dapat memiliki hubungan dengan karyawan lainnya, tetapi tidak ada kewajiban bagi setiap karyawan untuk memimpin atau dipimpin oleh karyawan lainnya.

### 3. HIRARKI KELAS
![HIRARKI](https://github.com/Novandra7/PA-PBO/assets/122107967/d7972031-e809-4621-86c4-8db6c4f7672f)

Dalam pengembangan aplikasi perpustakaan ini, kami menerapkan konsep hirarki dengan super class `Akun`, yang memiliki dua sub class yaitu `Admin` dan `Member`. 
Dalam hirarki ini, `Akun` yang adalah super class menyimpan atribut umum seperti user ID, nama pengguna, dan password. Sub class `Admin` memiliki kapabilitas untuk mengelola buku dalam perpustakaan, sementara sub class `Member` memiliki kapabilitas terkait peminjaman dan pengembalian buku.
Penggunaan konsep hirarki kelas ini membantu dalam pemeliharaan sistem, memastikan fleksibilitas, dan memungkinkan pengembangan aplikasi perpustakaan yang efisien dan terstruktur.

### 4. SCREENSHOT CODINGAN DAN PENJELASAN
- Controller Account
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/39afadb2-eab6-466c-a86d-c53bd4e45799)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/f9a85bb0-266a-4da3-82be-341d2f7f6908)

1. Inisialisasi ArrayList:
Codingan diatas dimulai dengan mendeklarasikan dan menginisialisasi `ArrayList` bernama `dataAccount`. `ArrayList` ini digunakan untuk menyimpan objek-objek akun, baik dari kelas `Admin` maupun `Member`.
2. Metode `radioAdminSelected`:
Metode ini mengambil data akun admin dari database dan menyimpannya dalam objek `Admin`. Kemudian melakukan pemeriksaan (looping) apakah inputan user sesuai dengan akun admin yang ada dalam `dataAccount`. Jika cocok, metode akan mengembalikan `true`, jika tidak, maka metode akan mengembalikan `false`.
3. Metode `radioMemberSelected`:
Metode ini mirip dengan `radioAdminSelected`, namun kali ini untuk akun member. Metode ini juga mengambil data akun member dari database dan membandingkannya dengan inputan user.
4. Metode `registerAccount`:
Metode ini digunakan untuk mendaftarkan akun baru dengan cara membuat objek `Account` baru dengan informasi yang dimasukkan oleh user dan menyimpannya dalam `dataAccount`. Selanjutnya, metode akan memasukkan data akun baru ke dalam tabel `akun` dan `member` di database.

Codingan diatas berfokus pada manajemen akun dalam aplikasi perpustakaan. Ini mencakup pemeriksaan akun admin dan member, serta mendaftarkan akun baru ke dalam sistem. Data akun disimpan dalam bentuk objek dan juga disinkronkan dengan basis data menggunakan query SQL.
  
- Controller Admin
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/09120f55-76c3-42f8-9101-c2d591e38a38)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/d816f374-ee6a-4ba5-b011-914ad2426eb5)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/32dafe47-7418-4ead-8a48-19d38b31bc7e)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/749695bc-e577-4656-b768-23d7be3a65d0)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/4dc8226f-26ef-4eb9-a009-a5084bf5a84b)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/2a61afe4-7a02-4064-8f41-c49c2ba3e274)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/f061dc30-df55-4fa9-80a6-f5fdbc20baee)

1. Deklarasi ArrayList:
Codingan diatas dimulai dengan mendeklarasikan dan menginisialisasi dua ArrayList, yaitu `dataBukudanKaryawandanPeminjaman` dan `dataPeminjaman`. ArrayList pertama digunakan untuk menyimpan objek buku dan karyawan, serta data peminjaman, sementara ArrayList kedua digunakan khusus untuk menyimpan data peminjaman.
2. Metode `createTableContent`:
Metode ini digunakan untuk mengambil data dari tabel buku, karyawan, atau peminjaman dalam database dan menyimpannya dalam bentuk objek Buku, Karyawan, atau Peminjaman. Metode ini menggunakan argumen `tableName` untuk menentukan jenis data yang akan diambil dari database dan kemudian hasilnya disimpan dalam ArrayList `dataBukudanKaryawandanPeminjaman` dan metode mengembalikan ArrayList ini.
3. Metode `showTableContent`:
Metode ini mengonversi data objek buku, karyawan, atau peminjaman ke dalam bentuk array string. Data yang disimpan dalam ArrayList `tableContent` diubah menjadi array string dan disimpan dalam ArrayList `rows`, yang kemudian akan dikembalikan.
4. Metode `insertDataBuku` dan `insertDataKaryawan`:
Metode-metode ini digunakan untuk menyisipkan atau menambahkan data buku dan karyawan baru ke dalam database. Metode ini membuat objek Buku atau Karyawan baru dan menyimpannya dalam ArrayList `dataBukudanKaryawandanPeminjaman`. Data baru juga disimpan dalam tabel `buku` atau `karyawan` dalam database.
5. Metode `deleteDataBuku` dan `deleteDataKaryawan`:
Metode-metode ini digunakan untuk menghapus data buku atau karyawan dari database dan ArrayList `dataBukudanKaryawandanPeminjaman`. Objek buku atau karyawan yang sesuai dihapus dari ArrayList dan juga dari tabel `buku` atau `karyawan` dalam database.
6. Metode `setTextFieldBuku` dan `setTextFieldKaryawan`:
Metode-metode ini digunakan untuk mengisi kolom teks dalam interface user dengan data buku atau karyawan yang sesuai ketika user memilih baris tertentu di tabel.
7. Metode `updateDataBuku` dan `updateDataKaryawan`:
Metode-metode ini digunakan untuk memperbarui data buku atau karyawan dalam database dan ArrayList `dataBukudanKaryawandanPeminjaman`. Objek buku atau karyawan yang sesuai diperbarui dengan nilai baru dalam ArrayList dan juga dalam tabel `buku` atau `karyawan` dalam database.
8. Metode `setRadioId` dan `getIdPeminjaman`:
`setRadioId` mengambil ID karyawan dari database dan mengembalikannya dalam bentuk ArrayList string. `getIdPeminjaman` mengambil ID peminjaman dari database dan mengembalikannya dalam bentuk integer.
9. Metode `createRiwayatPeminjaman` dan `getRiwayatById`:
`createRiwayatPeminjaman` digunakan untuk mencatat riwayat peminjaman baru ke dalam database dan ArrayList `dataPeminjaman`. `getRiwayatById` mengambil riwayat peminjaman berdasarkan ID pengguna dan mengembalikannya dalam bentuk ArrayList array objek.

Codingan ini berinteraksi dengan database menggunakan query SQL, mengubah data ke dalam objek Java, dan menyimpannya dalam ArrayList untuk pengolahan lebih lanjut dalam aplikasi.

- Controller Database
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/62954f79-7e54-4580-a748-4a7cf8ce361f)

Codingan diatas adalah implementasi dari kelas `ControllerDatabase`. Kelas ini bertanggung jawab untuk mengelola koneksi ke database MySQL dan menjalankan query SQL untuk operasi pemilihan (select) dan pembaruan (update) data.
1. Deklarasi Variabel:
Codingan diatas mendeklarasikan beberapa variabel, termasuk `Connection con`, `Statement st`, dan `ResultSet rs`. `Connection` digunakan untuk mengelola koneksi ke database, `Statement` digunakan untuk mengirim pernyataan SQL ke database, dan `ResultSet` digunakan untuk menyimpan hasil query.
2. Konstruktor `ControllerDatabase`:
Konstruktor ini dipanggil saat objek dari kelas `ControllerDatabase` dibuat. Dalam konstruktor ini, koneksi ke database MySQL diinisialisasi menggunakan `DriverManager.getConnection()`. Jika koneksi gagal, pesan kesalahan akan ditampilkan menggunakan `JOptionPane`.
3. Metode `executeSelectQuery`:
Metode ini menerima sebuah query SQL sebagai parameter (`qq`), menjalankannya menggunakan objek `Statement`, dan mengembalikan hasil query dalam bentuk `ResultSet`. Metode ini digunakan untuk menjalankan query seleksi dan mengambil data dari database.
4. Metode `executeUpdateQuery`:
Metode ini menerima sebuah query SQL sebagai parameter (`query`), menjalankannya menggunakan objek `Statement`, dan tidak mengembalikan nilai. Metode ini digunakan untuk menjalankan query pembaruan, seperti operasi penambahan, penghapusan, atau perubahan data di database.

Kelas `ControllerDatabase` mengimplementasikan `InterfaceDatabase` yang berisi definisi metode-metode terkait database lainnya.
Codingan ini digunakan untuk mengelola koneksi ke database dan menjalankan query SQL dalam konteks aplikasi perpustakaan. Codingan ini menggunakan JDBC (Java Database Connectivity) untuk berinteraksi dengan basis data MySQL.

- InterfaceDatabse
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/91e49e0f-5a54-40a9-a9a9-8a28a94f22ea)

Codingan di atas adalah definisi dari sebuah interface atau antarmuka dalam bahasa pemrograman Java, yaitu `InterfaceDatabase`. 
1. Keyword `interface`:
Interface (`InterfaceDatabase`) didefinisikan menggunakan kata kunci `interface`. Interface adalah sebuah kontrak di Java di mana hanya metode-metodenya dideklarasikan, tetapi tidak diimplementasikan. Kelas lain dapat mengimplementasikan metode-metode ini sesuai kebutuhan.
2. Metode `executeSelectQuery`:
Metode ini mendeklarasikan sebuah metode dengan nama `executeSelectQuery` yang mengembalikan objek `ResultSet`. Metode ini menerima satu parameter bertipe `String` yang merupakan query SQL seleksi. `executeSelectQuery` akan digunakan untuk menjalankan query seleksi pada database dan mengembalikan hasil query dalam bentuk objek `ResultSet`. Objek `ResultSet` digunakan untuk menyimpan hasil data dari query SQL.
3. Metode `executeUpdateQuery`:
Metode ini mendeklarasikan sebuah metode dengan nama `executeUpdateQuery` yang tidak mengembalikan nilai (`void`). Metode ini juga menerima satu parameter bertipe `String` yang merupakan query SQL pembaruan (update, insert, delete, dll.). `executeUpdateQuery` akan digunakan untuk menjalankan query pembaruan pada database. Metode ini akan digunakan untuk operasi-operasi yang memodifikasi data dalam database, seperti menambahkan, menghapus, atau mengubah data.

Interface ini menyediakan definisi untuk metode-metode yang harus ada dalam kelas-kelas yang mengimplementasikannya. Kelas-kelas yang ingin berinteraksi dengan database perpustakaan harus mengimplementasikan interface `InterfaceDatabase`, yaitu melengkapi implementasi dari metode `executeSelectQuery` dan `executeUpdateQuery` sesuai dengan logika bisnis aplikasi tersebut.

- Account
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/6522ac61-af8b-4f6f-9a45-b4d2b3b0efc3)

1. Pewarisan (`extends ControllerDatabase`):
Kelas `Account` mewarisi sifat dan metode dari kelas `ControllerDatabase`. Ini berarti `Account` memiliki akses ke metode-metode yang ada dalam `ControllerDatabase` karena mewarisi kelas tersebut.
2. Variabel Instance:
Kelas `Account` memiliki tiga variabel instance: `userId` (ID pengguna), `password` (kata sandi), dan `namaPengguna` (nama pengguna). Variabel-variabel ini digunakan untuk menyimpan informasi akun.
3. Konstruktor:
Kelas ini memiliki sebuah konstruktor yang menerima tiga parameter: `userId`, `password`, dan `namaPengguna`. Ketika objek `Account` dibuat, nilai-nilai ini dapat diberikan ke variabel instance sesuai dengan parameter yang diterima.
4. Metode Getters:
Terdapat tiga metode `getUserId()`, `getNamaPengguna()`, dan `getPassword()`, yang digunakan untuk mengambil nilai dari variabel instance `userId`, `namaPengguna`, dan `password` secara terpisah. Metode-metode ini memungkinkan akses ke informasi akun dari luar kelas.
5. Implementasi Metode dari `ControllerDatabase`:
Kelas `Account` mengimplementasikan metode-metode yang didefinisikan dalam antarmuka `InterfaceDatabase` (yang diwarisi melalui `ControllerDatabase`). Metode `executeUpdateQuery` dan `executeSelectQuery` digunakan untuk menjalankan query pembaruan dan seleksi pada database. Implementasi metode ini memungkinkan objek `Account` untuk berinteraksi dengan database melalui kelas `ControllerDatabase`.

Dengan menggunakan pewarisan dari `ControllerDatabase` dan implementasi metode-metode dari `InterfaceDatabase`, kelas `Account` dapat digunakan untuk mengelola data akun dalam aplikasi perpustakaan ini. Objek `Account` dapat menjalankan query SQL pada database dan mengambil atau memperbarui informasi akun sesuai kebutuhan aplikasi.

- Admin
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/309606d0-7cb7-4651-96ce-17bb3bba6240)

1. Pewarisan (`extends Account`):
Kelas `Admin` mewarisi sifat dan metode dari kelas `Account`. Dengan kata lain, `Admin` merupakan turunan dari `Account` dan memiliki akses ke variabel-variabel instance (`userId`, `password`, dan `namaPengguna`) serta metode-metode (`getUserId()`, `getPassword()`, dan `getNamaPengguna()`) yang didefinisikan dalam kelas `Account`.
2. Variabel Instance:
Kelas `Admin` memiliki dua variabel instance: `noTelp` (nomor telepon) dan `values` (objek ResultSet). Variabel `noTelp` adalah variabel final yang digunakan untuk menyimpan nomor telepon admin, sementara `values` adalah variabel statis yang digunakan untuk menyimpan hasil dari query SQL.
3. Objek ControllerDatabase:
Kelas ini memiliki variabel statis `db` dari tipe `ControllerDatabase`. Variabel ini digunakan untuk membuat objek `ControllerDatabase`, yang nantinya dapat digunakan untuk menjalankan query SQL.
4. Konstruktor:
Kelas ini memiliki sebuah konstruktor yang menerima empat parameter: `noTelp`, `userId`, `password`, dan `namaPengguna`. Konstruktor ini memanggil konstruktor dari kelas induk (`Account`) menggunakan kata kunci `super` dan menginisialisasi variabel instance `noTelp` dengan nilai dari parameter `noTelp`.
5. Metode `getAdminAccount`:
Metode ini adalah statis dan digunakan untuk mendapatkan akun admin dari database. Metode ini menerima sebuah query SQL sebagai parameter dan mengembalikan objek `ResultSet` yang berisi hasil dari query SQL tersebut. Metode ini menggunakan objek `db` (ControllerDatabase) untuk menjalankan query SQL.

Kelas `Admin` ini dibuat untuk mengelola informasi akun admin dalam aplikasi perpustakaan ini. Dengan mewarisi dari `Account`, `Admin` memiliki akses ke informasi akun umum yang diperlukan, sementara metodenya memungkinkan pengambilan data akun admin dari database menggunakan objek `ControllerDatabase`. Variabel `values` digunakan untuk menyimpan hasil query sehingga dapat diakses di luar kelas `Admin`.

- Buku
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/7f5dffb5-6f6b-4c71-b582-38335e3a5280)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/18d5ffba-fad8-4c7b-9de9-ab6702fdad5f)

1. Variabel Instance:
Kelas `Buku` memiliki empat variabel instance: `kodeBuku` (kode unik untuk buku), `judulBuku` (judul buku), `penulisBuku` (nama penulis buku), dan `statusPeminjaman` (status peminjaman buku). Variabel-variabel ini digunakan untuk menyimpan informasi tentang buku.
2. Objek ControllerDatabase:
Kelas ini memiliki variabel statis `db` dari tipe `ControllerDatabase`. Variabel ini digunakan untuk membuat objek `ControllerDatabase`, yang nantinya dapat digunakan untuk menjalankan query SQL.
3. Konstruktor:
Kelas ini memiliki sebuah konstruktor yang menerima empat parameter: `kodeBuku`, `judulBuku`, `penulisBuku`, dan `statusPeminjaman`. Konstruktor ini digunakan untuk menginisialisasi variabel instance dengan nilai-nilai yang diberikan sebagai parameter.
4. Metode Getters dan Setters:
Terdapat metode-metode `getKodeBuku()`, `getJudulBuku()`, `getPenulisBuku()`, `getStatusPeminjaman()`, `setKodeBuku()`, `setJudulBuku()`, `setPenulisBuku()`, dan `setStatusPeminjaman()`. Metode-metode ini memungkinkan akses dan pengaturan nilai dari variabel instance `kodeBuku`, `judulBuku`, `penulisBuku`, dan `statusPeminjaman`.
5. Metode `getBuku`:
Metode ini adalah statis dan digunakan untuk mendapatkan data buku dari database. Metode ini menerima sebuah query SQL sebagai parameter dan mengembalikan objek `ResultSet` yang berisi hasil dari query SQL tersebut. Metode ini menggunakan objek `db` (ControllerDatabase) untuk menjalankan query SQL.
6. Metode `setBuku`:
Metode ini digunakan untuk menjalankan query SQL untuk memperbarui atau menyisipkan data buku ke database. Metode ini menerima sebuah query SQL sebagai parameter dan menjalankannya menggunakan objek `db` (ControllerDatabase).

Kelas `Buku` ini dibuat untuk merepresentasikan buku dalam aplikasi perpustakaan ini. Dengan begitu, informasi buku dapat diambil dari database atau diperbarui ke database sesuai dengan kebutuhan aplikasi. Variabel-variabel instance ini memungkinkan penyimpanan dan manipulasi data buku dalam objek `Buku`.

- Karyawan
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/9a4e02d0-c6e2-477b-ab1f-4e09cb48ad02)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/633e3ae4-5364-49d8-835d-7a8b85a920c3)

1. Variabel Instance:
Kelas `Karyawan` memiliki tiga variabel instance: `idKaryawan` (ID unik untuk karyawan), `namaKaryawan` (nama karyawan), dan `idPenanggungJawab` (ID penanggung jawab karyawan). Variabel-variabel ini digunakan untuk menyimpan informasi tentang karyawan.
2. Objek ControllerDatabase:
Kelas ini memiliki variabel statis `db` dari tipe `ControllerDatabase`. Variabel ini digunakan untuk membuat objek `ControllerDatabase`, yang nantinya dapat digunakan untuk menjalankan query SQL.
3. Konstruktor:
Kelas ini memiliki sebuah konstruktor yang menerima tiga parameter: `idKaryawan`, `namaKaryawan`, dan `idPenanggungJawab`. Konstruktor ini digunakan untuk menginisialisasi variabel instance dengan nilai-nilai yang diberikan sebagai parameter.
4. Metode Getters dan Setters:
Terdapat metode-metode `getIdKaryawan()`, `getNamaKaryawan()`, `getIdPenanggungJawab()`, `setIdKaryawan()`, `setNamaKaryawan()`, dan `setIdPenanggungJawab()`. Metode-metode ini memungkinkan akses dan pengaturan nilai dari variabel instance `idKaryawan`, `namaKaryawan`, dan `idPenanggungJawab`.
5. Metode `getKaryawan`:
Metode ini adalah statis dan digunakan untuk mendapatkan data karyawan dari database. Metode ini menerima sebuah query SQL sebagai parameter dan mengembalikan objek `ResultSet` yang berisi hasil dari query SQL tersebut. Metode ini menggunakan objek `db` (ControllerDatabase) untuk menjalankan query SQL.
6. Metode `setKaryawan`:
Metode ini digunakan untuk menjalankan query SQL untuk memperbarui atau menyisipkan data karyawan ke database. Metode ini menerima sebuah query SQL sebagai parameter dan menjalankannya menggunakan objek `db` (ControllerDatabase).

Kelas `Karyawan` ini dibuat untuk merepresentasikan karyawan dalam aplikasi perpustakaan ini. Dengan begitu, informasi karyawan dapat diambil dari database atau diperbarui ke database sesuai dengan kebutuhan aplikasi. Variabel-variabel instance ini memungkinkan penyimpanan dan manipulasi data karyawan dalam objek `Karyawan`.

- Member
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/5d2d353a-1bac-4a63-b094-de86e9648030)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/99dc0a02-363f-4d8e-9027-16e57dc64871)

1. Variabel Instance:
Kelas `Member` memiliki sebuah variabel instance `statusMember` yang digunakan untuk menyimpan status keanggotaan member (misalnya, "mahasiswa", "siswa" atau "pekerja").
2. Objek ControllerDatabase:
Kelas ini memiliki variabel statis `db` dari tipe `ControllerDatabase`. Variabel ini digunakan untuk membuat objek `ControllerDatabase`, yang nantinya dapat digunakan untuk menjalankan query SQL.
3. Konstruktor:
Kelas ini memiliki sebuah konstruktor yang menerima empat parameter: `statusMember`, `userId`, `password`, dan `namaPengguna`. Konstruktor ini memanggil konstruktor dari kelas induk (`Account`) menggunakan kata kunci `super` untuk menginisialisasi variabel instance dan metodenya.
4. Metode Getters dan Setters:
Terdapat metode `getStatusMember()` untuk mendapatkan nilai variabel `statusMember`, dan metode `setStatusMember(String statusMember)` untuk mengatur nilai variabel `statusMember`. Ada juga override dari metode `getPassword()`, `getNamaPengguna()`, dan `getUserId()` dari kelas `Account`.
5. Metode `getMemberAccount`:
Metode ini adalah statis dan digunakan untuk mendapatkan data member dari database. Metode ini menerima sebuah query SQL sebagai parameter dan mengembalikan objek `ResultSet` yang berisi hasil dari query SQL tersebut. Metode ini menggunakan objek `db` (ControllerDatabase) untuk menjalankan query SQL.
6. Metode `setMemberAccount`:
Metode ini adalah statis dan digunakan untuk menjalankan query SQL untuk memperbarui atau menyisipkan data member ke database. Metode ini menerima sebuah query SQL sebagai parameter dan menjalankannya menggunakan objek `db` (ControllerDatabase).

Kelas `Member` ini dibuat untuk merepresentasikan anggota perpustakaan yang memiliki status keanggotaan tertentu. Dengan begitu, informasi anggota perpustakaan dapat diambil dari database atau diperbarui ke database sesuai dengan kebutuhan aplikasi. Variabel `statusMember` memungkinkan penyimpanan dan manipulasi status keanggotaan dalam objek `Member`.

- Peminjaman
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/b0265e1d-a0b3-4e95-bfce-9065da13374d)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/7ae855fa-a655-4155-9961-0cd83ccbc3f8)

1. Variabel Instance:
Kelas `Peminjaman` memiliki beberapa variabel instance, yaitu `idPeminjaman` (ID unik untuk peminjaman), `userId` (ID unik untuk pengguna yang melakukan peminjaman), `kodeBuku` (kode unik untuk buku yang dipinjam), `tanggalPeminjaman` (tanggal ketika peminjaman dilakukan), dan `idKaryawan` (ID karyawan yang menangani peminjaman). Variabel-variabel ini digunakan untuk menyimpan informasi tentang peminjaman buku.
2. Objek ControllerDatabase:
Kelas ini memiliki variabel statis `db` dari tipe `ControllerDatabase`. Variabel ini digunakan untuk membuat objek `ControllerDatabase`, yang nantinya dapat digunakan untuk menjalankan query SQL.
3. Konstruktor:
Kelas ini memiliki sebuah konstruktor yang menerima lima parameter: `idPeminjaman`, `userId`, `kodeBuku`, `tanggalPeminjaman`, dan `idKaryawan`. Konstruktor ini digunakan untuk menginisialisasi variabel instance dengan nilai-nilai yang diberikan sebagai parameter.
4. Metode Getters:
Terdapat metode-metode `getIdPeminjaman()`, `getUserId()`, `getKodeBuku()`, `getTanggalPeminjaman()`, dan `getIdKaryawan()`. Metode-metode ini memungkinkan akses nilai dari variabel instance.
5. Metode `getPeminjaman`:
Metode ini adalah statis dan digunakan untuk mendapatkan data peminjaman dari database. Metode ini menerima sebuah query SQL sebagai parameter dan mengembalikan objek `ResultSet` yang berisi hasil dari query SQL tersebut. Metode ini menggunakan objek `db` (ControllerDatabase) untuk menjalankan query SQL.
6. Metode `setPeminjaman`:
Metode ini adalah statis dan digunakan untuk menjalankan query SQL untuk memperbarui atau menyisipkan data peminjaman ke database. Metode ini menerima sebuah query SQL sebagai parameter dan menjalankannya menggunakan objek `db` (ControllerDatabase).

Kelas `Peminjaman` ini dibuat untuk merepresentasikan peminjaman buku dalam aplikasi perpustakaan ini. Dengan begitu, informasi peminjaman buku dapat diambil dari database atau diperbarui ke database sesuai dengan kebutuhan aplikasi. Variabel-variabel instance ini memungkinkan penyimpanan dan manipulasi data peminjaman dalam objek `Peminjaman`.

### 5. SCREENSHOT OUTPUT
- Tampilan Login
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/b380bc03-6c76-4b67-8368-279d443d75f4)

- Tampilan Register
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/aff20f6d-349e-48ae-9dbf-de3e5264a29e)

- Tampilan User
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/5ece082f-3fbc-4fd3-81d7-cbd8e2face95)

- Tampilan Awal Admin
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/5d54f82e-d441-4b0b-a26c-37ac07c20101)

- Tampilan CRUD Buku
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/0b76761c-dadc-476f-824c-10acf081ce2d)

- Tampilan CRUD Karyawan
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/2e1bb4ec-615e-4de8-aa99-e35ed3ced0ef)

- Tampilan Riwayat Peminjaman
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/4b898830-b0ba-4554-8d7f-57ab11d1b256)

- Tampilan Riwayat Peminjaman Member

  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/dfd216b7-0e9b-4ac3-a6a8-d7fc7f29db7c)

