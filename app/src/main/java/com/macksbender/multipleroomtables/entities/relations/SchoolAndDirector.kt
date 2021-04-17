package com.macksbender.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.macksbender.multipleroomtables.entities.Director
import com.macksbender.multipleroomtables.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)