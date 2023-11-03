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

Jika admin memilih karyawan, maka program akan menjalankan alur proses yang tidak jauh berbeda dengan proses pengelolaan data buku. Untuk menambahkan atau mengubah data karyawan sendiri ada beberapa inputan yang harus dimasukkan oleh admin, inputan tersebut berupa id karyawan, nama karyawan dan atau  id penanggungjawab. Setelah itu program akan mengeksekusi data sesuai dengan pilihan admin sebelumnya entah itu menambahkan ataupun mengubah data karyawan dari database. Jika admin ingin melihat data karyawan, maka program akan mengambil data dari database untuk kemudian ditampilkan dalam aplikasi. Terakhir, jika admin ingin menghapus data karyawan, maka admin dapat memilih data karyawan yang akan dihapus dan kemudian program akan mengeksekusi atau menghapus data buku tersebut dari database. Setiap kali program selesai melakukan sebuah proses, maka program akan mengembalikan ke menu admin.

Jika admin memilih riwayat peminjaman, maka program akan menampilkan riwayat peminjaman yang telah dilakukan oleh member dan telah tercatat atau tersimpan dalam database. Jika user memilih log out maka program akan mengembalikan ke menu login, namun jika admin memilih pilihan yang salah maka program akan mengarahkan admin untuk memilih pilihan yang benar.

Ketika user login sebagai member, maka user dapat melakukan peminjaman buku dengan memilih buku yang akan dipinjam, kemudian memilih karyawan yang akan bertanggung jawab terhadap peminjaman tersebut. Setelah itu program akan menambahkan data riwayat peminjaman tersebut kedalam database. Selain melakukan peminjaman, member juga dapat melihat riwayat peminjaman. Jika member memilih riwayat, maka akan ditampilakn riwayat peminjaman buku yang telah dilakukan oleh member sebelumnya. Jika member ingin membatalkan pilihan, maka user dapat memilih “batal” kemudian kembali memilih pilihan yang ada baik itu meminjam ataupun melihat riwayat peminjaman. Setiap kali program selesai melakukan sebuah proses, maka program akan mengembalikan ke menu member termasuk pada saat jika member memilih log out.

### 2. ERD
![ERD](https://github.com/Novandra7/PA-PBO/assets/122107967/e923e393-e732-4c3c-bbc9-caa1ab41d6fe)

### 3. HIRARKI KELAS
![HIRARKI](https://github.com/Novandra7/PA-PBO/assets/122107967/d7972031-e809-4621-86c4-8db6c4f7672f)

### 4. SCREENSHOT CODINGAN DAN PENJELASAN
- Controller Account
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/39afadb2-eab6-466c-a86d-c53bd4e45799)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/f9a85bb0-266a-4da3-82be-341d2f7f6908)
  
- Controller Admin
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/09120f55-76c3-42f8-9101-c2d591e38a38)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/d816f374-ee6a-4ba5-b011-914ad2426eb5)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/32dafe47-7418-4ead-8a48-19d38b31bc7e)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/749695bc-e577-4656-b768-23d7be3a65d0)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/4dc8226f-26ef-4eb9-a009-a5084bf5a84b)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/2a61afe4-7a02-4064-8f41-c49c2ba3e274)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/f061dc30-df55-4fa9-80a6-f5fdbc20baee)

- Controller Database
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/62954f79-7e54-4580-a748-4a7cf8ce361f)

- InterfaceDatabse
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/91e49e0f-5a54-40a9-a9a9-8a28a94f22ea)

- Account
  
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/6522ac61-af8b-4f6f-9a45-b4d2b3b0efc3)

- Admin
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/309606d0-7cb7-4651-96ce-17bb3bba6240)

- Buku
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/7f5dffb5-6f6b-4c71-b582-38335e3a5280)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/18d5ffba-fad8-4c7b-9de9-ab6702fdad5f)

- Karyawan
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/9a4e02d0-c6e2-477b-ab1f-4e09cb48ad02)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/633e3ae4-5364-49d8-835d-7a8b85a920c3)

- Member
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/5d2d353a-1bac-4a63-b094-de86e9648030)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/99dc0a02-363f-4d8e-9027-16e57dc64871)

- Peminjaman
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/b0265e1d-a0b3-4e95-bfce-9065da13374d)
  ![image](https://github.com/Novandra7/PA-PBO/assets/122107967/7ae855fa-a655-4155-9961-0cd83ccbc3f8)

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

