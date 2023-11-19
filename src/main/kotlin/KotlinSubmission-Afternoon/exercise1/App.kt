package id.infinitelearning.KotlinSubmission.exercise1

import com.sun.org.apache.xpath.internal.functions.FuncFalse

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan: String = "Gina"
    val namaBelakang: String = "Salma Sabilla"
    val umur: Int = 20
    val status: Boolean = true
    println("""
        Nama Depan: $namaDepan
        Nama Belakang: $namaBelakang
        Umur: $umur tahun
        Status: ${if (status) "Single" else "Tidak Single"}
    """.trimIndent())
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String) {
    println("Group ID: $groupId")
    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }
    println("Session: $session")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<String> {
    val team = listOf("Gina Salma Sabilla", "Ahmad Maulana", "Alysa Syakirah", "Syauqillah Hadie Ahsana", "Dariwan")
    return team
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Kelvin", "Kak Shania", "Kak Iffan")
    val countOfGroup = myTeam().size
    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("1", myTeam, "Afternoon")

}