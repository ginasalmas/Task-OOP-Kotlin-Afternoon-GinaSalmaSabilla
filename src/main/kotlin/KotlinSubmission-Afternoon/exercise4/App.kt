package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        val numbers = arrayOf(1, 2, 3, 4, 5)
        val index = 10
        val value = numbers[index]
        println("Nilai pada indeks $index: $value")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Terjadi kesalahan indeks array: ${e.message}")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
