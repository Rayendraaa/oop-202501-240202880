# Laporan Praktikum Minggu 6

Topik: Desain Arsitektur Sistem dengan UML dan Prinsip SOLID (Agri-POS)

## Identitas

* Nama  : Rayendra Apta Nayottama
* NIM   : 240202880
* Kelas : 3IKRA

---

## Tujuan

Mahasiswa mampu merancang arsitektur sistem Agri-POS menggunakan diagram UML serta menerapkan prinsip-prinsip SOLID agar sistem bersifat modular, mudah dikembangkan, dan mudah dipelihara.

---

## Dasar Teori

1. UML (Unified Modeling Language) digunakan untuk memvisualisasikan desain sistem.
2. Use Case Diagram menggambarkan interaksi aktor dengan sistem.
3. Activity Diagram menjelaskan alur proses bisnis.
4. Sequence Diagram menunjukkan urutan komunikasi antar objek.
5. Class Diagram menjelaskan struktur kelas dan relasinya.
6. Prinsip SOLID membantu menghasilkan desain perangkat lunak yang baik.

---

## Langkah Praktikum

1. Mengidentifikasi kebutuhan sistem Agri-POS berdasarkan functional requirements.
2. Menentukan aktor dan use case utama sistem.
3. Membuat Use Case, Activity, Sequence, dan Class Diagram menggunakan format Mermaid.
4. Menyesuaikan desain dengan implementasi Week 11 (DAO), Week 12 (JavaFX Form), dan Week 13 (TableView).
5. Menyusun laporan dan menyimpan hasil diagram pada folder docs.
6. Melakukan commit dengan format: `week6-uml-solid: iterasi-N deskripsi`.

---

## Kode Program

Berikut contoh potongan kode yang sesuai dengan desain UML dan SOLID pada sistem Agri-POS:

```java
ProductDAO dao = new ProductDAOImpl(connection);
ProductService service = new ProductService(dao);
ProductController controller = new ProductController(service);

controller.add("P01", "Pupuk Organik", 25000, 10);
```

Kode tersebut menunjukkan penerapan Dependency Inversion Principle, di mana service bergantung pada interface ProductDAO.

---

## Hasil Eksekusi

Hasil perancangan sistem ditunjukkan melalui diagram UML berikut:

* Use Case Diagram  : docs/uml_usecase.png
* Activity Diagram : docs/uml_activity.png
* Sequence Diagram : docs/uml_sequence.png
* Class Diagram    : docs/uml_class.png

Contoh screenshot:
<img width="566" height="227" alt="image" src="https://github.com/user-attachments/assets/4ce3bf22-2fb7-4212-b294-bce35cf2d540" />
<img width="139" height="346" alt="image" src="https://github.com/user-attachments/assets/3be012da-aab8-45ac-b210-96c928b697aa" />
<img width="421" height="390" alt="image" src="https://github.com/user-attachments/assets/26dac9b5-1a59-4843-bf9d-1724defb40cb" />
<img width="280" height="359" alt="image" src="https://github.com/user-attachments/assets/da437898-fa45-4645-a91b-f28a06252246" />




---

## Analisis

1. Sistem dirancang menggunakan pola MVC dan DAO.
2. View hanya menangani antarmuka (JavaFX), sedangkan logika bisnis berada pada Service.
3. Data diakses melalui DAO sehingga tidak terjadi ketergantungan langsung dengan database.
4. Dibandingkan minggu sebelumnya, pada minggu ini fokus lebih pada desain arsitektur dibandingkan implementasi.
5. Kendala yang dihadapi adalah menyelaraskan semua diagram agar konsisten, yang diatasi dengan membuat alur View → Controller → Service → DAO → DB.

---

## Kesimpulan

Dengan menggunakan UML dan prinsip SOLID, sistem Agri-POS dapat dirancang secara terstruktur, modular, dan mudah dikembangkan. Desain ini mempermudah integrasi dengan implementasi pada Week 11 hingga Week 13.

---

## Quiz

1. Jelaskan perbedaan aggregation dan composition serta berikan contoh penerapannya pada desain Anda.
   **Jawaban:**
   Aggregation adalah hubungan lemah antara dua kelas, di mana objek masih dapat berdiri sendiri. Contohnya, hubungan antara ProductService dan ProductDAO. Composition adalah hubungan kuat, di mana objek tidak dapat berdiri tanpa induknya, contohnya Transaction dan TransactionDetail.

2. Bagaimana prinsip Open/Closed dapat memastikan sistem mudah dikembangkan?
   **Jawaban:**
   Prinsip Open/Closed memungkinkan penambahan fitur baru melalui subclass atau implementasi interface tanpa mengubah kode lama, misalnya menambah metode pembayaran baru dengan membuat class baru yang mengimplementasikan PaymentMethod.

3. Mengapa Dependency Inversion Principle (DIP) meningkatkan testability? Berikan contoh penerapannya.
   **Jawaban:**
   DIP membuat kelas bergantung pada abstraksi, sehingga mudah dilakukan mock saat pengujian. Contohnya, ProductService menggunakan interface ProductDAO sehingga dapat diuji dengan DAO palsu (mock) tanpa database asli.
