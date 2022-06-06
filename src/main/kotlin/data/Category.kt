package data

enum class CategoryType : Category {
    KIDS {
        override fun description() = "Questions for kids"
    },
    TURKEY {
        override fun description() = "Questions about Turkey"
    },
    ADULT {
        override fun description() = "Questions for adults"
    },
}


interface Category {
    fun description(): String
}
