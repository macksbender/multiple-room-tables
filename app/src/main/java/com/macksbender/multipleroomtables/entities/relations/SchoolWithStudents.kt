package com.macksbender.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.macksbender.multipleroomtables.entities.School
import com.macksbender.multipleroomtables.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)