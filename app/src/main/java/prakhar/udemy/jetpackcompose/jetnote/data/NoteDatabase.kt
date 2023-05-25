package prakhar.udemy.jetpackcompose.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import prakhar.udemy.jetpackcompose.jetnote.model.Note
import prakhar.udemy.jetpackcompose.jetnote.util.DateConverter
import prakhar.udemy.jetpackcompose.jetnote.util.UUIDConverter


@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}