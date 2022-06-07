package data

val questions = listOf(
    Question(" What’s the name of a place you go to see lots of animals?", "The zoo", CategoryType.KIDS),
    Question("Whose nose grew longer every time he lied?", "Pinocchio", CategoryType.KIDS),
    Question("If you freeze water, what do you get?", "Ice", CategoryType.KIDS),
    Question("What is the name of the strategic waterway that traverses Turkey’s largest city and separates Europe from Asia?", "The Bosporus", CategoryType.TURKEY),
    Question("What does the Greek word “Bosporos” mean?", "The Cow Strait", CategoryType.TURKEY),
    Question("What is the national flower of Turkey?", "Tulip", CategoryType.TURKEY),
    Question("What is the largest lake in Turkey?", "Lake Van", CategoryType.TURKEY),
    Question("Area 51 is located in which US state?", "Nevada", CategoryType.ADULT),
    Question("Which American president appears on a one-dollar bill?", "George Washington", CategoryType.ADULT),
    Question("What is the name of Poland in Polish?", "Polska", CategoryType.ADULT),

)

val categories = listOf(
    CategoryType.KIDS,
    CategoryType.TURKEY,
    CategoryType.ADULT,
)
