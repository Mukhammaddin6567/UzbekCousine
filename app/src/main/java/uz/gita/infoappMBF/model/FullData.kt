package uz.gita.infoappMBF.model

data class FullData(
    val id: Int,
    val title: String,
    val description: String,
    val ingredients: String,
    val methods: String,
    val photo_main: Int,
    val photo_secondary: Int
)