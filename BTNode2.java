// Deklarasi kelas generik BTNode2 yang merupakan simpul dalam pohon biner
class BTNode2<E>{
    BTNode2 left, right; // Menyimpan referensi ke simpul kiri dan kanan
    E data; // Menyimpan data pada simpul

    /* Constructor tanpa parameter */
    public BTNode2() {
        // Inisialisasi simpul kiri, kanan, dan data menjadi null
        left = null;
        right = null;
        data = null;
    }

    /* Constructor dengan parameter data */
    public BTNode2(E item) {
        // Inisialisasi simpul kiri, kanan menjadi null dan data dengan nilai yang diberikan
        left = null;
        right = null;
        data = item;
    }

    /* Fungsi untuk mengatur simpul kiri */
    public void setLeft(BTNode2 n) {
        // Menetapkan simpul kiri dengan simpul yang diberikan
        left = n;
    }

    /* Fungsi untuk mengatur simpul kanan */
    public void setRight(BTNode2 n) {
        // Menetapkan simpul kanan dengan simpul yang diberikan
        right = n;
    }

    /* Fungsi untuk mendapatkan simpul kiri */
    public BTNode2 getLeft() {
        // Mengembalikan simpul kiri dari simpul saat ini
        return left;
    }

    /* Fungsi untuk mendapatkan simpul kanan */
    public BTNode2 getRight() {
        // Mengembalikan simpul kanan dari simpul saat ini
        return right;
    }

    /* Fungsi untuk mengatur data pada simpul */
    public void setData(E d) {
        // Menetapkan data pada simpul saat ini dengan data yang diberikan
        data = d;
    }

    /* Fungsi untuk mendapatkan data dari simpul */
    public E getData() {
        // Mengembalikan data dari simpul saat ini
        return data;
    }
}
